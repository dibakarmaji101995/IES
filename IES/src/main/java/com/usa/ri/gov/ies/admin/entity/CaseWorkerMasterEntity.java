package com.usa.ri.gov.ies.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="CW_MASTER")
public class CaseWorkerMasterEntity {
	@Id
	@GeneratedValue
	@Column(name="CW_ID",length=20)
     private int caseWorkerId;
	
	@Column(name="CW_FName",length=40)
     private String firstName;
	
	@Column(name="CW_LNAME",length=40)
     private String lastName;
	
	@Column(name="CW_PWD",unique=true,length=40)
	private String password;
	
	@Column(name="CW_DOB")
     private Date dob;
	
	@Column(name="CW_EMIAL",unique=true,length=40)
     private String email;
	
	@Column(name="CW_SSN",unique=true,length=30)
	private long ssn;
	
	@Column(name="CW_PHNUMBER",length=20)
     private String phoneNumber;
	
	@Column(name="CW_GENDER",length=10)
     private String gender;
	
	@Column(name="CW_MODE",length=20)
     private String activeMode;
	
	@Column(name="CW_CDATE")
	@CreationTimestamp
	 private Date createDate;
	
	@Column(name="CW_UDATE")
	@UpdateTimestamp
     private Date updateDate;
}//class
