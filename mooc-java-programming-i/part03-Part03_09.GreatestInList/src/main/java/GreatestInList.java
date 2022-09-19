
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        double greatest = Double.NEGATIVE_INFINITY;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (greatest < input){
                greatest = input;
            }
            list.add(input);
        }

        System.out.println("The greatest number: " + Math.round(greatest));

        // 3 6 9 12 15 -1
    }
}
