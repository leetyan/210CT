import java.util.Scanner;

public class Q9 {
	public static void main(String[] args){
        int result = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 2000");
        result = scan.nextInt();
                int start = 0;
        int end = 2000;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > result) {
                end = mid - 1;
                System.out.println(mid+"  Guess too high");
            } else if (mid < result) {
                start = mid + 1;
                System.out.println(mid+"  Guess too low");
            } else {
                result = mid;
                System.out.print(result+ "  Guess the right number");
                System.out.println();
                break;
            }
        }


    }
}