<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>E-MART</title>
    </head>
    <body>
        <h1>Welcome to E-MART</h1>
        <form method="post" action="Search">
            <label for="name">Name of Product</label><br/>
            <input type="text" name="name"/>
            <select name="prodCategory" >
                <option value="none">Select Category</option>
                <option value="Electronics">Electronics</option>
                <option  value="Books">Books</option> 
                <option  value="Movies">Movies</option> 
                <option  value="Food">Food</option>
                <option value="Apparel">Apparel</option> 
                <option  value="Games">Games</option> 
                <option value="Pharmacy">Pharmacy</option> 
            <input type="submit" value="Search"/>
        </form>
    </body>
</html>