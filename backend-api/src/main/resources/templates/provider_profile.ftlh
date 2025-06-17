<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Provider Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container pt-4">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h3>Edit Your Profile</h3>
        <a href="/provider/home/${provider.providerId}" class="btn btn-secondary">Back to Home</a>
    </div>

    <form action="/provider/update/${provider.providerId}" method="post" class="mb-5">
        <div class="row">
            <div class="col-md-2">
                <img src="${provider.profilePicture}" alt="Profile Picture" class="img-thumbnail mb-2"/>
            </div>
            <div class="col-md-10">
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" name="username" class="form-control" value="${provider.username}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" value="${provider.password}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Profile Picture URL</label>
                    <input type="text" name="profilePicture" class="form-control" value="${provider.profilePicture}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Bio</label>
                    <textarea name="bio" class="form-control" rows="3">${provider.bio}</textarea>
                </div>
                <button type="submit" class="btn btn-primary">Save Changes</button>
            </div>
        </div>
    </form>

    <hr/>

    <h5>Your Properties</h5>
    <div class="d-flex flex-wrap gap-3">
        <#if properties?has_content>
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
        <#else>
            <p>You have not listed any properties yet.</p>
        </#if>
    </div>
</body>
</html>