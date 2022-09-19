
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            int nbr = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (nbr == 0) {
                break;
            }else {
                sum+=nbr;
            }
        }

        System.out.println("Sum of the numbers: "+sum);
    }
}
