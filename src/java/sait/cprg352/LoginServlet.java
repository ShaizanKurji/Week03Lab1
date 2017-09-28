/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import domain_classes.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author 715060
 */
public class LoginServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/loginjsp.jsp").forward(request, response);
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
      String message =""; 
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      
       User user = new User();
       user.setUsername(username);
       user.setPassword(password);
       
      if(username == null || password == null || username.equals("") || password.equals("")){
      
            request.setAttribute("validateMessage", "Both values are required!");
      getServletContext().getRequestDispatcher("/WEB-INF/loginjsp.jsp").forward(request, response);
      }
      else{
         
         
          
          
          UserService userService = new UserService();
         
          
           if(userService.login(username, password)){
              
                 request.setAttribute("username", username);
                 
                 getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            }
           else{
                    
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                 request.setAttribute("validateMessage", "Invalid username or password!");
      getServletContext().getRequestDispatcher("/WEB-INF/loginjsp.jsp").forward(request, response);
           }
      
      }     
    }

}
