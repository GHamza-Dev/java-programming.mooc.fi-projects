
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which file should have its contents printed? ");
        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()){
                System.out.println(file.nextLine());
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
