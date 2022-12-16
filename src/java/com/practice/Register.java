/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author suraj dudhabhate
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw;
        response.setContentType("text/html");
        pw=response.getWriter();
        
        
       String stud_id=request.getParameter("id");
       String name=request.getParameter("sname");
       String Password=request.getParameter("pass");
       String email=request.getParameter("email");
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
                //query
                
                String q="insert into register(stud_id,name,Password,email) values(?,?,?,?);";
                
               PreparedStatement pstmt=con.prepareStatement(q);
               pstmt.setString(1,stud_id);
               pstmt.setString(2,name);
               pstmt.setString(3,Password);
               pstmt.setString(4,email);
              
               
               pstmt.executeUpdate();
               
               
            
//            if(x == 1)
//            {
//                pw.println("Data Submitted Sucessfully.........");
//            }
               pw.println("done");
       }
        catch(Exception e){
                e.printStackTrace();
                pw.println("<h1>error</h1>");
                
            }
       
    }

    
}

