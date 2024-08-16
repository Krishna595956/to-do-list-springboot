<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
	<h1>${status}</h1>
    <h2>Registration</h2>
	
    <form action="register" method="post">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        Password: <input type="password" name="password"><br>
        Mobile: <input type="tel" name="mobile"><br>
        College: <input type="text" name="college"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
