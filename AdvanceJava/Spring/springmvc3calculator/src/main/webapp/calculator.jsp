<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Calculator</h1>
    <table  border="1" style="border-collapse:collapse;">
        <tr>
            <th colspan="4">
                <input type="text" name="" id=" " placeholder="Calculator" disabled>

            </th>
        </tr>
        <tr>
            <td colspan="2" onclick="empty()">CE</td>
            <td onclick="getValue(event)">*</td>
            <td onclick="getValue(event)">/</td>

        </tr>
        <tr>
            <td onclick="getValue(event)">7</td>
            <td onclick="getValue(event)">8</td>
            <td onclick="getValue(event)">9</thd>
            <td onclick="getValue(event)">-</td>

        </tr>
        <tr>
            <td onclick="getValue(event)">4</td>
            <td onclick="getValue(event)">5</td>
            <td onclick="getValue(event)">6</td>
            <td onclick="getValue(event)">+</td>

        </tr>
        <tr>
            <td onclick="getValue(event)">1</td>
            <td onclick="getValue(event)">2</td>
            <td onclick="getValue(event)">3</td>
            <td rowspan="2" onclick="result()">=</td>

        </tr>
        <tr>
            <td onclick="getValue(event)">.</td>
            <td onclick="getValue(event)">0</td>
            <td onclick="getValue(event)">%</td>
        </tr>
    </table>
    <script src="./script.js"></script>
</body>
</html>