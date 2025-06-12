<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Provider Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        .logo { height: 40px; }
        .profile-pic { height: 40px; width: 40px; border-radius: 50%; }
        body { padding: 20px; }
    </style>
</head>
<body>
    <nav class="d-flex justify-content-between align-items-center mb-4">
        <div class="d-flex align-items-center">
            <img src="https://i.imgur.com/cS1G1O8.jpeg" alt="Logo" class="logo me-2" />
            <span class="fs-4 fw-bold">RentalBooking</span>
        </div>
        <div class="d-flex align-items-center">
            <a href="/login" class="btn btn-outline-danger me-2">Log Out</a>
            <a href="/provider/profile/${provider.providerId}"><img src="${provider.profilePicture}" alt="Profile" class="profile-pic" /></a>
        </div>
    </nav>

    <h3 class="mb-4">List Your Property</h3>
    <form action="/property/create" method="post">
        <input type="hidden" name="providerId" value="${provider.providerId}" />
        <div class="mb-3">
            <label class="form-label">Images (comma-separated URLs)</label>
            <input name="images" class="form-control" placeholder="URL1, URL2, ..."/>
        </div>
        <div class="mb-3">
            <label class="form-label">Price per night</label>
            <input name="price" type="number" class="form-control" placeholder="$"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Square footage</label>
            <input name="sqft" type="number" class="form-control" placeholder="e.g. 1200"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea name="description" class="form-control" placeholder="Describe your property here..."></textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">Tags (e.g., Pool, Modern, Free Food)</label>
            <input name="tags" class="form-control" placeholder="Pool, Modern, ..."/>
        </div>
        <button type="submit" class="btn btn-success">Publish</button>
    </form>
</body>
</html>