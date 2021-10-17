<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Risk Impact Rating</title>
<style>
div.title {
	text-align: center;
	color: #5F9EA0;
}

div.a {
	width: 50%;
	float: left;
}

div.c {
	width: 50%;
	float: right;
}

div.e {
	width: 50%;
	float: left;
}

div.header {
	padding: 5px;
	text-align: center;
	background: #1abc9c;
	color: white;
	font-size: 6px;
}
</style>
</head>
<body>
	<div class="title">
<h1>Risk Input Form </h1>
</div>
<p color ="green">Please fill in the appropriate details for efficient to propose accurate required action</p>

<form action="">

<div class="header">
  <h1>Risk Input Fields</h1>
</div>
<div class="a">  
 

 <p>Risk Id: <input type = "text" name = "Risk Id" /></p>
  <p>Risk Name: <input type = "text" name = "Risk Name" /></p>
		 </div>
		 
	<div class="b">  
 
        <p>Risk Description:<textarea rows = "2" cols = "30" name = "description" align="bottom">
         
         </textarea></p>
		 
		<p>Risk Category: <select name = "dropdown">
			<option value = "Capital Risk">Capital Risk</option>           
		   <option value = "Compliance Risk" selected>Compliance Risk</option>
            <option value = "Credit Risk">Credit Risk</option>
			 <option value = "Liquidity Risk">Liquidity Risk</option>
			  <option value = "Market Risk">Market Risk</option>
			   
         </select>
		 </p>
		 </div>	 
		 
		<div class="c">  
 
        
		 
		<p>Risk Severity: <select name = "dropdown">
			<option value = "Catastrophic">Catastrophic</option> 
		 <option value = "Significant" selected>Significant</option>
            <option value = "Moderate">Moderate</option>
			 <option value = "Low">Low</option>
			  <option value = "Negligible">Negligible</option>
			   
         </select>
		 <p>Risk Likelihood: <select name = "dropdown"> 
			<option value = "Improbable">Improbable</option>           
		   <option value = "Remote" selected>Remote</option>
            <option value = "Occasional">Occasional</option>
			 <option value = "Probable">Probable</option>
			  <option value = "Highly Probable">Highly Probable</option>
			   
         </select>
		 </p>
		 </div>	 

<div class="d">
<p>Risk Impact: <select name = "dropdown">
			<option value = "Low">Low</option>           
		   <option value = "Medium" selected>Medium</option>
            <option value = "High">High</option>
			 <option value = "Very High">Very High</option>
			  </select>
			  
			

			 
			  <p>Risk Applicable?:<select name = "dropdown">
			<option value = "No">No</option>           
		   <option value = "Yes" selected>Yes</option>
       </select>
	   </p>
		
<p>Risk Impact Level: <select name = "dropdown" >
			<option value = "0">0</option> 
			<option value = "1">1</option>           
		   <option value = "2" selected>2</option>
            <option value = "3">3</option>
			 <option value = "4">4</option>
			  <option value = "5">5</option> 
			  </select>
			 </p>			 

<p>Risk Rating Score: <input type = "text" name = "Risk Rating Score" align="right" /><a href="riskOutput.jsp">Risk Output</a></p>

</div>	
</form>
</body>
</html>