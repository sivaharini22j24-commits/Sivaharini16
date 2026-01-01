package DoctorAppoinment;

public class Patient implements PatientInterface{
    private String symptoms;
    private String doctorType;


    private DoctorInterface gd;
    private DoctorInterface sd;

    public Patient(String symp, String type){
        this.symptoms = symp;
        this.doctorType = type;
    }
    public Patient(){

    }


    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public DoctorInterface getGd() {
        return gd;
    }

    public void setGd(DoctorInterface gd) {
        this.gd = gd;
    }

    public DoctorInterface getSd() {
        return sd;
    }

    public void setSd(DoctorInterface sd) {
        this.sd = sd;
    }
}