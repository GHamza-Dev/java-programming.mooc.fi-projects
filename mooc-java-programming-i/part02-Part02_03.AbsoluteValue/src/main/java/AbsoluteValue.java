
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbr = Integer.valueOf(scanner.nextLine());

        if (nbr < 0) {
            System.out.println(nbr * (-1));
        }else {
            System.out.println(nbr);
        }
    }
}
