import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldest = Double.NEGATIVE_INFINITY;
        String name = "";

        while(true){
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }
            String[] strArr = str.split(",");
            double age = Double.valueOf(strArr[1]);
            if (age > oldest) {
                oldest = age;
                name = strArr[0];
            }
        }
        System.out.println("Age of the oldest: "+name);
    }
}
