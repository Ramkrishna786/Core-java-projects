package Feb9SerializationAndDeserialization;

import java.io.Serializable;

//this class implements serializable
public class Patient implements Serializable
{
	int patientId;
	String patientName;
	String patientAddress;
	
	//constructors
	public Patient(int patientId, String patientName, String patientAddress) 
	{
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
	}
	
	//getter and setter methods
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	
	

}
