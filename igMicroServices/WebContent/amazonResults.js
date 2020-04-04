var sort = document.getElementById("sorting-option");

sort.onchange=function(){
	  var programme = pD.options[pD.selectedIndex].text;
	  var field = fD.options[fD.selectedIndex].text;
	  var sortType = sort.options[sort.selectedIndex].text;
	  sortService(programme, field, sortType);
}
