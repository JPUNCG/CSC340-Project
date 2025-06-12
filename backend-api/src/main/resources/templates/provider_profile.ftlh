<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Provider Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container pt-4">
    <div class="profile-section d-flex align-items-center mb-4">
        <img src="${provider.profilePicture}" alt="Profile Picture" class="me-3 rounded-circle" style="width:100px; height:100px;"/>
        <div>
            <h4>${provider.username}</h4>
            <p>${provider.bio}</p>
            <a href="/provider/home/${provider.providerId}" class="btn btn-secondary mt-2">Back to Home</a>
        </div>
    </div>

    <h5>Your Properties</h5>
    <div class="d-flex flex-wrap gap-3">
        <#list properties as property>
            <div class="card" style="width: 200px;">
                <a href="/property/edit/${property.propertyId}">
                    <img src="${property.images}" class="card-img-top" style="height: 120px; object-fit: cover;" alt="Property">
                </a>
                <div class="card-body p-2">
                    <h6 class="card-title mb-1">${property.description}</h6>
                </div>
            </div>
        </#list>
    </div>
</body>
</html>