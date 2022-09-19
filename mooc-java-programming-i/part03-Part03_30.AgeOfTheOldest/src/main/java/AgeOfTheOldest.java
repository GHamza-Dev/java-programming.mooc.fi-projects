
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldest = Double.NEGATIVE_INFINITY;

        while(true){
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            double age = Double.valueOf(str.split(",")[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: "+Math.round(oldest));

    }
}
