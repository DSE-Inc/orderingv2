<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.learn.mycart.entities.User"%>
<%
    User user1 = (User)session.getAttribute("current-user");



%>


<nav class="navbar navbar-expand-lg navbar-dark custom-bg">
    <div class="container">
        <a class="navbar-brand" href="home.jsp">DSE Portal</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
      <ul class="navbar-nav ml-auto">
          
      <li class="nav-item active">
        <a class="nav-link" href="admin.jsp">Admin <span class="sr-only">(current)</span></a>
      </li>
          
          <li class="nav-item active">
              <a class="nav-link" href="#" data-toggle="modal" data-target="#cart"><i class="fa fa-cart-plus" style="  color: gold"></i> <span class="ml-2 cart-items"> ( 0 ) </span> </a>
          </li>
                 
          
          
          <%
              if(user1==null)
              {
          %>
                   <li class="nav-item active">
                    <a class="nav-link" href="login.jsp">Login </a>
                   </li>
      
                   
                  
           <%
              }
              else
              {
           %>     
            <li class="nav-item active">
                <a class="nav-link" href="#!"><%= user1.getUserName()%> </a>
            </li>
      
            <li class="nav-item active">
                <a class="nav-link" href="#">Logout </a>
            </li>
           
           <%      
              }
           %>
          
         
      </ul>
    <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search"  aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="searchFunction()">Search</button>
    </form>
  </div>
    </div>
</nav>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style type="text/css">.custom-bg{
    background:#000051!important;
}

.admin .card{
    
    border: 1px gold;
}

.admin .card:hover{
    
    background: #e2e2e2;
    cursor: pointer;
}
.list-group-item.active{
    background:#000051!important;
    border-color:#000051!important;
}
.discount-label{
    
    background-color: white;
    text-decoration: line-through;
}
.product-card:hover{
    background: #e2e2e2;
    cursor: pointer;
}
.users .row{
    margin-right: 2em;
}

#myTable tr.header, #myTable tr:hover {
  /* Add a grey background color to the table header and on hover */
  background-color: #f1f1f1;
}</style>
<title>DSE Portal</title>
</head>
<body>
<div class="container-fluid">
</div>
</body>
</html>