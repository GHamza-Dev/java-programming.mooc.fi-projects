
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int nbrOfDates = 0;

        while (true){
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArr = str.split(",");
            sum+= Integer.valueOf(strArr[1]);
            nbrOfDates++;
            if (strArr[0].length() > longestName.length()) {
                longestName = strArr[0];
            }

        }

        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(double)sum/nbrOfDates);

    }
}
