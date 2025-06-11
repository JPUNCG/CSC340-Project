<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        body { display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; }
        .logo { height: 60px; margin-bottom: 20px; }
    </style>
</head>
<body>
    <img src="https://i.imgur.com/cS1G1O8.jpeg" class="logo" alt="Logo"/>
    <div style="width: 300px;">
        <h2 class="text-center mb-4">Login</h2>
        <form action="/login" method="post">
            <input type="text" name="username" class="form-control mb-3" placeholder="Username" required/>
            <input type="password" name="password" class="form-control mb-3" placeholder="Password" required/>
            <div class="d-flex mb-2">
                <button type="submit" name="role" value="renter" class="btn btn-primary w-100 me-2">Login as Renter</button>
                <button type="submit" name="role" value="provider" class="btn btn-secondary w-100">Login as Provider</button>
            </div>
        </form>
        <a href="/signup" class="btn btn-info w-100">Sign Up</a>
    </div>
</body>
</html>