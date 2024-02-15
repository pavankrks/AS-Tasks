package com.pavan.training.tasks.task140224;

interface Hospital{
	String code = null;
	void consultation();
	void providingMedicines();
	void appointment();
}

class Cardiology implements Hospital{
	
		public  void consultation() {
			
		}
		
		public void providingMedicines() {
			
		}
		
		public void appointment() {
			
		}
}

abstract class Neurology implements Hospital{
	
	abstract public void consultation();
	public void providingMedicines() {
		
	}
	public void appointment() {
		
	}
}

class Pediatrics implements Hospital{
	public void consultation() {
		
	}
	
	public void providingMedicines() {
		
	}
	
	public void appointment() {
		
	}
}

class NeuroSurgen extends Neurology{
	
			
	private String patientName;
	private String patientId;
	private boolean hasReports;
	private String username;
	private String password;
	
	public void consultation() {
		
	}
	
	public NeuroSurgen(String patientName,String patientId) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	
	public NeuroSurgen(String patientName,String patientId,boolean hasReports) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.hasReports = hasReports;
	}
	
	int count = 0;
	public void setCredentials(String username,String password) {
		if(count==0) {
			this.username = username;
			this.password = password;
			System.out.println("Successfully Created");
		}else {
			System.out.println("Can't create Username and password");
		}
		
	}
	
	private boolean checkLoginDetails(String username, String password) {
        return this.username.equals(username) && this.password.equals(password) ;
  
    }
	
	public void getPatientDetails() {
		
		if(checkLoginDetails)
	}
	
	
	
	
	
}

class Patient{
	private String patientName;
	private String patientId;
	private boolean hasReports;
	
	public Patient(String patientName,String patientId) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	public Patient(String patientName,String patientId,boolean hasReports) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.hasReports = hasReports;
	}
	
	public boolean isDoctorAvailable(boolean check) {
		
		if(check==true) {
			System.out.println(patientName+" is ready to take the appointment");
			return true;
		}
		return false;
	}
	
}

public class Management {

}
