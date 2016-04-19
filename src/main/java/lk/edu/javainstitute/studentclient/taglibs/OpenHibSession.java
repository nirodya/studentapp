/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient.taglibs;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import lk.edu.javainstitute.studentclient.db.Connection;
import org.hibernate.Session;

/**
 *
 * @author Nirodya Gamage (ACTOP Technologies)
 */
public class OpenHibSession  extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        Session s=Connection.getSessionFactory().openSession();
        pageContext.setAttribute("hibsession", s);
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
