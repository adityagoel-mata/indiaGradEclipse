package com.igMicroServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.json.JSONArray;
import org.json.JSONException;


public class daoCodes {
	
	Connection con = null;
	QueriesConstants queryConstants = new QueriesConstants();
	
///////////////////////// Establish PostgreSQL Connection ////////////////////////////////////
	public void connect() {
		String url = "jdbc:postgresql://localhost:5432/igDemoDB";
		String username = "postgres";
		String password = "pgAdmin+237";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

///////////////////////// Fetches only institute Name ////////////////////////////////////////
	public ArrayList<String> getInstitute(String programme, String field) {
		try {
			String Query = queryConstants.getInstituteQuery(programme, field);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			ArrayList<String> institutes = new ArrayList<String>();
			while (rs.next()) {
				institutes.add(rs.getString(1));
			}
			return institutes;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	
///////////////////////// Fetches Basic Details of the Institutes ////////////////////////////
	public ArrayList getDetails(ArrayList<String> instituteName, String sortType) {
		try {
			System.out.println(instituteName);
			ArrayList Details = new ArrayList();
			ArrayList<String> instiName = new ArrayList<String>();
			ArrayList<Integer> fees = new ArrayList<Integer>();
			ArrayList<String> location = new ArrayList<String>();
			ArrayList<String> homeLink = new ArrayList<String>();
			ArrayList<String> imageLink = new ArrayList<String>();
			
			String Query = queryConstants.getDetailsQuery(instituteName, sortType);
			System.out.println(Query);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while (rs.next()) {
				instiName.add(rs.getString(1));
				fees.add(rs.getInt(2));
				location.add(rs.getString(3));
				homeLink.add(rs.getString(4));
				imageLink.add(rs.getString(5));
			}
			Details.add(instiName);
			Details.add(fees);
			Details.add(location);
			Details.add(homeLink);
			Details.add(imageLink);
			System.out.println(Details);
			return Details;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}

///////////////////////// Fetches in-depth details of the Institutes /////////////////////////
	
	public ArrayList getAllDegree(ArrayList<String> instituteName, String field) {
		try {
			ArrayList allDegree = new ArrayList();
			ArrayList degreeName = new ArrayList();
			ArrayList degreeValue = new ArrayList();
			
			for (int i=0; i<instituteName.size(); i++) {
				ArrayList nameNewArrays = new ArrayList();
				degreeName.add(nameNewArrays);
			}

			for (int i=0; i<instituteName.size(); i++) {
				ArrayList valueNewArrays = new ArrayList();
				degreeValue.add(valueNewArrays);
			}
			System.out.println(degreeName);
			System.out.println(degreeValue);
			
			String Query = queryConstants.getAllDegreeQuery(instituteName, field);
			System.out.println(Query);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				int numberOfColumns = rsmd.getColumnCount();
				String rsInstituteName = rs.getString(1).trim();
				
				for (int i=0; i<instituteName.size(); i++) {
					if (rsInstituteName.equals(instituteName.get(i).trim())) {
						for (int j=5; j<=numberOfColumns; j++) {
							((ArrayList) degreeName.get(i)).add(rsmd.getColumnName(j));
							((ArrayList) degreeValue.get(i)).add(rs.getString(j));
							
						}
					}
				}
			}
			System.out.println(degreeName);
			System.out.println(degreeValue);
			for (int i=degreeName.size()-1; i>=0; i--) {
				for (int j=((ArrayList) degreeName.get(i)).size()-1; j>=0; j--) {
					if (((ArrayList) degreeValue.get(i)).get(j) == null) {
						((ArrayList) degreeName.get(i)).remove(j);
						((ArrayList) degreeValue.get(i)).remove(j);
					}
				}
			}
				
			
			System.out.println(degreeName);
			System.out.println(degreeValue);
			allDegree.add(degreeName);
			allDegree.add(degreeValue);
			return allDegree;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}

///////////////////////// Fetches Basic Details of the Institutes (v2-ongoing) ///////////////
	public JSONArray getInstituteJA(String programme, String field) throws SQLException, JSONException {
		
			String Query = queryConstants.getInstituteQuery(programme, field);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			JSONArray institutesJA = new JSONArray();
			ResultSetConverter rsc = new ResultSetConverter();
			institutesJA = rsc.convert(rs);
			System.out.println(institutesJA);
			return institutesJA;
		
	}		

///////////////////////// Fetches in-depth details of the Institutes (v2-ongoing) ////////////
	public JSONArray getDetailsJA(JSONArray instituteName, String sortType) throws JSONException, SQLException {
		
			JSONArray DetailsJA = new JSONArray();
			String Query = queryConstants.getDetailsQueryJA(instituteName, sortType);
			System.out.println(Query);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			ResultSetConverter rsc = new ResultSetConverter();
			DetailsJA = rsc.convert(rs);
			System.out.println(DetailsJA);
			return DetailsJA;		
	}
	
	
	


}
		
