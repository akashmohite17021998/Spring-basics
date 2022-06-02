package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public class PatientServiceImpl implements IPatientService {

	private IPatientDAO dao;
	
	public PatientServiceImpl(IPatientDAO dao) {
		System.out.println("PatientServiceImpl.1-param constructor.");
		this.dao = dao;
	}
	
	@Override
	public String registerPatient(PatientDTO dto) throws Exception {
		
		System.out.println("PatientServiceImpl.registerPatient()");
		
		Double bill = dto.getNodays()*dto.getPerdaycharge();
		
		PatientBO bo = new PatientBO();
		
		bo.setPname(dto.getPname());
		bo.setPadd(dto.getPadd());
		bo.setPerdaycharge(dto.getPerdaycharge());
		bo.setNodays(dto.getNodays());
		bo.setBill(bill);
		
		return (dao.insert(bo)==0)?"Patient entry failed.":"Patient entry succedded.";
	}

}
