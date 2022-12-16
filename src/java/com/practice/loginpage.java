/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suraj dudhabhate
 */
@WebServlet(name = "loginpage", urlPatterns = {"/loginpage"})
public class loginpage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter pw;
        response.setContentType("text/html");
        pw=response.getWriter();
        
        String email=request.getParameter("email");
        String Password=request.getParameter("Password");
        
        try
            
            {
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
        
//                PreparedStatement ps=con.prepareStatement("select name from register where email=? and pass=?");
//                
//                ps.setString(4, email);
//                ps.setString(3, pwd);
                Statement ps=con.createStatement();
                
                
                
                ResultSet rs=ps.executeQuery("select * from register where email='"+email+"' and Password='"+Password+"'");
                if(rs.next())
                {
                    response.sendRedirect("welcome.jsp");
           
                }
                else
                {
                    pw.println("<font color=red size=18 aligen-center>Login Faild!!<br>");
                     response.sendRedirect("studlogin.jsp");
        }
           }
        catch(Exception e){
                e.printStackTrace();
                pw.println("<h1>error</h1>");
                }
    }
}


    