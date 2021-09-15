/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Person;
import hr.edunova.gym.util.GymException;

/**
 *
 * @author Vlasnik
 */
public abstract class PersonController<T extends Person> extends Controller<T> {

    @Override
    protected void createController() throws GymException{
        oibController();
        firstnameController();
        lastnameController();
        emailController();
    }

    private void oibController() throws GymException {
       if(!oibCorrect(entity.getOib())){
           throw new GymException("Oib is not correct.");
       }
    }

    private boolean oibCorrect(String oib) {
        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
    }

    private void firstnameController() throws GymException {
        
        for(char c: entity.getFirstname().toCharArray()){
           if(!(Character.isLetter(c))){
               throw new GymException("You can't use numbers or characters for a name"
                       + ", only letters are allowed.");
           }
       }
        
       if(entity.getFirstname().equals(null) || entity.getFirstname().trim().length()==0){
           throw new GymException("Name can't be empty.");
       }
       
       if(entity.getFirstname().length() > 50){
           throw new GymException("Name can't have more than 50 characters.");
       }
       
    }

    private void lastnameController() throws GymException {
        
       for(char c: entity.getLastname().toCharArray()){
           if(!(Character.isLetter(c))){
               throw new GymException("You can't use numbers or characters for a name"
                       + ", only letters are allowed.");
           }
       }
        
       if(entity.getLastname().equals(null) || entity.getLastname().trim().length()==0){
           throw new GymException("Name can't be empty.");
       }
       
       if(entity.getLastname().length() > 50){
           throw new GymException("Name can't have more than 50 characters.");
       }
    }

    private void emailController() throws GymException {
       
       if(!(entity.getEmail().contains("@"))){
           throw new GymException("Email has to contain character @");
       }
       
       if(entity.getEmail().length() > 50){
           throw new GymException("Email is too long...");
       }
    }
    
    
    
}