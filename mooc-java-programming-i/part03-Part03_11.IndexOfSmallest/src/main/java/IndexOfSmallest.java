
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nbrs = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true){
            int nbr = Integer.valueOf(scanner.nextLine());
            if (nbr == 9999){
                break;
            }
            nbrs.add(nbr);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = nbrs.get(0);

        for (int i = 0; i < nbrs.size(); i++) {
            if (smallest > nbrs.get(i)){
                smallest = nbrs.get(i);
            }
        }

        System.out.println("Smallest number: "+smallest);

        for (int i = 0; i < nbrs.size(); i++) {
            if (smallest == nbrs.get(i)) {
                System.out.println("Found at index: "+i);
            }
        }
        
    }
}
