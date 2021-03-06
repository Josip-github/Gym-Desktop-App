/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.model.Member;
import hr.edunova.gym.util.GymException;
import java.util.List;

/**
 *
 * @author Vlasnik
 */
public class MemberController extends PersonController<Member> {

    @Override
    public List<Member> read() {
        return session.createQuery("from Member").list();
    }
    
    public List<Member> read (String condition){
        return session.createQuery("from Member m"
                + " where concat(m.firstname,' ', m.lastname) "
                + " like :condition order by m.lastname, m.firstname")
                .setParameter("condition", "%" + condition + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void deleteController() throws GymException {
        
    }
    
}
