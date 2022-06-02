package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO {

	private static final String PATIENT_INSERT_QUERY = "INSERT INTO corona_patient(pname, padd, perdaycharge, nodays, bill) VALUES(?,?,?,?,?)";
	
	private DataSource ds;
	
	int count = 0;
	
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl.1-param constructor.");
		this.ds = ds;
	}
	
	@Override
	public int insert(PatientBO bo) throws Exception {
		System.out.println("PatientDAOImpl.insert()");
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(PATIENT_INSERT_QUERY)){
			if(ps!=null) {
				ps.setString(1, bo.getPname());
				ps.setString(2, bo.getPadd());
				ps.setDouble(3, bo.getPerdaycharge());
				ps.setDouble(4, bo.getNodays());
				ps.setDouble(5, bo.getBill());
				count = ps.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}

}
