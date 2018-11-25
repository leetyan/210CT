
import java.util.Scanner;

public class BasicQ2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your TC:");
        double TC = input.nextDouble();
        System.out.print("Please input your HDLC:");
        double HDLC = input.nextDouble();
        System.out.print("Please input your TG:");
        double TG = input.nextDouble();

        double LDLC = TC-HDLC-TG/5;
        System.out.println("LDLC is "+LDLC);

        
    }

}
