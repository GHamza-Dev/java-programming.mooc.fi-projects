
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("");

        System.out.println("Give two indices to swap:");
        int i1 = Integer.valueOf(scanner.nextLine());
        int i2 = Integer.valueOf(scanner.nextLine());

        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
