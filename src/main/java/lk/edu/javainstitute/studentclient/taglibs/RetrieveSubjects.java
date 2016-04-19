/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient.taglibs;

import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import lk.edu.javainstitute.studentclient.controller.SubjectsController;
import lk.edu.javainstitute.studentclient.db.Subject;

/**
 *
 * @author Nirodya
 */
public class RetrieveSubjects extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        SubjectsController controller=new SubjectsController();
        List<Subject> subjects=controller.getSubjects();
        pageContext.setAttribute("subjects", subjects);
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
