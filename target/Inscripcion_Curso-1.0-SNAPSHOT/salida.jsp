<%@page import="com.emergentesII.Inscripcion"%>
<%
    Inscripcion inscri = (Inscripcion) request.getAttribute("inscri");
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Gracias por Inscribirte</h1>
        <p>Su nombre es : <%= inscri.getNombre() %></p>
        <p>Su apellido es : <%= inscri.getApellidos() %></p>
        
        <p>El curso en el que se inscribio es : </p>
        <ul>
            <%
              String curso[] = inscri.getCurso();
              
               if(curso != null)
               {
                   for(int i=0;i<curso.length; i++)
                   {
                       
                
            %>
            <li><%= curso[i] %></li>
            <%
                }
               }   
            %>
        </ul>
        <br>
        <a href="index.jsp">Volver al Inicio</a>
    </body>
</html>
