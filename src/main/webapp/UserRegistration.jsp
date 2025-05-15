
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>Registration Page</title>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="mymenu">
<ul>
<li> Home</li>
<li id="link"> <a href="login.jsp" > LogIn </a>
<li> <a href="userRegistration.jsp" id="link"> Registration </a>
<li> About</li>
<li> Contact</li>
</ul>
</div>

<center>
<div id="mydata">

<form action="/register" method="post">
<table cellpadding="12" cellspacing="12">
 <tr>
      <td> Enter Id</td>
      <td> <input type="text" class="A" name="id" placeholder="Enter id" ></td>
    </tr>

    <tr>
      <td> Enter Name </td>
      <td> <input type="text" class="A" name="name" placeholder="Enter name" ></td>
    </tr>

    <tr>
      <td> Enter User Name </td>
      <td> <input type="text" class="A" name="userName" placeholder="Enter User name" ></td>
    </tr>

    <tr>
      <td> Enter Password </td>
      <td> <input type="password" class="A" name="password" placeholder="Enter Password" >    </td>
    </tr>
    
     <tr>
      <td colspan="2" align="center"><input type="submit" value="register"></td>
    </tr>
</table>
</form>
</div>
</center>

</body>
</html>
