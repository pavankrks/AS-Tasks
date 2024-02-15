package com.pavan.training.tasks.task140224;

import java.util.Scanner;


//hospital interface
interface Hospital{
	String code = null;
	void consultation();
	void providingMedicines();
	void appointment();
}

//the required subclasses implementing hospital interface
class Cardiology implements Hospital{
	
		public  void consultation() {
			
		}
		
		public void providingMedicines() {
			
		}
		
		public void appointment() {
			
		}
}


//required abstract class
abstract class Neurology implements Hospital{
	
	
	//required abstract method
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


//required subclass extending the another subclass of interface
class NeuroSurgen extends Neurology{
	
	//making date private for security
	private String patientName;
	private String patientId;
	private boolean hasReports;
	private String username;
	private String password;
	private Scanner scan = new Scanner(System.in);
	int count = 0;
	
	public void consultation() {
		
	}
	
	
	
	//overloading the constructors
	public NeuroSurgen(String patientName,String patientId) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	
	public NeuroSurgen(String patientName,String patientId,boolean hasReports) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.hasReports = hasReports;
		
		System.out.println("Set Username and password");
		System.out.println("Enter Username: ");
		String username = scan.next();
		System.out.println("Enter Password: ");
		String password = scan.next();
		setCredentials(username,password);
		
	}
	
	//this is to set the password to doctor
	public void setCredentials(String username,String password) {
		if(count==0) {
			this.username = username;
			this.password = password;
			System.out.println("Successfully Created");
		}else {
			System.out.println("Can't create Username and password");
		}
		
	}
	
	
	//this is to confirm the doctor
	private boolean locker(String username, String password) {
        return this.username.equals(username) && this.password.equals(password) ;
  
    }
	
	
	//in order to get the patient details the doctor need to confirm his identity
	public void getPatientDetails() throws MyException {
		System.out.println("To view Patient Details please enter the following: ");
		System.out.println("Username: ");
		String username = scan.next();
		System.out.println("Password: ");
		String password = scan.next();
		if(locker(username,password)){
			System.out.println("Patient details are: ");
			System.out.println("Patient Name: "+patientName);
			System.out.println("Patient Id: "+patientId);
			System.out.println("Reports: "+hasReports);
		}else {
			throw new MyException("Ivalid login details..!");
		}
		
	}
	
	
}


//custom exception
class MyException extends Exception{
	
	public MyException(String message) {
        super(message);
    }
}

class Patient{
	private String patientName;
	private String patientId;
	private boolean hasReports;
	
	
	//implementing the polymorphism
	public Patient(String patientName,String patientId) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	public Patient(String patientName,String patientId,boolean hasReports) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.hasReports = hasReports;
	}
	
	
	//checking if the doctor avalability
	public boolean isDoctorAvailable(boolean check) {
		
		if(check==true) {
			System.out.println(patientName+" is ready to take the appointment");
			return true;
		}
		return false;
	}
	
}

public class Management {
	
	public static void main(String[] args) {
		NeuroSurgen surgen = new NeuroSurgen("Smith", "P12345", true);

		
		//catching the exception if we can get the patient details
        try {
            surgen.getPatientDetails();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}

}
