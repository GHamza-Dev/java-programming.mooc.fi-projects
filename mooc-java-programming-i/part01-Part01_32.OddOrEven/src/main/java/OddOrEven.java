
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int nbr = Integer.valueOf(scan.next());

        if (nbr%2 == 0) {
            System.out.println("Number "+nbr+" is even.");
        }else {
            System.out.println("Number "+nbr+" is odd.");
        }
    }
}
