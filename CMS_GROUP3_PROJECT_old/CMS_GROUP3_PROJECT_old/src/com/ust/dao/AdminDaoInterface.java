package com.ust.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ust.model.AdminRole;
import com.ust.model.AssignLabTest;
import com.ust.model.DoctorAppointment;
import com.ust.model.DoctorObservation;
import com.ust.model.DoctorStaff;
import com.ust.model.LabTest;
import com.ust.model.Medicine;
import com.ust.model.PatHistory;
import com.ust.model.Patient;
import com.ust.model.PrescDetail;
import com.ust.model.Prescription;
import com.ust.model.Staff;

public interface AdminDaoInterface {

	void setTemplate(JdbcTemplate template);

	/*---------------------------------ADMIN MODULE-----------------------------*/
	// verify login
	AdminRole selectRole(String username, String password);

	// verify doctor login
	AdminRole selectDocRole(String username, String password);

	// view staff list
	List<Staff> getStaff();

	// view staff by name
	List<Staff> getStaffByName(String sName);

	Staff getStaffById(int sId);

	// view all doctors
	List<DoctorStaff> getDoctor();

	// view doctor by name
	List<DoctorStaff> getDocByName(String sName);

	// view doctor by id
	DoctorStaff getDocById(int dId);

	AdminRole getRoleName(String roleName);

	// disable staff
	int disableStaff(int sId);

	// disable doctor
	int disableDoctor(int dId);

	// disable medicine
	int disableMedicine(int medId);

	// view medicine list
	List<Medicine> getMedicine();

	// view medicine by name
	List<Medicine> getMedByName(String medName);

	List<Medicine> getMedById(String medId);

	// save medicine
	int saveMed(Medicine a1);

	int updateMed(Medicine a1, int medId);

	// save staff
	int saveStaff(Staff staff, String roleName);

	//save patient
	int savePatient(Patient pa);

	//save doctor
	int saveDoctor(DoctorStaff ds, String roleName);

	// view patient list
	List<Patient> getPatients();

	// view patient by name
	List<Patient> getPatientByName(String regName);

	// get patient info
	Patient getPatientByRegId(int regId);

	// get available doctors
	List<Staff> getAvailableDoctorByDay();
	/*---------------------------------DOCTOR MODULE-------------------------------------*/

	// get all test
	List<LabTest> getLabTest();

	// get all medicine
	List<Medicine> getAllMedicines();

	// add patient comments
	int addPatientComments(DoctorObservation obs, int regId, int dId);

	// add lab test request
	int doc_getLabId(String labName);

	int addlabtestRequest(AssignLabTest doc_bean, String labName);

	// get doctor appointment
	List<DoctorAppointment> getTodaysDoctorAppointment(int dId);

	// get todays appointment
	List<DoctorAppointment> getTodaysAppointment();

	long getDocId(String date, int regId);

	int addPrescription(Prescription prescription, String date);

	int addPrescDetail(List<PrescDetail> prescDetail);

	List<Prescription> getPrescription();

	List<PrescDetail> getPrescriptionDetail();

	int updatePatient(Patient pa);

	int updateDoctor(int sId, DoctorStaff doc, String roleName);

	//update staff
	int updateStaff(Staff st, String roleName);

	//get Lab History
	List<PatHistory> getlabHistory(int regId);

	//get Medicine History
	List<PatHistory> getMedicineHistory(int regId);

	//get Observation History
	List<PatHistory> getObservationHistory(int regId);

}