
import java.util.Scanner;

public class collegemanagmentsystem {
    public static void main(String[] args) {

        System.out.println("1.login");
        System.out.println("2.attendence");
        System.out.println("3.fees");
        System.out.println("4.holiday calendar");
        System.out.println("5.exit");
        do{
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice) {
                case 1: System.out.println("login successful");
                    break;
                case 2: System.out.println("50% attendence ");
                    break;
                case 3: System.out.println("fees is due kindly pay it");
                    break;
                case 4: System.out.println("upcomung holidays");
                    break;
                case 5: System.out.println(" thanks for visit");
                    break;
                default: System.out.println("please enter a valid choice ");
                    break;
            }
        }while(true);

    }
}
