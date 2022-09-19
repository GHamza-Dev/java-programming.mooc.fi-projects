
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbr = Integer.valueOf(scanner.nextLine());
        int nbr1 = Integer.valueOf(scanner.nextLine());

        int sum = nbr + nbr1;

        if (sum > 0) {
            System.out.println(Math.sqrt(sum));
        }
    }
}
