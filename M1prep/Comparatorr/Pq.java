
import java.util.*;

class Patient {

    private int patientId;
    private String patientName;
    private int severityLevel;

    public Patient(int patientId, String patientName, int severityLevel) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.severityLevel = severityLevel;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId +
                ", Name: " + patientName +
                ", Severity: " + severityLevel);
    }
    
    
}

 
 class TreatmentScheduler {

    PriorityQueue<Patient> patientsQueue;

    public TreatmentScheduler() {
        patientsQueue = new PriorityQueue<Patient>(new Comparator<Patient>(){
            public int compare(Patient p1,Patient p2){
                
                return Integer.compare(p2.getSeverityLevel(),p1.getSeverityLevel());
            }
        });
        }

    public void addPatient(Patient patient) {
   
        patientsQueue.add(patient);
        // add patient to queue
        System.out.println("Added -> Patient ID: " + patient.getPatientId() +
                ", Name: " + patient.getPatientName() +
                ", Severity: " + patient.getSeverityLevel());
    }

    public void treatNextPatient() {
        while(!patientsQueue.isEmpty()){
            Patient patient = patientsQueue.poll();
            System.out.println("Treating -> Patient ID: "+patient.getPatientId()+
            ", Name: "+patient.getPatientName()+", Severity: "+patient.getSeverityLevel());    
        }
    }

    public void displayNextPatient() {
        Patient patient = patientsQueue.peek();
System.out.println("Next Patient -> Patient ID: "+patient.getPatientId()+
            ", Name: "+patient.getPatientName()+", Severity: "+patient.getSeverityLevel());        
    }

    public void displayAllPatients() {
        // display all waiting patients
        if(patientsQueue.isEmpty()){
            System.out.println("No patients left to treat.");
        }
    }
}

public class Pq {

    public static void main(String[] args) {

        TreatmentScheduler scheduler = new TreatmentScheduler();

        Patient p1 = new Patient(1, "Rahul", 3);
        Patient p2 = new Patient(2, "Anjali", 5);
        Patient p3 = new Patient(3, "Vikram", 2);
        Patient p4 = new Patient(4, "Sneha", 4);

        scheduler.addPatient(p1);
        scheduler.addPatient(p2);
        scheduler.addPatient(p3);
        scheduler.addPatient(p4);

        scheduler.displayNextPatient();

        scheduler.treatNextPatient();
        scheduler.treatNextPatient();
        scheduler.treatNextPatient();
        scheduler.treatNextPatient();

        scheduler.treatNextPatient();
        scheduler.displayAllPatients();
    }
}

