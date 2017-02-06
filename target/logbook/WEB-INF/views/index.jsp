<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
        <title>Logbook</title>

        <style>
            tr:first-child{
                font-weight: bold;
                background-color: #C6C9C4;
           }
        </style>

        <link rel="stylesheet" href="./resources/css/style.css" type="text/css"/>

    </head>


    <body>
        <%@ include file="./templates/menu.jsp" %>

        <div class="container">
            <div class="row row-offcanvas row-offcanvas-right">
                <div class="col-xs-6 col-sm-3 sidebar-offcanvas">
                    <%@ include file="./templates/sidebar.jsp" %>
                </div>
                <div class="col-xs-12 col-sm-9">
                    <%@ include file="./templates/news.jsp" %>
                    <div class="row">
                        <c:forEach items="${cars}" var="car">
                            <c:set var="car" value="${car}" scope="request" ></c:set>
                            <%@ include file="./templates/carItem.jsp" %>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>

        <h2>List of Employees</h2>
        <table>
            <tr>
                <td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
            </tr>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.name}</td>
                    <td>${employee.joiningDate}</td>
                    <td>${employee.salary}</td>
                    <td><a href="<c:url value='/edit-${employee.ssn}-employee' />">${employee.ssn}</a></td>
                    <td><a href="<c:url value='/delete-${employee.ssn}-employee' />">delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <a href="<c:url value='/new' />">Add New Employee</a>

        <%@ include file="./templates/footer.jsp" %>
    </body>
</html>