package com.igMicroServices;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;

public class QueriesConstants {
	
	public String getInstituteQuery (String programme, String field ) {
		String Query = "";
		if (field.equals("All")) { 
			Query = " SELECT DISTINCT institute FROM public.\"IIT Bombay\" WHERE programme= '" + programme + "' "
			+ "UNION "
			+ "SELECT institute	FROM public.\"IIT Gandhinagar\" WHERE programme= '" + programme + "' "
			+ "UNION "
			+ "SELECT institute	FROM public.\"IIT Delhi\" WHERE programme= '" + programme + "' "
			+ ";";
			}
		else {	
			Query  = "SELECT institute FROM public.\"IIT Bombay\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
			+ "UNION "
			+ "SELECT institute FROM public.\"IIT Gandhinagar\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
			+ "UNION "
			+ "SELECT institute FROM public.\"IIT Delhi\" WHERE programme= '" + programme + "' AND field= '" + field + "' "
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

		String Query = "SELECT \"instiName\", fees, location, \"homeLink\", \"imageLocation\" FROM public.institutes WHERE ";
		for (int i = 0; i<instiName.size()-1; i++) {
			Query = Query.concat("\"instiName\" = '" + instiName.get(i).trim() + "' OR ");
		}
		 	Query = Query.concat("\"instiName\" = '" + instiName.get(instiName.size()-1).trim() + "' ORDER BY " + sortText + ";");
		return Query;
	}
	
	public String getAllDegreeQuery (ArrayList<String> instiName, String field) {
		String Query = "";
		for (int i = 0; i<instiName.size()-1; i++) {
			Query += "SELECT * FROM public.\"" + instiName.get(i).trim() + "\" WHERE \"field\"= '" + field + "' ";
			Query += "UNION ";
		}
			Query += "SELECT * FROM public.\"" + instiName.get(instiName.size()-1).trim() + "\" WHERE \"field\"= '" + field + "';";
		return Query;
	}

	public String getDetailsQueryJA (JSONArray instiName, String sortType) throws JSONException {
		 String sortText = "";
	     if (sortType.equals("NIRF Overall Ranking")) sortText = "nirf";
		 else if (sortType.equals("A-Z")) sortText = "\"instiName\"";
		 else if (sortType.equals("Fees (Low to High)")) sortText = "fees";

		String Query = "SELECT \"instiName\", fees, location, \"homeLink\", \"imageLocation\" FROM public.institutes WHERE ";
		for (int i = 0; i<instiName.length()-1; i++) {
			Query = Query.concat("\"instiName\" = '" + instiName.getJSONObject(i).getString("institute").trim() + "' OR ");
		}
		 	Query = Query.concat("\"instiName\" = '" + instiName.getJSONObject(instiName.length()-1).getString("institute").trim() + "' ORDER BY " + sortText + ";");
		return Query;
	}





















}
