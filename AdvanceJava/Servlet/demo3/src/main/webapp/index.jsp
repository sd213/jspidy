<html>
<body>
<h2>Hello World!</h2>
<p> link to Other Page <a href="DF">link</a><p>

	
	<form action="isprime">
	<fieldset>
	
		<legend>Prime Number</legend>
		<input type="text" name="num" placeholder="Enter Number">
		<button type="submit">Check Prime</button>
		</fieldset>
	</form>
	
	<form action="isstrong">
	<fieldset>
		<legend>Strong Number</legend>
		<input type="text" name="num" placeholder="Enter Number">
		<button type="submit">Check Strong</button>
	</fieldset>
	</form>
	
	<form action="isspy">
	<fieldset>
		<legend>Spy Number</legend>
		<input type="text" name="num" placeholder="Enter Number">
		<button type="submit">Check Spy</button>
	</fieldset>
	</form>
	
	<form action="it">
	<fieldset>
		<legend>TechNumber</legend>
		<input type="text" name="num" placeholder="Enter Number">
		<button type="submit">Check Tech</button>
	</fieldset>
	<h1>First HTTP SERVLET</h1>
	</form>
	
		<p>Click here to here make a get request</p>
	<a href="FirstHTtpServlet">FirstHTtpServlet</a>
	<form action="FirstHTtpServlet">
		<p>Click here to here make  a get request</p>
		<button type="submit">submit</button>
	</form>
	<form action="FirstHTtpServlet" method="post">
		<p>Click here to here make  a post request</p>
		<button type="submit">submit</button>
	</form>
	<hr>
	
	<h1>Second HTTP SERVLET</h1>
	<h2>Only Post Method Allowed by overriding only doPost method in httpServlet</h2>
	<form action="SecondHTtpServlet">
		<p>Click here to here make  a get request</p>
		<button type="submit">submit</button>
	</form>
	<form action="SecondHTtpServlet" method="post">
		<p>Click here to here make  a post request</p>
		<button type="submit">submit</button>
	</form>
	<hr>
	
	<h1>Third HTTP SERVLET</h1>
	
	<h2>Only Get Method Allowed by overriding only doGet method in httpServlet</h2>
	<form action="ThirdHTtpServlet" method="get">
		<p>Click here to here make  a get request</p>
		<button type="submit">submit</button>
	</form>
	<form action="ThirdHTtpServlet" method="post">
		<p>Click here to here make  a post request</p>
		<button type="submit">submit</button>
	</form>
	<h1><a href="os">OurServlet</a></h1>
	
	<h1><a href="a2">first run<a></h1>
	
	<h1><a href="a2">second run<a></h1>
</body>
</html>
