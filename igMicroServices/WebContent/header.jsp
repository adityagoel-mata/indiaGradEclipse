<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./header.css">
</head>

<body>
 <div class='header'>
    <p class='heading' id='home'>
      <span style="font-size: 45px" >I</span><span style="font-size: 30px" >NDIA</span><span style="font-size: 40px" >GRAD</span><span style="font-size: 25px" >.com</span> 
    </p>
    <p id="login">
      Login/ SignUp 
    </p>
  </div>

  <div class="wrapper">
    <div class="programme-index">
      <button id='programme-button'>PROGRAMME</button>
      <div class="programme-dropdown">

        <div class="BS-programme">
          <button class="programme-options" id="BS">Basic Sciences</button> 
            <div class="BS-dropdown">
              <button class="BS-field-button" id="Chemistry">Chemistry</button>
              <button class="BS-field-button" id="Mathematics">Mathematics</button>
              <button class="BS-field-button" id="Physics">Physics</button>
            </div>
        </div>
        
        <div class="Des-programme">
          <button class="programme-options" id="Des">Design</button> 
            <div class="Des-dropdown">
              <button class="Des-field-button" id="Animation">Animation</button>
              <button class="Des-field-button" id="Industrial Design">Industrial Design</button>
              <button class="Des-field-button" id="Interaction Design">Interaction Design</button>
              <button class="Des-field-button" id="Mobility Vehicle Design">Mobility Vehicle Design</button>
              <button class="Des-field-button" id="Visual Communication">Visual Communication</button>
            </div>
        </div>
        
        <div class="Engg-programme">
        <button class="programme-options" id="Engg">Engineering</button> 
          <div class="Engg-dropdown">
            <button class="Engg-field-button" id="Aerospace">Aerospace</button>
            <button class="Engg-field-button" id="BioScience">BioScience</button>
            <button class="Engg-field-button" id="Chemical">Chemical</button>
            <button class="Engg-field-button" id="Civil">Civil</button>
            <button class="Engg-field-button" id="Computer Science">Computer Science</button>
            <button class="Engg-field-button" id="Control Systems">Control Systems</button>
            <button class="Engg-field-button" id="Earth Sciences">Earth Sciences</button>
            <button class="Engg-field-button" id="Electrical">Electrical</button>
            <button class="Engg-field-button" id="Energy">Energy</button>
            <button class="Engg-field-button" id="Environment">Environment</button>
            <button class="Engg-field-button" id="Material Sciences">Material Sciences</button>
            <button class="Engg-field-button" id="Mechanical">Mechanical</button>
            <button class="Engg-field-button" id="Other">Other</button>
          </div>
        </div> 
                
        <div class="HSS-programme">
          <button class="programme-options" id="HSS">Humanities and Social Sciences</button> 
            <div class="HSS-dropdown">
              <button class="HSS-field-button" id="Cognitive Sciences">Cognitive Sciences</button>
              <button class="HSS-field-button" id="Philosophy">Philosophy</button>
              <button class="HSS-field-button" id="Planning and Development">Planning and Development</button>
              <button class="HSS-field-button" id="Society and Culture">Society and Culture</button>
            </div>
        </div>

        <div class="Mgmt-programme">
          <button class="programme-options" id="Mgmt">Management</button> 
            <div class="Mgmt-dropdown">
              <button class="Mgmt-field-button" id="Business Administration">Business Administration</button>
            </div>
        </div> 

      </div>
    </div>

    <div class="internship-index">
      <button id='internship-button'>INTERNSHIP</button>
    </div>
    <div class="assistantship-index">
      <button id='assistantship-button'>ASSISTANTSHIP</button>
    </div>
  </div>

  <script src="header.js"></script>

</body>
</html>