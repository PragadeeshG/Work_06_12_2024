package com.test1;

public class CentralLoggingSystem {
	private long centralLoggingSystemId;
	private String code;
	private String centralLoggingSystemName;
	private String centralLoggingSystemDef;
	private String issueDate;
	private String benefits;
	private String maturityDate;
	private String veerifications;
	private String creationDate;
	private String modifiedDate;

	public CentralLoggingSystem() {

	}

	public CentralLoggingSystem(long centralLoggingSystemId, String code, String centralLoggingSystemName,
			String centralLoggingSystemDef, String issueDate, String benefits, String maturityDate,
			String veerifications, String creationDate, String modifiedDate) {
		super();
		this.centralLoggingSystemId = centralLoggingSystemId;
		this.code = code;
		this.centralLoggingSystemName = centralLoggingSystemName;
		this.centralLoggingSystemDef = centralLoggingSystemDef;
		this.issueDate = issueDate;
		this.benefits = benefits;
		this.maturityDate = maturityDate;
		this.veerifications = veerifications;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getCentralLoggingSystemId() {
		return centralLoggingSystemId;
	}

	public void setCentralLoggingSystemId(long centralLoggingSystemId) {
		this.centralLoggingSystemId = centralLoggingSystemId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCentralLoggingSystemName() {
		return centralLoggingSystemName;
	}

	public void setCentralLoggingSystemName(String centralLoggingSystemName) {
		this.centralLoggingSystemName = centralLoggingSystemName;
	}

	public String getCentralLoggingSystemDef() {
		return centralLoggingSystemDef;
	}

	public void setCentralLoggingSystemDef(String centralLoggingSystemDef) {
		this.centralLoggingSystemDef = centralLoggingSystemDef;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getVeerifications() {
		return veerifications;
	}

	public void setVeerifications(String veerifications) {
		this.veerifications = veerifications;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
