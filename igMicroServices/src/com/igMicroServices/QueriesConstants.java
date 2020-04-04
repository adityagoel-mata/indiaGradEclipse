package com.igMicroServices;

import java.util.ArrayList;

public class QueriesConstants {
	
	public String getInstituteQuery (String programme, String field ) {
		String Query = "";
		if (field.equals("All")) { 
			Query = " SELECT DISTINCT institute FROM public.\"iitBombay\" WHERE programme= '" + programme + "' "
			+ "UNION "
			+ "SELECT institute	FROM public.\"iitGandhinagar\" WHERE programme= '" + programme + "' "
			+ "UNION "
			+ "SELECT institute	FROM public.\"iitDelhi\" WHERE programme= '" + programme + "' "
			+ ";";
			}
		else {	
			Query  = "SELECT institute FROM public.\"iitBombay\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
			+ "UNION "
			+ "SELECT institute FROM public.\"iitGandhinagar\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
			+ "UNION "
			+ "SELECT institute FROM public.\"iitDelhi\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
			+ ";";
		}
	return Query;
	}
	
	public String getFeesQuery (String instiName) {
		String Query = "SELECT fees	FROM public.institutes WHERE \"instiName\"= '" + instiName + "';";
		return Query;
	}
	
	public String getDescriptionQuery (String instiName) {
		String Query = "SELECT description FROM public.institutes WHERE \"instiName\"= '" + instiName + "';";
		return Query;
	}
	
	public String getHomeLinkQuery (String instiName) {
		String Query = "SELECT \"homeLink\" FROM public.institutes WHERE \"instiName\"= '" + instiName + "';";
		return Query;
	}
	
	public String getDetailsQuery (ArrayList<String> instiName, String sortType) {
		 String sortText = "";
	     if (sortType.equals("NIRF Overall Ranking")) sortText = "nirf";
		 else if (sortType.equals("A-Z")) sortText = "\"instiName\"";
		 else if (sortType.equals("Fees (Low to High)")) sortText = "fees";

		String Query = "SELECT \"instiName\", fees, description, \"homeLink\" FROM public.institutes WHERE ";
		for (int i = 0; i<instiName.size()-1; i++) {
			Query = Query.concat("\"instiName\" = '" + instiName.get(i) + "' OR ");
		}
		 	Query = Query.concat("\"instiName\" = '" + instiName.get(instiName.size()-1) + "' ORDER BY " + sortText + ";");
		return Query;
	}
}
