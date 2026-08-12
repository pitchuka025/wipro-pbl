<!DOCTYPE html>
<html>
<head>
    <title>Page 2</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #e3f2fd;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 500px;
        }
        h1 {
            color: #1565c0;
        }
        .content {
            background-color: #bbdefb;
            padding: 20px;
            border-left: 4px solid #1565c0;
            border-radius: 4px;
            margin: 20px 0;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #2196F3;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        a:hover {
            background-color: #0b7dda;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>✓ Page 2 - SUCCESS</h1>
        <div class="content">
            <p><strong>Message:</strong> <%= request.getAttribute("message") %></p>
            <p><strong>Your Input:</strong> <%= request.getAttribute("value") %></p>
            <p><strong>Status:</strong> Input is between 10 and 99</p>
        </div>
        <p>This is <strong>Page 2</strong> - Displayed because your input was between 10 and 99.</p>
        <a href="assignment2_q.html">Go Back</a>
    </div>
</body>
</html>
