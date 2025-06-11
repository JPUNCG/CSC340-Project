<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Renter Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        body { padding: 20px; }
        .logo { height: 40px; }
        .profile-pic { height: 40px; width: 40px; border-radius: 50%; }
        .house-card img { width: 100%; height: 200px; object-fit: cover; }
        .amenities { font-size: 0.85rem; color: #6c757d; }
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
            <a href="/renter/profile/${renter.renterId}"><img src="${renter.profilePicture}" class="profile-pic" alt="Profile" /></a>
        </div>
    </nav>
    
    <div class="filter-section card card-body mb-4">
        <h5 class="mb-3">Filter Properties</h5>
        <form action="/renter/home/${renter.renterId}" method="get">
            <div class="row g-3">
                <div class="col-md-3">
                    <label class="form-label">Price ($)</label>
                    <div class="d-flex">
                        <input name="minPrice" type="number" class="form-control me-2" placeholder="Min" />
                        <input name="maxPrice" type="number" class="form-control" placeholder="Max" />
                    </div>
                </div>
                <div class="col-md-3">
                    <label class="form-label">Square Footage</label>
                    <div class="d-flex">
                        <input name="minSqft" type="number" class="form-control me-2" placeholder="Min" />
                        <input name="maxSqft" type="number" class="form-control" placeholder="Max" />
                    </div>
                </div>
                <div class="col-md-2 align-self-end">
                    <button type="submit" class="btn btn-primary w-100">Apply Filters</button>
                </div>
                <div class="col-md-2 align-self-end">
                    <a href="/renter/home/${renter.renterId}" class="btn btn-secondary w-100">Clear</a>
                </div>
            </div>
        </form>
    </div>

    <div class="row" id="listingContainer">
        <#list properties as property>
            <div class="col-md-4 mb-4">
                <div class="card house-card">
                    <a href="/property/${property.propertyId}/from/${renter.renterId}">
                        <img src="${property.images}" class="card-img-top" alt="Room"/>
                    </a>
                    <div class="card-body">
                        <div class="d-flex justify-content-between">
                           <h5 class="card-title">${property.description}</h5>
                           <h5 class="card-title">$${property.price}/night</h5>
                        </div>
                        <p class="card-text text-muted small">${property.sqft} sq ft</p>
                        <p class="amenities">${property.tags}</p>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</body>
</html>