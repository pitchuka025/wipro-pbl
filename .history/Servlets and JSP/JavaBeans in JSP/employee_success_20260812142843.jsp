<!DOCTYPE html>
<html>
<head>
    <title>Employee Added Successfully</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #e8f5e9;
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
            color: #2e7d32;
            text-align: center;
        }
        .success-message {
            background-color: #c8e6c9;
            padding: 20px;
            border-left: 4px solid #2e7d32;
            border-radius: 4px;
            margin: 20px 0;
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
        <h1>✓ Success</h1>
        <div class="success-message">
            <p><strong><%= request.getAttribute("success") %></strong></p>
        </div>
        
        <h3>Employee Details:</h3>
        <table>
            <tr>
                <th>Field</th>
                <th>Value</th>
            </tr>
            <tr>
                <td>Name</td>
                <td><%= request.getAttribute("name") %></td>
            </tr>
            <tr>
                <td>ID</td>
                <td><%= request.getAttribute("id") %></td>
            </tr>
            <tr>
                <td>Designation</td>
                <td><%= request.getAttribute("designation") %></td>
            </tr>
        </table>
        
        <a href="assignment3.html">Add Another Employee</a>
        <a href="DisplayEmployeeServlet" style="background-color: #2196F3; margin-left: 10px;">View All Employees</a>
    </div>
</body>
</html>
