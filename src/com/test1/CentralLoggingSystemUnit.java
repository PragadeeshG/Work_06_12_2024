package com.test1;

public class CentralLoggingSystemUnit {
	private long centralLoggingSystemId;
	private String unitId;
	private Integer numberOfSubUnits;
	private String potential;
	private String returns;
	private boolean isApproved;
	private String range;
	private boolean widerange;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CentralLoggingSystemUnit() {

	}

	public CentralLoggingSystemUnit(long centralLoggingSystemId, String unitId, Integer numberOfSubUnits,
			String potential, String returns, boolean isApproved, String range, boolean widerange, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.centralLoggingSystemId = centralLoggingSystemId;
		this.unitId = unitId;
		this.numberOfSubUnits = numberOfSubUnits;
		this.potential = potential;
		this.returns = returns;
		this.isApproved = isApproved;
		this.range = range;
		this.widerange = widerange;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getCentralLoggingSystemId() {
		return centralLoggingSystemId;
	}

	public void setCentralLoggingSystemId(long centralLoggingSystemId) {
		this.centralLoggingSystemId = centralLoggingSystemId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public Integer getNumberOfSubUnits() {
		return numberOfSubUnits;
	}

	public void setNumberOfSubUnits(Integer numberOfSubUnits) {
		this.numberOfSubUnits = numberOfSubUnits;
	}

	public String getPotential() {
		return potential;
	}

	public void setPotential(String potential) {
		this.potential = potential;
	}

	public String getReturns() {
		return returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public boolean isWiderange() {
		return widerange;
	}

	public void setWiderange(boolean widerange) {
		this.widerange = widerange;
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

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
