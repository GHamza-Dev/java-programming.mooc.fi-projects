
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Last number?");
        int nbr = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i < nbr+1; i++) {
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
