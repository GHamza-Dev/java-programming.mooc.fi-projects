
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax = 0;
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 25_000) {
            tax = (double)  (100 + (gift-5000) * 0.08);
        } else if (gift >= 25_000 && gift <= 55_000) {
            tax = (double)  (1700 + (gift-25_000) * 0.10);
        }else if (gift >= 55_000 && gift <= 200_000) {
            tax = (double)  (4700 + (gift-55_000) * 0.12);
        }else if (gift >= 200_000 && gift <= 1_000_000) {
            tax = (double)  (22_100 + (gift-200_000) * 0.15);
        }else {
            tax = (double) (142_100 + (gift-1_000_000) * 0.17);
        }

        System.out.println("Tax: "+tax);
    }
}
