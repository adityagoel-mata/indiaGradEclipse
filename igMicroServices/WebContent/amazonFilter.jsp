<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="./amazonFilter.css">
</head>
<body>

<div class="parameters">
    <p class="params">
    LOOKING FOR?</p>
    <select id="lookingFor-dropdown" name="lookingFor-dropdown">
      
      <!-- <option>${lookingFor}</option> -->
      <option value="admission">Admission</option>
      <option value="internship">Internship</option>
      <option value="Assistantship">Assistantship</option>
    </select>

    <p class="params">
    PROGRAMME</p>
    <select id="programme-dropdown" name="programme-dropdown">
      
      <option>${programme}</option>
      <option value="All">All</option>
      <option value="BS">Basic Sciences</option>
      <option value="Des">Design</option>
      <option value="Engg">Engineering</option>
      <option value="HSS">Humanities and Social Sciences</option>
      <option value="Mgmt">Management</option>
    </select>
    
    <p class="params">
    FIELD</p>
    <select id="field-dropdown" name="field-dropdown">
      
      <option>${field}</option>
      <option value="All">All</option>
      <option disabled = "disabled" class = "Engg" value="Aerospace">Aerospace</option>
      <option disabled = "disabled" class = "Des" value="Animation">Animation</option>
      <option disabled = "disabled" class = "Engg" value="BioScience">BioScience</option>
      <option disabled = "disabled" class = "Mgmt" value="BA">Business Administration</option>
      <option disabled = "disabled" class = "Engg" value="Chemical">Chemical</option>
      <option disabled = "disabled" class = "BS" value="Chemistry">Chemistry</option>
      <option disabled = "disabled" class = "Engg" value="Civil">Civil</option>
      <option disabled = "disabled" class = "HSS" value="CogSci">Cognitive Sciences</option>
      <option disabled = "disabled" class = "Engg" value="CS">Computer Science</option>
      <option disabled = "disabled" class = "Engg" value="ConSys">Control Systems</option>
      <option disabled = "disabled" class = "Engg" value="ES">Earth Sciences</option>
      <option disabled = "disabled" class = "Engg" value="Electrical">Electrical</option>
      <option disabled = "disabled" class = "Engg" value="Energy">Energy</option>
      <option disabled = "disabled" class = "Engg" value="Environment">Environment</option>
      <option disabled = "disabled" class = "Engg" value="MSE">Material Sciences</option>
      <option disabled = "disabled" class = "Des" value="IndD">Industrial Design</option>
      <option disabled = "disabled" class = "Des" value="IntD">Interactive Design</option>
      <option disabled = "disabled" class = "BS" value="Mathematics">Mathematics</option>
      <option disabled = "disabled" class = "Engg" value="Mechanical">Mechanical</option>
      <option disabled = "disabled" class = "Des" value="MVD">Mobility Vehicle Design</option>
      <option disabled = "disabled" class = "HSS" value="PD">Planning and Development</option>
      <option disabled = "disabled" class = "HSS" value="Philosophy">Philosophy</option>
      <option disabled = "disabled" class = "BS" value="Physics">Physics</option>
      <option disabled = "disabled" class = "HSS" value="SocCult">Society and Culture</option>
      <option disabled = "disabled" class = "Des" value="VC">Visual Communication</option>
      <option disabled = "disabled" class = "Common" value="Other">Other</option>
      
    </select>

    <p class="params">
    DEGREE</p>
    <select id="degree-dropdown" name="degree-dropdown">
      <option value="All">All</option>
      <option disabled = "disabled" class = "HSS" value="M.A">M.A</option>
      <option disabled = "disabled" class = "Mgmt" value="M.B.A">M.B.A</option>
      <option disabled = "disabled" class = "Des" value="M.Des">M.Des</option>
      <option disabled = "disabled" class = "BS" value="M.Sc">M.Sc</option>
      <option disabled = "disabled" class = "Engg" value="M.Tech">M.Tech</option>
      <option disabled = "disabled" class = "Engg" value="M.UDE">M.UDE</option>
      <option disabled = "disabled" class = "Common" value="M.Phil">M.Phil</option>
      <option disabled = "disabled" class = "Engg" value="MS.R">MS.Research</option>
      <option disabled = "disabled" class = "HSS" value="M.A + P.hD">M.A + P.hD</option>
      <option disabled = "disabled" class = "BS" value="M.Sc + M.Tech">M.Sc + M.Tech</option>
      <option disabled = "disabled" class = "BS" value="M.Sc + P.hD">M.Sc + P.hD</option>
      <option disabled = "disabled" class = "Engg" value="M.Tech + P.hD">M.Tech + P.hD</option>
      <option disabled = "disabled" class = "Common" value="PGDIIT">PGDIIT</option>
      <option disabled = "disabled" class = "Common" value="P.hD">P.hD</option>

    </select>
    
    <p class="params">
    FEES</p>
    <input type="range" min="1" max="100" value="100" id="fees-range">

    <p class="params">
    INSTITUTE</p>
    <input type="text" placeholder="Name of the Institute" id="institute">
  
  </div>
    
	<script src="amazonFilter.js"></script>
</body>
</html>