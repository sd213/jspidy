<html>
<body>

<h2>Hello World!</h2>
<a href="/ls">ls</a>
<a href="login">login</a>
<a href="MyAccount">Myaccount</a>

<form action="submit" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Name" required>
        <br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Email" required>
        <br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" min="1" max="120" placeholder="Age" required>
        <br><br>
        
        <label for="gender">Gender:</label>
        <select id="gender" name="gender"  required>
            <option value="male">Male</option>
            <option value="female" selected>Female</option>
            <option value="other">Other</option>
        </select>
        <br><br>
        
        <label for="comments">Comments:</label>
        <textarea id="comments" name="comments" rows="4" cols="50" placeholder="Enter Comments"></textarea>
        <br><br>
        
        <input type="submit" value="Submit">
    </form>
    
    <form action="calc" method="get">
    	<label for="inp1">Input 1: </label>
    	<input type="text" name="inp1" placeholder="Enter Number">
    	
    	<label for="operat1">Operator 1: </label>
    	<input type="text" name="operat1" placeholder="Enter Operator">
    	
    	<label for="inp2">Input 2: </label>
    	<input type="text" name="inp2" placeholder="Enter Number">
     
     	<input type="submit" value="Submit">
    </form>
     <form action="calc2" method="get">
    	<label for="inp3">Input 1: </label>
    	<input type="text" name="inp1" placeholder="Enter Number">
    	
    <!-- 	<label for="operat1">Operator 1: </label>
    	<input type="text" name="operat1" placeholder="Enter Operator">
    	 -->
    	
    	<button onclick="">add</button>
    	<label for="inp4">Input 2: </label>
    	<input type="text" name="inp2" placeholder="Enter Number">
     
     	<input type="submit" value="Submit">
    </form>
</body>
</html>
