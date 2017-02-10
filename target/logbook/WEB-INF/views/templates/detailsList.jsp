<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="panel panel-default">
    <div class="panel-heading">Engine</div>
    <div class="list-group">
        <a href="#" class="list-group-item ">Cras justo odio</a>
        <a href="#" class="list-group-item">Dapibus ac facilisis in</a>
        <a href="#" class="list-group-item">Morbi leo risus</a>
        <a href="#" class="list-group-item">Porta ac consectetur ac</a>
        <a href="#" class="list-group-item">Vestibulum at eros</a>
    </div>
</div>

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