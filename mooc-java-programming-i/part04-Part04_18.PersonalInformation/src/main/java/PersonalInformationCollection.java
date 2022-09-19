
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("First name: ");
            String fname = scanner.nextLine();
            if (fname.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lname = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fname,lname,idNumber));
        }

        System.out.println("");
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName()+" "+info.getLastName());
        }

    }
}
