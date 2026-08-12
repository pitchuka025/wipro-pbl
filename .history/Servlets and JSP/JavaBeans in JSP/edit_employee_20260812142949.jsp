<%@ page import="com.example.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
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
            width: 450px;
            margin: 0 auto;
        }
        h1 {
            color: #333;
            text-align: center;
        }
        .form-group {
            margin: 15px 0;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }
        button {
            width: 100%;
            padding: 12px;
            background-color: #2196F3;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            font-weight: bold;
            margin-top: 10px;
        }
        button:hover {
            background-color: #0b7dda;
        }
        .back-btn {
            background-color: #666;
            margin-top: 10px;
        }
        .back-btn:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Edit Employee</h1>
        
        <%
            Employee emp = (Employee) request.getAttribute("employee");
            if (emp != null) {
        %>
        
        <form action="EditEmployeeServlet" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" value="<%= emp.getName() %>" required>
            </div>
            
            <div class="form-group">
                <label for="id">ID:</label>
                <input type="number" id="id" name="id" value="<%= emp.getId() %>" readonly required>
            </div>
            
            <div class="form-group">
                <label for="designation">Designation:</label>
                <input type="text" id="designation" name="designation" value="<%= emp.getDesignation() %>" required>
            </div>
            
            <button type="submit">Update Employee</button>
        </form>
        
        <%
            } else {
        %>
        <p style="color: red;">Employee not found!</p>
        <%
            }
        %>
        
        <a href="DisplayEmployeeServlet" class="back-btn" style="display: block; text-align: center; text-decoration: none; color: white; padding: 10px;">Back to List</a>
    </div>
</body>
</html>
