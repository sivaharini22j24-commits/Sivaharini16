package DoctorAppoinment;

public interface DoctorInterface  {
    public int getappoinmentId();
    public void setappoinmentId (int appointId);
    public int getConsultationFee();
    public void setConsultationFee(int consultationFee);
    public void bookAppoinment();
    public PatientInterface getPatient();
    public void setPatient(PatientInterface patient);
}
