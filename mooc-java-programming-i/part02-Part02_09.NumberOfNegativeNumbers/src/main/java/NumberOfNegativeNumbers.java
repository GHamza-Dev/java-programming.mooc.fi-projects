
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrOfNegative = 0;

        while (true){
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if (nbr == 0) {
                break;
            } else if (nbr < 0) {
                nbrOfNegative++;
            }
        }

        System.out.println("Number of negative numbers: "+nbrOfNegative);

    }
}
