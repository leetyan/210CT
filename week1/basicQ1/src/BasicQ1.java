
import java.util.Scanner;

public class BasicQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your weight:");
        double weight = input.nextDouble();
        System.out.print("Please input your height:");
        double height = input.nextDouble();

        double FC = weight / (height * height);

        if (FC > 25) {
            System.out.println("Too Fat, need to keep fit!");
        } else if (FC < 15) {
            System.out.println("Too Thin, need to keep fat!");
        } else {
            System.out.println("Just fit, keep on!");
        }
        
        
    }

}
