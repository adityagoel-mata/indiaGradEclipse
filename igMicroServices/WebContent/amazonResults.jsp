<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="./amazonResults.css">
</head>
<body>

<div class="results">
    
    <div class="sortstrip">
      <select id="sorting-option" name="sorting-option">
        
        <option>${sortType}</option>
        <option value="NIRF">NIRF Overall Ranking</option>
        <option value="A-Z">A-Z</option>
        <option value="Fees">Fees (Low to High)</option>
      </select>
      <select id="currency-option" name="currency-option">
        <option value="CNY" >CNY</option>
        <option value="EUR" >EUR</option>
        <option value="GBP" >GBP</option>
        <option value="INR" selected>INR</option>
        <option value="USD" >USD</option>
      </select>
    </div>
  
    <div class="sorted">
      <p id="searchResultsLabel">SEARCH RESULTS</p> <br>
    </div>

	<c:forEach items="${institutes}" var="institutes" varStatus="loop">
  
    <div class="resultOne">
      
      <div class="photo">
        <img src="${imageLink[loop.index]}" class="dp">
      </div>
      
      <div class="name">
        <p id= "name">
          <a href= "${homeLink[loop.index]}">${institutes}</a>
        </p>
        <p id= "location">${location[loop.index]}</p>
  
        <p id = "available">
        
        <c:forEach items="${degreeName[loop.index]}" var="degreeName" varStatus="count">
          <button id="prog1"><span id="degree1">${degreeName}</span> <span id="vBar">|</span><span id='field1'>${degreeValue[loop.index][count.index]}</span></button>
        </c:forEach>      
 		</p>
  
      </div>
  
      <div class="feesAndOthers">
        <p id="tuitionFeesLabel">TUITION FEES:</p> 
        <p id="tuitionFeesValue">${fees[loop.index]}</p>
      </div>
    
    </div>
  	<br><br><br>  <br><br><br>   <br><br><br>   <br><br><br>   <br><br><br>
  
 	 </c:forEach>      
</div>

    <script src="amazonFilter.js"></script>
    <script src="amazonResults.js"></script>
</body>
</html>