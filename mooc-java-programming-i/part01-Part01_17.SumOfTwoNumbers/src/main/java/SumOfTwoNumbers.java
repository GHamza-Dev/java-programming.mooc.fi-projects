
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int nbr1 = Integer.valueOf(scanner.next());
        System.out.println("Give the second number:");
        int nbr2 = Integer.valueOf(scanner.next());
        System.out.println("The sum of the numbers is "+(nbr1+nbr2));
    }
}
