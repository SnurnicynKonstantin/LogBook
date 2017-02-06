<div class="col-xs-6 col-lg-4">
    <img src="${car.imgUrl}" class="img-responsive img-rounded"  alt="${car.toString()}">
    <h2>
        <a href="<c:url value='/show-${car.getId()}-car' />">${car.toString()}</a>
    </h2>
    <p>
        <small>
            ${car.year}
        </small>
    </p>
</div>