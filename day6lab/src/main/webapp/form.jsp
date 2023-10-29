<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="ipl" class="beans.IPLBean" scope="application"/>
<body>
<h5> Teams:${applicationScope.ipl.allTeams}</h5>
<form action="" method="post">
<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Add a Player To IPL TEAM</h3>


<table>
<tr>

<td><label for="Teams">Choose a Team:</label></td>
<td>
<select name="team" id="team">
  <option value="CSK">CHENNAI SUPER KINGS  </option>
  <option value="GT">GUJARAT TITANS</option>
  <option value="KKR"> KOLKATA KNIGHT RIDERS </option>
  <option value="RCB">Royal Challengers Bangalore</option>
</select></td>
</tr>
<tr></tr>
<tr>
<td>Name :</td>
<td><input type="text" name="nm"></td>
</tr>
<tr>
<td>DOB</td>
<td><input type="date" name="dob"></td>
</tr>
<tr>
<td>BATTING AVG :</td>
<td><input type="text" name="bavg"></td>
</tr>
<tr>
<td>WICKETS TAKEN</td>
<td><input type="number" name="wt"></td>
</tr> <br>



</table>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"  name="btn" value="SUBMIT">
</form>



</body>
</html>