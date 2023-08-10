/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author USER
 */
public class SignUp extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

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
        //processRequest(request, response);
        request.getRequestDispatcher("login_signUp.jsp").forward(request, response);
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
        //processRequest(request, response);
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String rePass = request.getParameter("repass");
        String displayName = request.getParameter("displayname");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phonenumber");

        if (!pass.equals(rePass)) {

            request.setAttribute("user", user);
            request.setAttribute("pass", pass);
            request.setAttribute("repass", rePass);
            request.setAttribute("displayname", displayName);
            request.setAttribute("email", email);
            request.setAttribute("phonenumber", phoneNumber);
            request.setAttribute("kq", "Đăng kí tài khoản thất bại");
            request.getRequestDispatcher("login_signUp.jsp").forward(request, response);
        } else {
            AccountDAO dao = new AccountDAO();
            Account a = dao.checkUser(user);
            if (a == null) {
                AccountDAO.signUp(user, pass, displayName, email, phoneNumber);
                response.sendRedirect("login.jsp");
            } else {
                request.setAttribute("user", user);
                request.setAttribute("pass", pass);
                request.setAttribute("repass", rePass);
                request.setAttribute("displayname", displayName);
                request.setAttribute("email", email);
                request.setAttribute("phonenumber", phoneNumber);
                request.setAttribute("kq", "Đăng kí tài khoản thất bại");
                request.getRequestDispatcher("login_signUp.jsp").forward(request, response);
            }
        }

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
