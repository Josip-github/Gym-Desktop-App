/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Course;
import hr.edunova.gym.util.GymException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Vlasnik
 */
public class CourseController extends Controller<Course> {

    @Override
    public List<Course> read() {
        return session.createQuery("from Course").list();
    }

    @Override
    protected void createController() throws GymException {
       nameController();
       priceController();
       durationController();
    }

    @Override
    protected void updateController() throws GymException {
        
    }

    @Override
    protected void deleteController() throws GymException {
        
    }

    private void nameController() throws GymException {
       
        if(entity.getName().equals(null) || entity.getName().trim().length()==0){
           throw new GymException("Name of course can't be empty.");
       }
       
       if(entity.getName().length() > 50){
           throw new GymException("Name of course can't have more than 50 characters.");
       }
    }

    private void priceController() throws GymException {
        
        if(entity.getPrice() == null){
            throw new GymException("There has to be a price for a course");
        }
        
        if(entity.getPrice().compareTo(BigDecimal.ZERO) < 0){
            throw new GymException("Price can't be less than zero.");
        }
    }

    private void durationController() throws GymException {
        
        if(entity.getDuration() > 100 || entity.getDuration() < 1){
            throw new GymException("A course can't last more than 100 days or less than 1 day.");
        }
    }
    
}
