var BSClass = document.getElementsByClassName('BS');
var DesClass = document.getElementsByClassName('Des');
var EnggClass = document.getElementsByClassName('Engg');
var HSSClass = document.getElementsByClassName('HSS');
var MgmtClass = document.getElementsByClassName('Mgmt');
var ComClass = document.getElementsByClassName('Common');
var pD = document.getElementById("programme-dropdown");
var fD = document.getElementById("field-dropdown");

pD.onchange=function(){
	  var programme = pD.options[pD.selectedIndex].text;
	  var sortType = "NIRF Overall Ranking";
	  sortService(programme, "All", sortType);
	}

	fD.onchange=function(){
	  var programme = pD.options[pD.selectedIndex].text;
	  var field = fD.options[fD.selectedIndex].text;
	  var sortType = "NIRF Overall Ranking";
	  sortService(programme, field, sortType);
	}

window.onload = function() {
  var programme = document.getElementById("programme-dropdown").options[pD.selectedIndex].text;
    if (programme == "All") {
       for (var i = 0; i< BSClass.length; i++){ BSClass[i].disabled = false;}
       for (var i = 0; i< DesClass.length; i++){ DesClass[i].disabled = false;}
       for (var i = 0; i< EnggClass.length; i++){ EnggClass[i].disabled = false;}
       for (var i = 0; i< HSSClass.length; i++){ HSSClass[i].disabled = false;}
       for (var i = 0; i< MgmtClass.length; i++){ MgmtClass[i].disabled = false;}
       for (var i = 0; i< ComClass.length; i++){ ComClass[i].disabled = false;}
    }

	  if (programme == "Basic Sciences") {
	      for (var i = 0; i< BSClass.length; i++) { 
	        BSClass[i].disabled = false;
	      }
	      ComClass[3].disabled = false;
	    } 
	    
	    else if (programme == "Design") {
	      for (var i = 0; i< DesClass.length; i++) { 
	        DesClass[i].disabled = false;
	      }
	      ComClass[3].disabled = false;
	    }

		  else if (programme == "Engineering") {
	      for (var i = 0; i< EnggClass.length; i++) { 
	        EnggClass[i].disabled = false;
	      }
	      ComClass[0].disabled = false;
	      ComClass[2].disabled = false;
	      ComClass[3].disabled = false;
	    }

		  else if (programme == "Humanities and Social Sciences") {
	      for (var i = 0; i< HSSClass.length; i++) { 
	        HSSClass[i].disabled = false;
	      }
	      BSClass[3].disabled = false;
	      ComClass[1].disabled = false;
	      ComClass[3].disabled = false;
	    }
	    
	    else if (programme == "Management") {
	      for (var i = 0; i< MgmtClass.length; i++) { 
	        MgmtClass[i].disabled = false;
	      }
	    }
}

function sortService(x,y,z) {
  window.location.href= "http://localhost:8086/igMicroServices/SortService?programme=" + x +"&field=" + y +"&sortType=" + z;
}
