
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = Integer.valueOf(scanner.nextLine());
        int nbr1 = Integer.valueOf(scanner.nextLine());

        if (nbr > nbr1) {
            System.out.println(nbr+" is greater than "+nbr1);
        }else if (nbr < nbr1) {
            System.out.println(nbr+" is smaller than "+nbr1);
        }else {
            System.out.println(nbr+" is equal to "+nbr);
        }

    }
}
