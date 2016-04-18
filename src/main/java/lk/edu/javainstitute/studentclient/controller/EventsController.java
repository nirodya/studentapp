/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient.controller;

import lk.edu.javainstitute.studentclient.db.Connection;
import lk.edu.javainstitute.studentclient.db.Events;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nirodya
 */
public class EventsController {
    public void saveEvent(String eventName, String eventDesc){
        Events e=new Events(eventName, eventDesc);
        Session s=Connection.getSessionFactory().openSession();
        Transaction t=s.beginTransaction();
        s.save(e);
        t.commit();
        s.close();
    }
}
