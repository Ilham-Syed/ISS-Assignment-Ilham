<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String user = (String) session.getAttribute("username");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .welcome-container {
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            width: 320px;
            text-align: center;
            border: 1px solid #ccc;
        }

        .welcome-container h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .logout-button {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            font-weight: bold;
            cursor: pointer;
        }

        .logout-button:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h2>Welcome, <%= user %>!</h2>
        <form action="logout" method="post">
            <button class="logout-button" type="submit">Logout</button>
        </form>
    </div>
</body>
</html>
