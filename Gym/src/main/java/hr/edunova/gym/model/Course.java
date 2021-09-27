/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Vlasnik
 */
@Entity
public class Course extends Instance{
    
    private String name;
    
    private BigDecimal price;
    
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course: " + name;
    }

    
    
    
    
}
