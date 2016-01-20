<%-- 
    Document   : index
    Created on : 18/01/2016, 02:54:44 PM
    Author     : Hector Mamani CC
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <%
    HttpSession sesion =request.getSession();
    String strError = (String)session.getAttribute("strError");
    
    if(strError !=null && strError.equals(""))
    {
    out.println("<script>alert('"+strError+"');</script>");
    }
    
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>AJAX JSP Servelts</title>
        <script src="http://code.jquery.com/jquery-latest.js">

        </script>
        
        <script>
            $(document).ready(function () {
                listar()// When the HTML DOM is ready loading, then execute the following function...
                function listar() {
                    $.ajax({
                        url: "TuMama",
                        type: "post",
                        data: "opc=list",
                        success:function(d){
                        alert(d);
                        console.log(d);
                    }
                });
                 
            }});
        </script>
    </head>
    <body>
        
            
      
    </body>
</html>