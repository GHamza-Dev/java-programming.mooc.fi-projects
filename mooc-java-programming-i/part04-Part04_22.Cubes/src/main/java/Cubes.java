
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String strNbr = scanner.nextLine();

            if (strNbr.equals("end")) {
                break;
            }

            int number = Integer.valueOf(strNbr);
            System.out.println(number*number*number);
        }
    }
}
