package com.igMicroServices;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Servlet implementation class SortService
 */
@WebServlet("/SortService")
public class SortService extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 ///////////////////////// Get all the parameters from the URL ///////////////////////////	
 		String programme = request.getParameter("programme");
		String field = request.getParameter("field");
		String sortType = request.getParameter("sortType");
		
////////////////////////// Establish connection with PostgreSQL //////////////////////////
		daoCodes dao = new daoCodes();
		dao.connect();
		
		
////////////////////////// Fetch data as JSONArray (v2 - ongoing) ////////////////////////		
		
		try {
			JSONArray instiNamesJA = dao.getInstituteJA(programme, field);
			JSONArray detailsJA = dao.getDetailsJA(instiNamesJA, sortType);
		} 
		catch (SQLException e) {e.printStackTrace();} 
		catch (JSONException e) {e.printStackTrace();}
		
////////////////////////// Fetch data as Arrays (v1 - completed) /////////////////////////
		ArrayList<String> instiNames = dao.getInstitute(programme, field);     // fetches name of the institute offering the 'programme' in the 'field'

		ArrayList details = dao.getDetails(instiNames, sortType);              // fetch basic details of the institute in details Array according to the sort option
		ArrayList<String> institutes = (ArrayList<String>) details.get(0);     // break the details Arrays into 5 specific arrays below
		ArrayList<Integer> fees = (ArrayList<Integer>) details.get(1);
		ArrayList<String> location = (ArrayList<String>) details.get(2);
		ArrayList<String> homeLink = (ArrayList<String>) details.get(3);
		ArrayList<String> imageLink = (ArrayList<String>) details.get(4);
		
		ArrayList allDegree = dao.getAllDegree (institutes, field);			   // fetch all the in-depth details of the institutes i.e all degrees offered
		ArrayList<String> degreeName = (ArrayList<String>) allDegree.get(0);   // break the array into 2
		ArrayList<String> degreeValue = (ArrayList<String>) allDegree.get(1);
		
		
//////////////////////////// set attributes to parse to JSP //////////////////////////////		
		request.setAttribute("programme", programme);
		request.setAttribute("field", field);
		request.setAttribute("sortType", sortType);
		request.setAttribute("institutes", institutes);
		request.setAttribute("location", location);
		request.setAttribute("fees", fees);
		request.setAttribute("homeLink", homeLink);
		request.setAttribute("imageLink", imageLink);
		request.setAttribute("degreeName", degreeName);
		request.setAttribute("degreeValue", degreeValue);

//////////////////////////// Redirect to the .jsp page with all the set attributes ////////
		RequestDispatcher rd = request.getRequestDispatcher("amazon.jsp");
		rd.forward(request, response);

	}

}
