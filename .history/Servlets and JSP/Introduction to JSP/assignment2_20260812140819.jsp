<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat datetimeFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
    
    String date = dateFormat.format(now);
    String time = timeFormat.format(now);
    String datetime = datetimeFormat.format(now);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date and Time</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #f5f5f5;
        }
        .container {
            background-color: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 500px;
            text-align: center;
        }
        h1 {
            color: #333;
        }
        .info {
            background-color: #e3f2fd;
            padding: 20px;
            border-left: 4px solid #2196F3;
            margin: 20px 0;
            border-radius: 4px;
        }
        .datetime {
            font-size: 24px;
            font-weight: bold;
            color: #2196F3;
            margin: 10px 0;
        }
        .label {
            color: #666;
            font-size: 14px;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Current Date and Time</h1>
        
        <div class="info">
            <div class="label">Date:</div>
            <div class="datetime"><%= date %></div>
            
            <div class="label">Time:</div>
            <div class="datetime"><%= time %></div>
            
            <div class="label">Full DateTime:</div>
            <div class="datetime"><%= datetime %></div>
        </div>
    </div>
</body>
</html>
