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
         memberChooseController();
         courseChooseController();
        priceController();
        dateController();
       
    }

    @Override
    protected void updateController() throws GymException {
        priceController();
        courseChooseController();
        dateController();
        memberChooseController();
    }

    @Override
    protected void deleteController() throws GymException {
        
    }
    
    private void priceController() throws GymException{
        
        if(entity.getPrice() == null){
            throw new GymException("There has to be a price for a course");
        }
        
        if(entity.getPrice().compareTo(BigDecimal.ZERO) < 0){
            throw new GymException("Price can't be less than zero.");
        }
    }
    
    private void courseChooseController() throws GymException {
        if(entity.getCourse().getId()==0){
            throw new GymException("You have to choose a course");
        }
    }
    
    private void dateController() throws GymException{
        if(entity.getDateOfBegin() == null || entity.getDateOfEnd() == null){
            throw new GymException("You have to choose dates");
        }
    }
    
    private void memberChooseController() throws GymException{
        if(entity.getMember() == null){
            throw new GymException("You can't create a membership without a member.");
        }
    }
}
