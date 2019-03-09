package com.usa.ri.gov.ies.admin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.ri.gov.ies.admin.entity.CaseWorkerMasterEntity;
import com.usa.ri.gov.ies.admin.model.CaseWorker;
import com.usa.ri.gov.ies.admin.repository.CaseWorkerMasterRepository;
import com.usa.ri.gov.ies.utility.PasswordUtils;

@Service(value="adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired(required = true)
	private CaseWorkerMasterRepository cwMasterRepository;

	@Override
	public boolean cwRegistration(CaseWorker cw) {
		CaseWorkerMasterEntity cwMasterEntity = null;
		String encryptedPwd = null;
		// create CaseWorkerMasterEntity class object
		cwMasterEntity = new CaseWorkerMasterEntity();
		// convert model class object data to entity class object data
		BeanUtils.copyProperties(cw, cwMasterEntity);
		// Encrypt entity class object password field
		// invoke encrypt method
		encryptedPwd = PasswordUtils.encrypt(cw.getPassword());
		// set this encrypted password value to entity class object field password
		cwMasterEntity.setPassword(encryptedPwd);
		// use dao/repository class object to invoke its method
		cwMasterEntity = cwMasterRepository.save(cwMasterEntity);
		if (cwMasterEntity.getCaseWorkerId() > 0) {
			return true;
		} 
		else {
			return false;
		}
	}

}
