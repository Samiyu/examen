/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "ServletOperacionesAritmeticas", urlPatterns = {"/OperacionesAritmeticas"})
public class OperacionesAritmeticas extends HttpServlet {

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
        String btnContinuar = request.getParameter("btnContinuar");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>OperacionesAritmeticas</title>");
            out.println("</head>");
            out.println("<body>");
            String op = request.getParameter("rbtOp");
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int res;
            
            try {
                if (btnContinuar != null) {
                    if (op.equals("Suma")) {
                        res = num1 + num2;
                        out.println("La respuesta de ");
                        out.println(num1 + " + " + num2 + " es: " + res);
                    }
                    if (op.equals("Resta")) {
                        res = num1 - num2;
                        out.println("La respuesta de ");
                        out.println(num1 + " - " + num2 + " es: " + res);
                    }
                    if (op.equals("Multiplicacion")) {
                        res = num1 * num2;
                        out.println("La respuesta de ");
                        out.println(num1 + " * " + num2 + " es: " + res);
                    }
                    if (op.equals("Division")) {
                        res = num1 / num2;
                        out.println("La respuesta de ");
                        out.println(num1 + " / " + num2 + " es: " + res);
                    }
                }
                }
                catch(Exception e){
                    out.println("No ha seleccionado ninguna opcion");
                }
            out.println("<form action=\"index.html\" method=\"POST\">"
                    + "<input type=\"submit\" value=\"Volver\"/>"
                    + "</form>");

            out.println("</body>");
            out.println("</html>");
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
