/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.util;

import com.github.javafaker.Faker;
import hr.edunova.gym.model.Course;
import hr.edunova.gym.model.Employee;
import hr.edunova.gym.model.Member;
import hr.edunova.gym.model.Membership;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;

/**
 *
 * @author Vlasnik
 */
public class InitialInsert {
    
    public static int getRandomNumber(int min, int max){
        return (int)((Math.random() * (max - min)) + min);
    }
    
    public static void insertDataIntoDatabase(){
        
        Random random = new Random();
        
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        List<Course> courses = new ArrayList<>();
        
        Course course1 = new Course();
        course1.setName("General");
        course1.setPrice(new BigDecimal(99.99));
        course1.setDuration(30);
        s.save(course1);
        courses.add(course1);
        
        Course course2 = new Course();
        course2.setName("Fitness Group");
        course2.setPrice(new BigDecimal(99.99));
        course2.setDuration(30);
        s.save(course2);
        courses.add(course2);
        
        Course course3 = new Course();
        course3.setName("Personal trainer");
        course3.setPrice(new BigDecimal(99.99));
        course3.setDuration(30);
        s.save(course3);
        courses.add(course3);
        
        Course course4 = new Course();
        course4.setName("Kardio");
        course4.setPrice(new BigDecimal(99.99));
        course4.setDuration(30);
        s.save(course4);
        courses.add(course4);
        
        Course course5 = new Course();
        course5.setName("Physiotherapy");
        course5.setPrice(new BigDecimal(99.99));
        course5.setDuration(30);
        s.save(course5);
        courses.add(course5);
        
        Faker faker = new Faker();
        Employee employee;
        List<Employee> employees = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            employee = new Employee();
            String fakerFirstname = faker.name().firstName();
            employee.setFirstname(fakerFirstname);
            String fakerLastname = faker.name().lastName();
            employee.setLastname(fakerLastname);
            employee.setOib(GeneratingOib.getOIB());
            employee.setEmail(fakerFirstname.substring(0, 1) + fakerLastname + "@gmail.com");
            s.save(employee);
            employees.add(employee);
        }
        
        Member member;
        List<Member> members = new ArrayList<>();
        
        for(int i = 0; i < 30; i++){
            member = new Member();
            String fakerFirstname = faker.name().firstName();
            member.setFirstname(fakerFirstname);
            String fakerLastname = faker.name().lastName();
            member.setLastname(fakerLastname);
            member.setOib(GeneratingOib.getOIB());
            member.setEmail(fakerFirstname.substring(0, 1) + fakerLastname + "@gmail.com");
            s.save(member);
            members.add(member);
        }
        
        Membership membership;
        Date begindate = new Date();
        Date endDate = new Date();
        
        for(int i = 0; i < 50; i++){
            membership = new Membership();
            membership.setCourse(courses.get(getRandomNumber(0, courses.size())));
            membership.setMember(members.get(getRandomNumber(0, members.size())));
            membership.setDateOfBegin(begindate);
            membership.setDateOfEnd(endDate);
            membership.setPrice(new BigDecimal(getRandomNumber(80, 600)));
            membership.setPayment(random.nextBoolean());
            s.save(membership);
        }
        
        s.getTransaction().commit();
        
        
    }
    
}
