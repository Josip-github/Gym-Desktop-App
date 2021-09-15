/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.controller;

import hr.edunova.gym.util.GymException;
import hr.edunova.gym.util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author Vlasnik
 */
public abstract class Controller<T> {
    
    protected Session session;
    protected T entity;
    
    public abstract List<T> read();
    protected abstract void createController() throws GymException;
    protected abstract void updateController() throws GymException;
    protected abstract void deleteController() throws GymException;
    
    public Controller(){
        this.session = HibernateUtil.getSession();
    }
    
    public T create() throws GymException{
        createController();
        save();
        return entity;
    }
    
    public T update() throws GymException{
        updateController();
        save();
        return entity;
    }
    
    public void delete() throws GymException{
        deleteController();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    private void save() {
      session.beginTransaction();
      session.save(entity);
      session.getTransaction().commit();
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
    
    
}
