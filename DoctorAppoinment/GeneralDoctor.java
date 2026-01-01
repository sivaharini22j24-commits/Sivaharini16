package DoctorAppoinment;

public class GeneralDoctor extends Doctor {


    public GeneralDoctor (int id, int fee,PatientInterface patient){
        this.setappoinmentId(id);
        this.setConsultationFee(fee);
        this.setPatient(patient);
    }
    public GeneralDoctor(){

    }


}
