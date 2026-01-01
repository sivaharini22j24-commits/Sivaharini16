package DoctorAppoinment;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PatientInterface patient1 = new Patient();
        PatientInterface patient2  = new Patient();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter symptoms for Patient 1: ");
        String symptom = s.nextLine();
        patient1.setSymptoms(symptom);
        System.out.println("Enter doctor type for Patient 1:");
        String type = s.nextLine();
        patient1.setDoctorType(type);

        System.out.println("Enter symptoms for Patient 2: ");
        String symptom2 = s.nextLine();
        patient2.setSymptoms(symptom2);
        System.out.println("Enter doctor type for Patient 2:");
        String type2 = s.nextLine();
        patient2.setDoctorType(type2);

        if(patient1.getDoctorType()=="General"){
            DoctorInterface gd = new GeneralDoctor(224,1000,patient1);
            patient1.setGd(gd);
            gd.bookAppoinment();

        }
        else{
            DoctorInterface sd = new SpecialistDoctor(225,2000,patient1);
            patient1.setSd(sd);
            sd.bookAppoinment();

        }

        if(patient2.getDoctorType()=="General"){
            DoctorInterface gd = new GeneralDoctor(226,1000,patient2);
            patient2.setGd(gd);
            gd.bookAppoinment();
        }
        else{
            DoctorInterface sd = new SpecialistDoctor(227,2000,patient2);
            patient2.setSd(sd);
            sd.bookAppoinment();

        }
    }
}