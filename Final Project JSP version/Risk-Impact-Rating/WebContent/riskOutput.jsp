<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div.title {
	text-align: right;
	color: #5F9EA0;
}

div.a {
	width: 50%;
	float: left;
}

div.select {
	text-align: center;
	width: 50%;
}

div.title {
	text-align: right;
	width: 50%;
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
		<h1 class="title">Risk Calculation Results</h1>

	</div>
	<div class="select">
		<p>
			Impact (Likelihood & Seviery) Rating: <input type readonly="text"
				name="Impact Rating" />
		</p>
		<p>
			Risk Category: <select name="dropdown">
				<option value="Capital Risk">Capital Risk</option>
				<option value="Compliance Risk" selected>Compliance Risk</option>
				<option value="Credit Risk">Credit Risk</option>
				<option value="Liquidity Risk">Liquidity Risk</option>
				<option value="Market Risk">Market Risk</option>


			</select>
			<button>Save</button>
	</div>
	<form action="">


		<div class="header">
			<h1>Capital,Credit,Liquidity & market Risks Calculation</h1>
		</div>



		<div class="c">



			<p>
				Applicable Entity: <select name="dropdown">
					<option value="Marketing">Marketing</option>
					<option value="IT Infra & Security">IT Infra & Security</option>
					<option value="Client Services" selected>Client Services</option>
					<option value="Human Resources">Human Resources</option>
					<option value="Internal Ops">Internal Ops</option>
					<option value="Third Party Services">Third Party Services</option>

				</select>
			<p>
				Risk Frequency: <select name="dropdown">
			<option value="Daily">Daily</option>   
			<option value="Weekly">Weekly</option>           
		   <option value="Monthly" selected>Monthly</option>
            <option value="Quarterly">Quarterly</option>
			 <option value="Yearly">Yearly</option>
			
			   
         </select>
		 </p>
		 
		  <p align="center"> Action Required: <input type="text"
					name=" Action Required" />
			</p>
		
		 </p>
		 </div>	 

<div class="header">
  <h1>Compliance Type Risks Calculation</h1>
</div>

<div class="d">
<p>Regulatory Body: <select name="dropdown">
			<option value="FINRA">FINRA</option>           
		   <option value="SEC" selected>SEC</option>
            <option value="CFPB">CFPB</option>
			 <option value="OCC">OCC</option>
			  <option value="Other">Other</option> 
			</p>
			  </select>
			  
			  <p>Rule Type: <select name="dropdown">
			<option value="Informational">Informational</option>           
		   <option value="Notice" selected>Notice</option>
            <option value="Rule">Rule</option>
			 <option value="Regulation">Regulation</option>
			 
			  </select>
			 </p>		  
</div>		 
		 
</p>
			
		 
		  <p align="center"> Action Required: <input type="text"
				name=" Action Required" />
		</p>
		
		 </p>
</form>
</body>
</html>