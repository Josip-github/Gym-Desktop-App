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
    
    
    
}