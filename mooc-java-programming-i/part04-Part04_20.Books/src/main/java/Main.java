import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner read = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String choice = "";

        while (true){
            System.out.print("Title: ");
            String title = read.nextLine();
            if (title.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(read.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(read.nextLine());
            books.add(new Book(title,pages,year));
        }

        System.out.print("What information will be printed? ");
        choice = read.nextLine();
        System.out.println("");
        if (choice.equals("everything")) {
            for(Book book: books){
                System.out.println(book);
            }
        }else if (choice.equals("name")) {
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }


    }
}
