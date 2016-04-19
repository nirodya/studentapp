/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import org.hibernate.Session;

/**
 *
 * @author Nirodya Gamage (ACTOP Technologies)
 */
public class CloseHibSession extends TagSupport{
    Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public int doStartTag() throws JspException {
        
        session.close();
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
