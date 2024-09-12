<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Quote Request</title>
</head>
<body>
    <form action="SocketLab2" method="post">
        <label for="socketType">Socket Type:</label><br>
        <input type="radio" name="socketType" value="Type A" id="typeA" required>
        <label for="typeA">Type A</label><br>
        <input type="radio" name="socketType" value="Type B" id="typeB">
        <label for="typeB">Type B</label><br>
        <input type="radio" name="socketType" value="Type C" id="typeC">
        <label for="typeC">Type C</label><br><br>
        
        <label for="quantity">Quantity:</label>
        <input type="text" name="quantity" id="quantity" required><br><br>

        <label for="customerName">Name:</label>
        <input type="text" name="customerName" id="customerName" required><br><br>

        <label for="customerEmail">Email:</label>
        <input type="email" name="customerEmail" id="customerEmail" required><br><br>

        <input type="submit" value="Request Quote">
    </form>
</body>
</html>
