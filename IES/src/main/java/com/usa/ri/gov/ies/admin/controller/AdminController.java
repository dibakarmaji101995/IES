package com.usa.ri.gov.ies.admin.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usa.ri.gov.ies.admin.model.CaseWorker;
import com.usa.ri.gov.ies.admin.service.AdminService;
import com.usa.ri.gov.ies.constants.AppContants;
import com.usa.ri.gov.ies.properties.AppProperties;

/*
 * This class is used to handle admin module related functionalities
*/

@Controller
public class AdminController {
	private Logger logger=LoggerFactory.getLogger(AdminController.class);
	
	@Autowired(required=true)
	private AdminService service;
	
	@Autowired(required=true)
	private AppProperties appProperties;
	/**
	 * This method is used for display case worker registration form 
	 * @param model
	 * @return
	 */
	 @RequestMapping(value="/cwReg",method=RequestMethod.GET)
     public String cwRegForm(Model model) {
		 logger.debug("AdminController.cwRegForm() method started");
		 CaseWorker cwModel=null;
		 //creating empty model object
		 cwModel=new CaseWorker();
		 //add cwModel object to spring model scope
		 model.addAttribute("cwModel",cwModel);
		 logger.debug("AdminController.cwRegForm() method ended");
		 logger.info("Case worker registration form loaded successfully");
    	 return "cwReg";
     }//method
	 
	 /**
	  * This method is used for register case worker
	  * @param cw
	  * @param model
	  * @return
	  */
	 @RequestMapping(value="/cwReg",method=RequestMethod.POST)
	 public String cwReg(@ModelAttribute(name="cwModel") CaseWorker cw,Model model) {
		 logger.debug("AdminController.cwReg() method is started");
		 boolean isSave=false;
		 Map<String,String> map=null;
		 //get all properties from AppProperties class
		 map=appProperties.getProperties();
		 //invoke service class method
		 isSave=service.cwRegistration(cw);
		 if(isSave) {
			 logger.debug("cw registration data will be stored");
			 model.addAttribute(AppContants.success,map.get(AppContants.cwRegSuccess));
			 logger.debug("AdminController.cwReg() method is ended");
			 logger.info("Case worker registration complited");
			 return "success";
		 }
		 else {
			 logger.debug("cw registration data will be not stored");
			 model.addAttribute(AppContants.failure,map.get(AppContants.cwRegFail));
			 logger.debug("AdminController.cwReg() method is ended");
			 logger.info("Case worker registration not complited");
			 return "failure";
		 }
		 
	 }
	 
}
