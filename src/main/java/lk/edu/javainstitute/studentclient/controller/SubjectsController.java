/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient.controller;

import java.util.List;
import lk.edu.javainstitute.studentclient.db.Connection;
import lk.edu.javainstitute.studentclient.db.Subject;
import lk.edu.javainstitute.studentclient.db.Year;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nirodya
 */
public class SubjectsController {
    public List<Subject> getSubjects(){
        Session s=Connection.getSessionFactory().openSession();
        Criteria c=s.createCriteria(Subject.class);
        List<Subject> l=c.list();
        s.close();
        return l;
    }
    public void saveSubject(int yid, String subjectstr){
        Session s=Connection.getSessionFactory().openSession();
        Year y=(Year) s.load(Year.class, yid);
        Transaction t=s.beginTransaction();
        Subject subject =new Subject();
        subject.setSubject(subjectstr);
        subject.setYear(y);
        s.save(subject);
        t.commit();
        s.close();
    }
}
