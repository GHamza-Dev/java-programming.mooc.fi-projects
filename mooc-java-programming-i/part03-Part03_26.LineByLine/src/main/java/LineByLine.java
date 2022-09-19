
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArr = str.split(" ");
            for (int i = 0; i < strArr.length; i++) {
                System.out.println(strArr[i]);
            }
        }




    }
}
