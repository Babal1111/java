public class Solution{
    public static void main(String[] args) {

        DischargeSummaryBuilder dsb = new DischargeSummaryBuilder();

        // Add Patient details
        dsb.addPatientDetails("Ramesh Kumar", 45, "HSP1023");

        // Add Doctor details
        dsb.addDoctorDetails("Dr. Mehta", "Cardiology");

        // Add Diagnosis
        dsb.addDiagnosis("Mild heart blockage");

        // Add Medicines
        dsb.addMedicine("Aspirin", 30);
        dsb.addMedicine("Atorvastatin", 60);

        // Add Hospital Stay details
        dsb.addStayDetails(5, 4000);

        // Apply Insurance coverage
        dsb.applyInsurance(60.0);

        // Add final bill amount
        dsb.addFinalBill();

        // Print the summary
        System.out.println(dsb.getSummary());
    }
}
 class DischargeSummaryBuilder {

    private StringBuffer summary;
    private int stayCost;
    private double insuranceAmount;
    private double finalAmount;

    public DischargeSummaryBuilder() {
        summary = new StringBuffer();
        stayCost = 0;
        insuranceAmount = 0;
        finalAmount = 0;
    }

    public void addPatientDetails(String name, int age, String patientId) {
        summary.append("Patient Name   : ").append(name).append("\n");
        summary.append("Age            : ").append(age).append("\n");
        summary.append("Patient ID     : ").append(patientId).append("\n");
        summary.append("--------------------------------------------\n");
    }

    public void addDoctorDetails(String doctorName, String department) {
        summary.append("Doctor         : ").append(doctorName).append("\n");
        summary.append("Department     : ").append(department).append("\n");
        summary.append("--------------------------------------------\n");
    }

    public void addDiagnosis(String diagnosis) {
        summary.append("Diagnosis      : ").append(diagnosis).append("\n");
        summary.append("--------------------------------------------\n");
    }

    public void addMedicine(String medicineName, int days) {
        summary.append("Medicine       : ").append(medicineName)
               .append(" (").append(days).append(" days)\n");
    }

    public void addStayDetails(int days, int costPerDay) {
        stayCost = days * costPerDay;

        summary.append("--------------------------------------------\n");
        summary.append("Hospital Stay  : ").append(days).append(" days\n");
        summary.append("Cost per Day   : Rs ").append(costPerDay).append("\n");
        summary.append("Stay Cost      : Rs ").append(stayCost).append("\n");
        summary.append("--------------------------------------------\n");
    }

    public void applyInsurance(double coveragePercent) {
        insuranceAmount = (coveragePercent / 100.0) * stayCost;
        summary.append("Insurance Cover: ").append(coveragePercent).append("%\n");
        summary.append("Insurance Amt  : -Rs ").append((int)insuranceAmount).append("\n");
        summary.append("--------------------------------------------\n");
    }

    public void addFinalBill() {
        finalAmount = stayCost - insuranceAmount;
        summary.append("Final Bill Amt : Rs ").append((int)finalAmount).append("\n");
    }

    public String getSummary() {
        return summary.toString();
    }
}
