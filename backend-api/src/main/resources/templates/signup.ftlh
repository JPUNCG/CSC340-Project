<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        body { display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; }
        .logo { height: 60px; margin-bottom: 20px; }
        .container { max-width: 500px; }
    </style>
</head>
<body>
    <img src="https://i.imgur.com/cS1G1O8.jpeg" class="logo" alt="Logo"/>
    <div class="container">
        <h2 class="text-center mb-4">Sign Up</h2>
        <form action="/signup" method="post">
            <input type="text" name="username" class="form-control mb-3" placeholder="Username" required/>
            <input type="password" name="password" class="form-control mb-3" placeholder="Password" required/>
            <textarea name="bio" class="form-control mb-3" placeholder="Bio"></textarea>
            <input type="text" name="profilePicture" class="form-control mb-3" placeholder="Profile Picture URL"/>
            <div class="d-flex">
                <button type="submit" name="role" value="renter" class="btn btn-primary w-100 me-2">Sign up as Renter</button>
                <button type="submit" name="role" value="provider" class="btn btn-secondary w-100">Sign up as Provider</button>
            </div>
        </form>
        <div class="text-center mt-3">
            <a href="/login">Back to Login</a>
        </div>
    </div>
</body>
</html>