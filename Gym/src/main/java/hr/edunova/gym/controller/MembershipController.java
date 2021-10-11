/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Membership;
import hr.edunova.gym.util.GymException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Vlasnik
 */
public class MembershipController extends Controller<Membership> {

    @Override
    public List<Membership> read() {
        return session.createQuery("from Membership").list();
    }

    @Override
    protected void createController() throws GymException {
        priceController();
    }

    @Override
    protected void updateController() throws GymException {
        
    }

    @Override
    protected void deleteController() throws GymException {
        
    }
    
    private void priceController() throws GymException{
        
        if(entity.getPrice().equals(null)){
            throw new GymException("There has to be a price for a course");
        }
        
        if(entity.getPrice().compareTo(BigDecimal.ZERO) < 0){
            throw new GymException("Price can't be less than zero.");
        }
    }
}
