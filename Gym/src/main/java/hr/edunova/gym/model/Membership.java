/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Vlasnik
 */
@Entity
public class Membership extends Instance {
    
    @ManyToOne
    private Course course;
    
    @ManyToOne
    private Member member;
    
    private Date dateOfBegin;
    
    private Date dateOfEnd;
    
    private BigDecimal price;
    
    private Boolean payment;
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(Date dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    


    
    
    
    
    
}
