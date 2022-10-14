<%-- 
    Document   : Cli
    Created on : 11/10/2022, 2:29:19 p. m.
    Author     : Marlon gonzalez
--%>

        <%@page import="java.lang.String"%>
<%@page import="b.Canino" %>
        <%@page import="b.Felino" %>
        <%@page import="b.Animal" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Veterinarioa nuestro pequeñin</h1>
        
       
        <%@page import="b.Veterinario" %>
        <% 
         
        Veterinario b=new Veterinario();
          
        String nombre=request.getParameter("nombre");
        String raza=request.getParameter("raza");
        String color=request.getParameter("color");
        String edad=request.getParameter("edad");
        String entreno=request.getParameter("entreno");
         
        Canino p=new Canino(nombre, raza, color, edad, entreno);
        
        b.registrar(p);
        out.println(p.listarDatos());}
       
         
         
        
            
            
           
           %>    
        
    </body>
</html>
