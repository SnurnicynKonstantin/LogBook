<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${details}" var="detail">
    <div class="panel panel-default">
        <div class="panel-heading">${detail.key}</div>
        <div class="list-group">
            <c:forEach items="${detail.value}" var="value">
                <a href="#" class="list-group-item ">${value}</a>
            </c:forEach>
        </div>
    </div>
</c:forEach>