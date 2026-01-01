package DoctorAppoinment;

public class SpecialistDoctor extends Doctor {

    public SpecialistDoctor (int id, int fee,PatientInterface patient){
        this.setappoinmentId(id);
        this.setConsultationFee(fee);
        this.setPatient(patient);
    }
    public SpecialistDoctor(){

    }


}