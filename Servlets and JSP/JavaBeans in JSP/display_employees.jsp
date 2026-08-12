<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Employees</title>
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
            max-width: 800px;
            margin: 0 auto;
        }
        h1 {
            color: #333;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .btn-container {
            display: flex;
            gap: 10px;
        }
        .btn-delete, .btn-update {
            padding: 5px 10px;
            text-decoration: none;
            border-radius: 4px;
            color: white;
            font-size: 12px;
        }
        .btn-delete {
            background-color: #f44336;
        }
        .btn-delete:hover {
            background-color: #da190b;
        }
        .btn-update {
            background-color: #2196F3;
        }
        .btn-update:hover {
            background-color: #0b7dda;
        }
        .back-btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .back-btn:hover {
            background-color: #45a049;
        }
        .no-data {
            text-align: center;
            padding: 20px;
            color: #666;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>All Employees</h1>
        
        <%
            ResultSet rs = (ResultSet) request.getAttribute("employeeList");
            
            if (rs != null && rs.next()) {
                // Reset cursor to beginning
                rs.beforeFirst();
        %>
        
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Actions</th>
            </tr>
            <%
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String designation = rs.getString("designation");
            %>
            <tr>
                <td><%= id %></td>
                <td><%= name %></td>
                <td><%= designation %></td>
                <td>
                    <div class="btn-container">
                        <a class="btn-update" href="EditEmployeeServlet?id=<%= id %>">Edit</a>
                        <a class="btn-delete" href="DeleteEmployeeServlet?id=<%= id %>" onclick="return confirm('Are you sure?')">Delete</a>
                    </div>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        
        <%
            } else {
        %>
        <div class="no-data">
            <p>No employees found in the database.</p>
        </div>
        <%
            }
        %>
        
        <a class="back-btn" href="assignment3.html">Add New Employee</a>
    </div>
</body>
</html>
