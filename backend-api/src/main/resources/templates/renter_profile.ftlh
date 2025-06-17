<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Renter Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container pt-4">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h3>Edit Your Profile</h3>
        <a href="/renter/home/${renter.renterId}" class="btn btn-secondary">Back to Home</a>
    </div>

    <form action="/renter/update/${renter.renterId}" method="post" class="mb-5">
        <div class="row">
            <div class="col-md-2">
                <img src="${renter.profilePicture}" alt="Profile Picture" class="img-thumbnail mb-2"/>
            </div>
            <div class="col-md-10">
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" name="username" class="form-control" value="${renter.username}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" value="${renter.password}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Profile Picture URL</label>
                    <input type="text" name="profilePicture" class="form-control" value="${renter.profilePicture}">
                </div>
                <div class="mb-3">
                    <label class="form-label">Bio</label>
                    <textarea name="bio" class="form-control" rows="3">${renter.bio}</textarea>
                </div>
                <button type="submit" class="btn btn-primary">Save Changes</button>
            </div>
        </div>
    </form>

    <hr/>

    <h5>Your Bookings</h5>
    <#if bookings?has_content>
        <#list bookings as booking>
            <div class="border p-3 mb-3">
                <p><strong>Property ID:</strong> ${booking.propertyId} | <strong>Status:</strong> ${booking.status}</p>
                <form action="/review/create" method="post" class="mt-2">
                    <input type="hidden" name="propertyId" value="${booking.propertyId}" />
                    <input type="hidden" name="renterId" value="${renter.renterId}" />
                    <div class="mb-2"><input type="number" name="rating" class="form-control" placeholder="Rating (1-5)" min="1" max="5" required /></div>
                    <div class="mb-2"><textarea name="description" class="form-control" placeholder="Write your review..." required></textarea></div>
                    <button type="submit" class="btn btn-sm btn-primary">Submit Review</button>
                </form>
            </div>
        </#list>
    <#else>
        <p>You have no bookings.</p>
    </#if>

    <hr/>

    <h5>Your Reviews</h5>
    <#if reviews?has_content>
        <#list reviews as review>
            <div class="border p-3 mb-2 d-flex justify-content-between align-items-start">
                <div>
                    <div><strong>Rating: ${review.rating}/5</strong> (Property ID: ${review.propertyId})</div>
                    <p class="mb-0">${review.description}</p>
                </div>
                <a href="/review/delete/${review.reviewId}/renter/${renter.renterId}" class="btn btn-sm btn-danger">Delete</a>
            </div>
        </#list>
    <#else>
        <p>You have not left any reviews.</p>
    </#if>
</body>
</html>