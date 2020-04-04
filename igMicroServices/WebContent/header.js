var home = document.getElementById("home");
home.addEventListener("click", function(){
  window.location.href= "http://localhost:8086/igMicroServices/index.jsp"
});
var programme = document.getElementById("programme-button");
programme.addEventListener("click", function() {
  window.location.href= "https://www.iitgn.ac.in/"
});

var internships = document.getElementById("internship-button");
internships.addEventListener("click", function() {
  window.location.href= "https://www.iitgn.ac.in/pdf/intlintern.pdf"
});

var assistantships = document.getElementById("assistantship-button");
assistantships.addEventListener("click", function() {
  window.location.href= "https://www.iitgn.ac.in/research/projects"
});


var defaultSortType = "NIRF Overall Ranking";
var BS = document.getElementById('BS');
var Chemistry = document.getElementById("Chemistry");
var Mathematics = document.getElementById("Mathematics");
var Physics = document.getElementById("Physics");

var Des = document.getElementById('Des');
var Animation = document.getElementById('Animation');
var IndD = document.getElementById('Industrial Design');
var IntD = document.getElementById('Interactive Design');
var MVD = document.getElementById('Mobility Vehicle Design');
var VC = document.getElementById('Visual Communication');

var Engg = document.getElementById('Engg');
var Aerospace = document.getElementById("Aerospace");
var BioScience = document.getElementById("BioScience");
var Chemical = document.getElementById("Chemical");
var Civil = document.getElementById("Civil");
var CS = document.getElementById("Computer Science");
var ConSys = document.getElementById("Control Systems");
var ES = document.getElementById("Earth Sciences");
var Electrical = document.getElementById("Electrical");
var Energy = document.getElementById("Energy");
var Environment = document.getElementById("Environment");
var MSE = document.getElementById("Material Sciences");
var Mechanical = document.getElementById("Mechanical");
var Other = document.getElementById("Other");

var HSS = document.getElementById('HSS');
var CogSci = document.getElementById("Cognitive Sciences");
var Philosophy = document.getElementById("Philosophy");
var PD = document.getElementById("Planning and Development");
var SocCult = document.getElementById("Society and Culture");

var Mgmt = document.getElementById('Mgmt');
var BA = document.getElementById('Business Administration');


BS.addEventListener("click", function() {
	  var text = BS.textContent;
	  sortService(text, "All", defaultSortType);
	});

	Chemistry.addEventListener("click", function() {
	  var text = Chemistry.textContent;
	  sortService("Basic Sciences", text,  defaultSortType);
	});
	Mathematics.addEventListener("click", function() {
	  var text = Mathematics.textContent;
	  sortService("Basic Sciences", text,  defaultSortType);
	});
	Physics.addEventListener("click", function() {
	  var text = Physics.textContent;
	  sortService("Basic Sciences", text,  defaultSortType);
	});

	Des.addEventListener("click", function() {
	  var text = Des.textContent;
	  sortService(text, "All", defaultSortType);
	});
	Animation.addEventListener("click", function() {
	  var text = Animation.textContent;
	  sortService("Design", text,  defaultSortType);
	});
	IndD.addEventListener("click", function() {
	  var text = IndD.textContent;
	  sortService("Design", text,  defaultSortType);
	});
	IntD.addEventListener("click", function() {
	  var text = IntD.textContent;
	  sortService("Design", text,  defaultSortType);
	});
	MVD.addEventListener("click", function() {
	  var text = MVD.textContent;
	  sortService("Design", text,  defaultSortType);
	});
	VC.addEventListener("click", function() {
	  var text = VC.textContent;
	  sortService("Design", text,  defaultSortType);
	});

	Engg.addEventListener("click", function() {
	  var text = Engg.textContent;
	  sortService(text, "All", defaultSortType);
	});
	Aerospace.addEventListener("click", function() {
	  var text = Aerospace.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	BioScience.addEventListener("click", function() {
	  var text = BioScience.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Chemical.addEventListener("click", function() {
	  var text = Chemical.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Civil.addEventListener("click", function() {
	  var text = Civil.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	CS.addEventListener("click", function() {
	  var text = CS.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	ConSys.addEventListener("click", function() {
	  var text = ConSys.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	ES.addEventListener("click", function() {
	  var text = ES.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Electrical.addEventListener("click", function() {
	  var text = Electrical.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Energy.addEventListener("click", function() {
	  var text = Energy.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Environment.addEventListener("click", function() {
	  var text = Environment.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	MSE.addEventListener("click", function() {
	  var text = MSE.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Mechanical.addEventListener("click", function() {
	  var text = Mechanical.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});
	Other.addEventListener("click", function() {
	  var text = Other.textContent;
	  sortService("Engineering", text,  defaultSortType);
	});

	HSS.addEventListener("click", function() {
	  var text = HSS.textContent;
	  sortService(text, "All", defaultSortType);
	});
	CogSci.addEventListener("click", function() {
	  var text = CogSci.textContent;
	  sortService("Humanities and Social Sciences", text,  defaultSortType);
	});
	Philosophy.addEventListener("click", function() {
	  var text = Philosophy.textContent;
	  sortService("Humanities and Social Sciences", text,  defaultSortType);
	});
	PD.addEventListener("click", function() {
	  var text = PD.textContent;
	  sortService("Humanities and Social Sciences", text,  defaultSortType);
	});
	SocCult.addEventListener("click", function() {
	  var text = SocCult.textContent;
	  sortService("Humanities and Social Sciences", text,  defaultSortType);
	});

	Mgmt.addEventListener("click", function() {
	  var text = Mgmt.textContent;
	  sortService(text, "All", defaultSortType);
	});
	BA.addEventListener("click", function() {
	  var text = BA.textContent;
	  sortService("Management", text,  defaultSortType);
	});

	function sortService(x,y,z){
		  window.location.href= "http://localhost:8086/igMicroServices/SortService?programme=" + x +"&field=" + y +"&sortType=" + z;
		}