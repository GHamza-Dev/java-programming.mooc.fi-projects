
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true){
            int nbr = scanner.nextInt();
            if (nbr == -1){
                break;
            }
            stats.addNumber(nbr);
            if (nbr%2 == 0) {
                statsEven.addNumber(nbr);
            }else {
                statsOdd.addNumber(nbr);
            }
        }

        System.out.println("Sum: "+stats.sum());
        System.out.println("Sum of even numbers: "+statsEven.sum());
        System.out.println("Sum of odd numbers: "+statsOdd.sum());
    }
}
