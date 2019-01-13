<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Booking</title>
<link rel ="icon" href="icon.png"/>
</head>
<body bgcolor="lightgreen">
</body>
</head>
<h1 align="center">
	<font color="red">Welcome To Hotel Booking</font>
</h1>

<form action="Booking.do" method="POST" name="Booking">
	<table align="center">
		<tr>
			<td>HotelName : <input type="text"
				placeholder="  Enter your HotelNmae" name="HotelNmae" /></td>
		</tr>
		<tr>
			<td>location: <input type="text"
				placeholder="  Enter your location" name=location /></td>
		</tr>
		<tr>
			<td>RoomType : <select name="RoomTYpe"><option>AC</option>
					<option>NonAC</option>
			</select></td>
		</tr>
		<!-- <input type="text" placeholder="Choose your RoomType" name="RoomType"/></br> -->
		<tr>
			<td>No Of Beds: <input type="text"
				placeholder="  enter your NoofBeds" name="NoofBeds" /></td>
		</tr>
		<tr>
			<td>Date: <input type="text" placeholder="  Enter your Date"
				name="Date" /></td>
		</tr>

		<input type="submit" value="Click" />
	</table>
</form>

<h5>Hotel Booked:${HotelNmae} ON Date: ${Date} </h5>

<body>

</body>
</html>