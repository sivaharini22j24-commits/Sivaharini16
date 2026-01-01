package DoctorAppoinment;

public interface PatientInterface {
    public String getSymptoms();
    public void setSymptoms(String symptoms);
    public String getDoctorType();
    public void setDoctorType(String doctorType);
    public DoctorInterface getGd();
    public void setGd(DoctorInterface gd);
    public DoctorInterface getSd();
    public void setSd(DoctorInterface sd);
}
