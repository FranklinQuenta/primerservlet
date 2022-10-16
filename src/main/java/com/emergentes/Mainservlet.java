
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Mainservlet", urlPatterns = {"/Mainservlet"})
public class Mainservlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        //tipo de documento a devolver
        response.setContentType("text/html;charset=UTF8");
        //obtener un canal de salida para el texto
        PrintWriter salida = response.getWriter();
        //se imprime el html como cadena de texto
        salida.println("<!DOCTYPE html>");
        salida.println("<html>");
        salida.println("<head>");
        salida.println("<title>Primer servlet</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<h1>Hola "+nombre +" binvenido a mi pagina</h1>");
        salida.println("</body>");
        salida.println("</html>");

    }
}
