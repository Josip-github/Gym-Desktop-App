/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.util;

/**
 *
 * @author Vlasnik
 */
public class GymException extends Exception {
    
    private String message;
    
    public GymException(String message){
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    
    
    
}
