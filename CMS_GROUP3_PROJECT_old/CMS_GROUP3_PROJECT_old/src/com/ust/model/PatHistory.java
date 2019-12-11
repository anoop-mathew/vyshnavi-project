package com.ust.model;

public class PatHistory {
	private String obserDate;
	private String obsNotes;
	private String sName;
	private int prescId;
	private String medName;
	private String lname;
	private int labId;
	private String assignLabdate;
	private String precsDate;
	
	
	public PatHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatHistory(String obserDate, String obsNotes, String sName, int prescId, String medName, String lname,
			int labId, String assignLabdate, String precsDate) {
		super();
		this.obserDate = obserDate;
		this.obsNotes = obsNotes;
		this.sName = sName;
		this.prescId = prescId;
		this.medName = medName;
		this.lname = lname;
		this.labId = labId;
		this.assignLabdate = assignLabdate;
		this.precsDate = precsDate;
	}



	public String getObserDate() {
		return obserDate;
	}

	public void setObserDate(String obserDate) {
		this.obserDate = obserDate;
	}

	public String getObsNotes() {
		return obsNotes;
	}

	public void setObsNotes(String obsNotes) {
		this.obsNotes = obsNotes;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getPrescId() {
		return prescId;
	}

	public void setPrescId(int prescId) {
		this.prescId = prescId;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getAssignLabdate() {
		return assignLabdate;
	}

	public void setAssignLabdate(String assignLabdate) {
		this.assignLabdate = assignLabdate;
	}

	public String getPrecsDate() {
		return precsDate;
	}

	public void setPrecsDate(String precsDate) {
		this.precsDate = precsDate;
	}

	@Override
	public String toString() {
		return "PatHistory [obserDate=" + obserDate + ", obsNotes=" + obsNotes + ", sName=" + sName + ", prescId="
				+ prescId + ", medName=" + medName + ", lname=" + lname + ", labId=" + labId + ", assignLabdate="
				+ assignLabdate + ", precsDate=" + precsDate + "]";
	}

	

	
	
	
	
	

}
