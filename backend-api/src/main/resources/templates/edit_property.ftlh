<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Edit Property</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container pt-4">
    <h3 class="mb-4">Edit Your Property</h3>
    <form action="/property/update/${property.propertyId}" method="post">
        <div class="mb-3">
            <label class="form-label">Images (comma-separated URLs)</label>
            <input name="images" class="form-control" value="${property.images}"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Price per night</label>
            <input name="price" type="number" class="form-control" value="${property.price}"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Square footage</label>
            <input name="sqft" type="number" class="form-control" value="${property.sqft}"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea name="description" class="form-control">${property.description}</textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">Tags</label>
            <input name="tags" class="form-control" value="${property.tags}"/>
        </div>
        <button type="submit" class="btn btn-success">Update Property</button>
        <a href="/property/delete/${property.propertyId}" class="btn btn-danger">Delete Property</a>
        <a href="/provider/profile/${providerId}" class="btn btn-secondary">Back to Profile</a>
    </form>

    <hr/>
    <h5>Reviews for this Property</h5>
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