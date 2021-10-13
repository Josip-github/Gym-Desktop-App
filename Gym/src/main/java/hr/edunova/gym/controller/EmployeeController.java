/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Employee;
import hr.edunova.gym.util.GymException;
import java.util.List;
import org.apache.commons.validator.routines.IBANValidator;

/**
 *
 * @author Vlasnik
 */
public class EmployeeController extends PersonController<Employee> {

    @Override
    public List<Employee> read() {
        return session.createQuery("from Employee").list();
    }

    @Override
    protected void createController() throws GymException {
        super.createController(); 
        //ibanController();
        
        
    }

    @Override
    protected void updateController() throws GymException {
        super.updateController(); //To change body of generated methods, choose Tools | Templates.
        //ibanController();
    }
    
    
    
    @Override
    protected void deleteController() throws GymException {
        
    }

    /*private void ibanController() throws GymException {
        IBANValidator ibanValidator = new IBANValidator();
        ibanValidator.setValidator("HR", 21, "HR");
        if(!ibanValidator.isValid(entity.getIban())){
            throw new GymException("IBAN nije valjan");
        }
    }*/
    
}
