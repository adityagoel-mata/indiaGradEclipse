package com.igMicroServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class daoCodes {
	
	Connection con = null;
	QueriesConstants queryConstants = new QueriesConstants();
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
	
	public ArrayList getDetails(ArrayList<String> instituteName, String sortType){
		try {
			System.out.println(instituteName);
			ArrayList Details = new ArrayList();
			ArrayList<String> instiName = new ArrayList<String>();
			ArrayList<Integer> fees = new ArrayList<Integer>();
			ArrayList<String> description = new ArrayList<String>();
			ArrayList<String> homeLink = new ArrayList<String>();
			
			String Query = queryConstants.getDetailsQuery(instituteName, sortType);
			System.out.println(Query);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while (rs.next()) {
				instiName.add(rs.getString(1));
				fees.add(rs.getInt(2));
				description.add(rs.getString(3));
				homeLink.add(rs.getString(4));
			}
			Details.add(instiName);
			Details.add(fees);
			Details.add(description);
			Details.add(homeLink);
			System.out.println(Details);
			return Details;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	
	
}
