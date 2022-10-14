<%-- 
    Document   : felino
    Created on : 14/10/2022, 6:21:26 p. m.
    Author     : Marlon gonzalez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@page import="b.Felino" %>
        <%@page import="b.Animal" %>
         <%@page import="b.Veterinario" %> 
      <%   
         Veterinario c=new Veterinario();
        String nombre=request.getParameter("nombre");
        String raza=request.getParameter("raza");
        String color=request.getParameter("color");
        String edad=request.getParameter("edad");
        String toxoplasmosis=request.getParameter("toxoplasmosis");
    
        Felino k=new Felino(nombre, raza, color, edad, toxoplasmosis);
        c.registrar(k);
        out.println(k.listarDatos());
         %>
    </body>
</html>
