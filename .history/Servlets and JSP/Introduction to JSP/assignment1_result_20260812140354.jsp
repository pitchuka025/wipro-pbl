<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Prime Numbers Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        table {
            border-collapse: collapse;
            margin-top: 20px;
            width: 400px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .container {
            background-color: #f0f0f0;
            padding: 20px;
            border-radius: 5px;
        }
        a {
            display: block;
            margin-top: 20px;
            color: #4CAF50;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Prime Numbers Less Than <%= request.getAttribute("inputNumber") %></h1>
        
        <%
            ArrayList<Integer> primes = (ArrayList<Integer>) request.getAttribute("primeList");
            
            if (primes != null && primes.size() > 0) {
        %>
        <table>
            <tr>
                <th>Prime Numbers</th>
            </tr>
            <%
                for (Integer prime : primes) {
            %>
            <tr>
                <td><%= prime %></td>
            </tr>
            <%
                }
            %>
        </table>
        <p><strong>Total Prime Numbers Found: <%= primes.size() %></strong></p>
        
        <%
            } else {
        %>
        <p>No prime numbers found less than the given number.</p>
        <%
            }
        %>
        
        <a href="assignment1.html">Go Back</a>
    </div>
</body>
</html>
