package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientService;
import com.nt.vo.PatientVO;

public class PatientController {

	private IPatientService service;
	
	public PatientController(IPatientService service) {
		System.out.println("PatientController.1-param constructor.");
		this.service = service;
	}
	
	public String processCustomer(PatientVO vo) throws Exception {
		
		System.out.println("PatientController.processCustomer()");
		
		PatientDTO dto = new PatientDTO();
		
		dto.setPname(vo.getPname());
		dto.setPadd(vo.getPadd());
		dto.setNodays(Double.parseDouble(vo.getNodays()));
		dto.setPerdaycharge(Double.parseDouble(vo.getPerdaycharge()));
		
		String msgResult = service.registerPatient(dto);
		
		return msgResult;
	}
	
}
