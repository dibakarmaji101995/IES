package com.usa.ri.gov.ies.admin.model;

import java.util.Date;


import lombok.Data;

@Data
public class CaseWorker {
	private int caseWorkerId;

	private String firstName;

	private String lastName;
	
	private String password;

	private Date dob;

	private String email;

	private long ssn;

	private String phoneNumber;

	private String gender;

	private String activeMode;

	private Date createDate;

	private Date updateDate;
}// class
