<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
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
        }
        h1 {
            color: #c62828;
        }
        .error-content {
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
        <h1>✗ ERROR</h1>
        <div class="error-content">
            <p><strong>Error Message:</strong> <%= request.getAttribute("message") %></p>
            <p><strong>Your Input:</strong> <%= request.getAttribute("value") %></p>
            <p><strong>Status:</strong> Input is 100 or greater - INVALID</p>
        </div>
        <p>This is the <strong>ERROR PAGE</strong> - Displayed because your input was 100 or greater.</p>
        <p>Please enter a number less than 100.</p>
        <a href="assignment2_q.html">Go Back</a>
    </div>
</body>
</html>
