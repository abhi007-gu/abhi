<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books List</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Available Books</h1>
    </header>
    
    <table>
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.bookId}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.isAvailable ? 'Available' : 'Borrowed'}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <footer>
        <p>&copy; 2025 Library Management System</p>
    </footer>
</body>
</html>
