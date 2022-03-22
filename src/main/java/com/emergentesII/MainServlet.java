
package com.emergentesII;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {



   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        String[] curso = request.getParameterValues("curso");
        
        Inscripcion objenc = new Inscripcion();
        
        objenc.setNombre(nombre);
        objenc.setApellidos(apellidos);
        objenc.setCurso(curso);
          
        request.setAttribute("inscri", objenc);
        
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

}
