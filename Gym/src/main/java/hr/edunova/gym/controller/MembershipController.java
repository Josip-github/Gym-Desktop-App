/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Membership;
import hr.edunova.gym.util.GymException;
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
        
    }

    @Override
    protected void updateController() throws GymException {
        
    }

    @Override
    protected void deleteController() throws GymException {
        
    }
    
}
