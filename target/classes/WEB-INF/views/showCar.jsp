<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>${car.toString()}</title>
        <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
        <link rel="stylesheet" href="./resources/css/style.css" type="text/css"/>
    </head>
    <body>
        <%@ include file="./templates/menu.jsp" %>

        <div class="container">
            <div class="row row-offcanvas row-offcanvas-right">
                <%@ include file="./templates/carItemSidebar.jsp" %>
                <div class="col-xs-12 col-sm-8">
                    <%@ include file="./templates/aboutCar.jsp" %>
                    <div class="row">
                        <%@ include file="./templates/detailsList.jsp" %>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
