package com.igMicroServices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SortService
 */
@WebServlet("/SortService")
public class SortService extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 	
 		String programme = request.getParameter("programme");
		String field = request.getParameter("field");
		String sortType = request.getParameter("sortType");
		
		request.setAttribute("programme", programme);
		request.setAttribute("field", field);
		request.setAttribute("sortType", sortType);
		
		daoCodes dao = new daoCodes();
		dao.connect();
		
		ArrayList<String> instiNames = dao.getInstitute(programme, field);
		ArrayList details = dao.getDetails(instiNames, sortType);
		
		ArrayList<String> institutes = (ArrayList<String>) details.get(0);
		ArrayList<Integer> fees = (ArrayList<Integer>) details.get(1);
		ArrayList<String> location = (ArrayList<String>) details.get(2);
		ArrayList<String> homeLink = (ArrayList<String>) details.get(3);
		ArrayList<String> imageLink = (ArrayList<String>) details.get(4);
		ArrayList allDegree = dao.getAllDegree (institutes, field);
		
		ArrayList<String> degreeName = (ArrayList<String>) allDegree.get(0);
		ArrayList<String> degreeValue = (ArrayList<String>) allDegree.get(1);
		
		request.setAttribute("institutes", institutes);
		request.setAttribute("location", location);
		request.setAttribute("fees", fees);
		request.setAttribute("homeLink", homeLink);
		request.setAttribute("imageLink", imageLink);
		request.setAttribute("degreeName", degreeName);
		request.setAttribute("degreeValue", degreeValue);
			
		RequestDispatcher rd = request.getRequestDispatcher("amazon.jsp");
		rd.forward(request, response);

	}

}
