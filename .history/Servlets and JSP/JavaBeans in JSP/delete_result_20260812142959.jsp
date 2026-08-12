<!DOCTYPE html>
<html>
<head>
    <title>Delete Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #f5f5f5;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 500px;
            margin: 0 auto;
        }
        h1 {
            text-align: center;
        }
        .message {
            padding: 20px;
            border-left: 4px solid;
            border-radius: 4px;
            margin: 20px 0;
        }
        .success {
            background-color: #c8e6c9;
            border-color: #2e7d32;
            color: #2e7d32;
        }
        .error {
            background-color: #ffcdd2;
            border-color: #c62828;
            color: #c62828;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <%
            String type = (String) request.getAttribute("type");
            String message = (String) request.getAttribute("message");
            
            String className = type != null && type.equals("success") ? "success" : "error";
        %>
        
        <h1><%= type != null && type.equals("success") ? "✓ Success" : "✗ Error" %></h1>
        
        <div class="message <%= className %>">
            <strong><%= message %></strong>
        </div>
        
        <a href="DisplayEmployeeServlet">Back to Employee List</a>
    </div>
</body>
</html>
