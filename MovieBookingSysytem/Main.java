package MovieBookingSysytem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        ViewerInterface viewer1 = new Viewer();
        ViewerInterface viewer2 = new Viewer();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of seats :");
        BigInteger seats = new BigInteger (scan.nextLine());
        viewer1.setNoOfSeats(seats.intValue());

        System.out.println("Enter Screen type :");
        String screenType =  (scan.nextLine());
        viewer1.setScreenType(screenType);

        System.out.println("Do you want snacks? :");
        String snacks =  (scan.nextLine());
        viewer1.setWantsSnacks(snacks);

        System.out.println("Enter snack quantity :");
        BigInteger snackquan = new BigInteger (scan.nextLine());
        viewer1.setSnackQuantity(snackquan.intValue());

        System.out.println("Enter no of seats:");
        BigInteger seats2 = new BigInteger (scan.nextLine());
        viewer2.setNoOfSeats(seats2.intValue());

        System.out.println("Enter Screen type:");
        String screenType2 =  (scan.nextLine());
        viewer2.setScreenType(screenType2);

        System.out.println("Do you want snacks?");
        String snacks2 =  (scan.nextLine());
        viewer2.setWantsSnacks(snacks2);

        System.out.println("Enter snack quantity:");
        BigInteger snackquan2 = new BigInteger (scan.nextLine());
        viewer2.setSnackQuantity(snackquan2.intValue());

        if (viewer1.getScreenType().equals("Gold")){
            ScreenInterface gs = new GoldScreen(16,500,100,viewer1);
            ScreenInterface [] screen = viewer1.getScreen();
            screen[0]=gs;
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("Final Bill:");
            System.out.println(viewer1.getScreen()[0].getTotalBill());
            System.out.println("Booking Id:");
            System.out.println(viewer1.getScreen()[0].getBookingId());
            System.out.println("------------------------------------------------");

        }
        else if (viewer1.getScreenType().equals("Silver")){
            ScreenInterface ss = new SilverScreen(20,200,50,viewer1);
            ScreenInterface [] screen = viewer1.getScreen();
            screen[1]=ss;
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("Final Bill:");
            System.out.println(viewer1.getScreen()[1].getTotalBill());
            System.out.println("Booking Id:");
            System.out.println(viewer1.getScreen()[1].getBookingId());
            System.out.println("-------------------------------------------");


        }
        else {
            System.out.println("Enter a valid ScreenType ");
        }



        if (viewer2.getScreenType().equals("Gold")){
            ScreenInterface gs = new GoldScreen(9,500,100,viewer2);
            ScreenInterface [] screen = viewer2.getScreen();
            screen[0]=gs;
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("Final Bill:");
            System.out.println(viewer2.getScreen()[0].getTotalBill());
            System.out.println("Booking Id:");
            System.out.println(viewer2.getScreen()[0].getBookingId());
            System.out.println("-------------------------------------");

        }
        else if (viewer2.getScreenType().equals("Silver")){
            ScreenInterface ss = new SilverScreen(54,200,50,viewer2);
            ScreenInterface [] screen = viewer2.getScreen();
            screen[1]=ss;
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("Final Bill:");
            System.out.println(viewer2.getScreen()[1].getTotalBill());
            System.out.println("Booking Id:");
            System.out.println(viewer2.getScreen()[1].getBookingId());
            System.out.println("-----------------------------------------");

        }
        else {
            System.out.println("Enter a valid ScreenType: ");
        }




    }
}
