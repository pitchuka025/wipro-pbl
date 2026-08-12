<!DOCTYPE html>
<html>
<head>
    <title>Error Adding Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #ffebee;
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
            color: #c62828;
            text-align: center;
        }
        .error-message {
            background-color: #ffcdd2;
            padding: 20px;
            border-left: 4px solid #c62828;
            border-radius: 4px;
            margin: 20px 0;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #f44336;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        a:hover {
            background-color: #da190b;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>✗ Error</h1>
        <div class="error-message">
            <p><strong><%= request.getAttribute("error") %></strong></p>
            <p>Please check your database connection and try again.</p>
        </div>
        
        <a href="assignment3.html">Go Back to Form</a>
    </div>
</body>
</html>
