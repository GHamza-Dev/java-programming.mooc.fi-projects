
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nbrOfNbrs = 0;

        while (true){
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if (nbr == 0) {
                break;
            }else if(nbr > 0) {
                sum+=nbr;
                nbrOfNbrs++;
            }


        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println((double) sum/nbrOfNbrs);
        }

    }
}
