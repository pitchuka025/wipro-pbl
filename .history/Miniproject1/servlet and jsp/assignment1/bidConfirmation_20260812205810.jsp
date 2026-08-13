<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bid Confirmation - AP Auctions</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }
        
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
        }
        
        .confirmation-section {
            background-color: #FFFF00;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        .confirmation-section h1 {
            text-align: center;
            font-size: 36px;
            margin-bottom: 30px;
            color: #000;
        }
        
        .message {
            text-align: center;
            font-size: 16px;
            margin-bottom: 30px;
            color: #000;
            line-height: 1.6;
        }
        
        .bid-details {
            margin: 0 auto;
            width: fit-content;
        }
        
        table {
            border-collapse: collapse;
            width: 100%;
            max-width: 400px;
            margin: 0 auto;
        }
        
        .item-header {
            background-color: #000;
            color: #FFFF00;
            padding: 10px;
            font-weight: bold;
            font-size: 18px;
            text-align: center;
            border: 2px solid #000;
        }
        
        tr {
            border: 2px solid #CCCC00;
        }
        
        td {
            padding: 10px;
            border: 1px solid #CCCC00;
            font-size: 14px;
            background-color: #FFFF00;
        }
        
        .label {
            font-weight: bold;
            color: #000;
        }
        
        .value {
            color: #000;
        }
        
        .footer {
            text-align: center;
            margin-top: 30px;
            font-size: 14px;
            color: #666;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="confirmation-section">
            <h1>Bid Submitted</h1>
            
            <div class="message">
                <p>Your bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding.</p>
            </div>
            
            <%
                // Get the bid object from request
                Bid bid = (Bid) request.getAttribute("bid");
                
                if (bid != null) {
                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    String formattedBidAmount = df.format(bid.getBidAmount());
                    String autoIncrementStatus = bid.isAutoIncrement() ? "true" : "false";
            %>
            
            <div class="bid-details">
                <table>
                    <tr>
                        <td colspan="2" class="item-header"><%= bid.getItemName() %></td>
                    </tr>
                    <tr>
                        <td colspan="2"><span class="label">Item ID: </span><span class="value"><%= bid.getItemId() %></span></td>
                    </tr>
                    <tr>
                        <td colspan="2"><span class="label">Name: </span><span class="value"><%= bid.getBidderName() %></span></td>
                    </tr>
                    <tr>
                        <td colspan="2"><span class="label">Email address: </span><span class="value"><%= bid.getBidderEmail() %></span></td>
                    </tr>
                    <tr>
                        <td colspan="2"><span class="label">Bid price: Rs<%= formattedBidAmount %></span></td>
                    </tr>
                    <tr>
                        <td colspan="2"><span class="label">Auto-increment price: </span><span class="value"><%= autoIncrementStatus %></span></td>
                    </tr>
                </table>
            </div>
            
            <%
                } else {
            %>
            
            <div style="text-align: center; color: red; font-weight: bold;">
                <p>Error: No bid data available. Please try again.</p>
            </div>
            
            <%
                }
            %>
        </div>
        
        <div class="footer">
            <p><a href="assignment1.html">Back to Bidding Form</a></p>
        </div>
    </div>
</body>
</html>
