package DoctorAppoinment;

public abstract class Doctor implements DoctorInterface{
    private int appoinmentId;
    private int consultationFee;

    private PatientInterface patient;

    public int getappoinmentId() {
        return  appoinmentId;
    }

    public void setappoinmentId (int appointId) {
        this. appoinmentId = appointId;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }


    public void bookAppoinment(){
        System.out.println("Appointment Booked for:");
        System.out.println(this.patient.getSymptoms());
        System.out.println("Consultation Fee :");
        System.out.println(this.consultationFee);
        System.out.println("AppoinmentId :");
        System.out.println(this.appoinmentId);
    }

    public PatientInterface getPatient() {
        return patient;
    }

    public void setPatient(PatientInterface patient) {
        this.patient = patient;
    }
}
