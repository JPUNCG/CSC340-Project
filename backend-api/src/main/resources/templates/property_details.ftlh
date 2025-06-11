<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Property Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container pt-4">
    <div class="row">
        <div class="col-md-8">
            <img src="${property.images}" class="img-fluid mb-3" alt="House"/>
            <div class="d-flex justify-content-between">
                <h5>${property.description}</h5>
                <h5>$${property.price}/night</h5>
            </div>
            <p class="text-muted">${property.sqft} sq ft</p>
            <p>${property.tags}</p>
        </div>
        <div class="col-md-4">
            <a href="/booking/checkout/property/${property.propertyId}/renter/${renterId}" class="btn btn-primary w-100 mb-2">Checkout</a>
            <a href="/renter/home/${renterId}" class="btn btn-secondary w-100">Back to Home</a>
        </div>
    </div>

    <hr/>

    <h5>Reviews</h5>
    <#list reviews as review>
        <div class="border p-3 mb-2">
            <div><strong>Rating: ${review.rating}/5</strong></div>
            <p>${review.description}</p>
        </div>
    <#else>
        <p>No reviews yet.</p>
    </#list>
</body>
</html>