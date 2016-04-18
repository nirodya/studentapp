/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.javainstitute.studentclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.edu.javainstitute.studentclient.db.Connection;
import lk.edu.javainstitute.studentclient.db.Subject;
import lk.edu.javainstitute.studentclient.db.Year;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Nirodya
 */
@WebServlet(name = "GetSubjects", urlPatterns = {"/GetSubjects"})
public class GetSubjects extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String yid=request.getParameter("yid");
            if(yid!=null){
                Session s=Connection.getSessionFactory().openSession();
                Criteria c=s.createCriteria(Subject.class);
                Year y=(Year) s.load(Year.class, Integer.parseInt(yid));
                c.add(Restrictions.eq("year", y));
                List<Subject> subjects=c.list();
                JSONArray array=new JSONArray();
                for (Subject subject : subjects) {
                    JSONObject jSONObject=new JSONObject();
                    try {
                        jSONObject.put("sid", subject.getIdsubject());
                        jSONObject.put("subject", subject.getSubject());
                        array.put(jSONObject);
                    } catch (JSONException ex) {
                        Logger.getLogger(GetSubjects.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println(array.toString());
                out.write(array.toString());
            }else{
                out.write("Bad Request");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
