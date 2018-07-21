<html>
<body>
<h2>Hello World!</h2>


<form action="myservlet" method="GET">

    Click to create cookies

    <br>
    <input type="submit" value="create"/>

</form>

<script>
    //Prints only cookies without httpOnly flag
	console.log(document.cookie);
</script>

</body>
</html>
