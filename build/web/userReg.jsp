<%-- 
    Document   : userReg
    Created on : Feb 24, 2023, 1:23:34 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UserRegistration</title>
    </head>
    <body>
           <input type="hidden" id="status" value="<%=request.getAttribute("status") %>">
                
              <form action="userReg" method="post">
               <center>
 
       <h1>User Registration</h1>
       
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required></br><br>

    <label for="email"><b>Email&ensp;&ensp;&ensp;</b></label>
    <input type="text" placeholder="Enter Email" name="email" required><br><br>
    
    <label for="Contact"><b>Mobile&ensp;&ensp;</b></label>
    <input type="text" placeholder="Enter Mobile" name="mobile" required></br><br>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required></br><br>
        
    <button type="submit">Register</button>&ensp;&ensp;<button  type="reset" class="cancelbtn">Cancel</button>
    <label><br>
      <input type="checkbox" checked="checked" name="remember"> Remember me&ensp;&ensp;  <a href="userlog.jsp">Sign-In</a>
    
    </label>
        
 
       </center>
     
</form>
            </div>
        </div>
    </body>
</html>
