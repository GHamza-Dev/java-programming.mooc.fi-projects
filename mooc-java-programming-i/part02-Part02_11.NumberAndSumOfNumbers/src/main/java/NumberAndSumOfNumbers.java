
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nbrOfNbrs = 0;

        while (true){
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if (nbr == 0) {
                break;
            }else {
                sum+=nbr;
            }

            nbrOfNbrs++;
        }

        System.out.println("Sum of the numbers: "+sum);
        System.out.println("Number of numbers: "+nbrOfNbrs);
    }
}
