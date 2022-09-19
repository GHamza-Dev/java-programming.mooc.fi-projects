
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if (nbr == 0){
                break;
            } else if (nbr < 0) {
                System.out.println("Unsuitable number");
                continue;
            }else {
                System.out.println(nbr*nbr);
            }
        }


    }
}
