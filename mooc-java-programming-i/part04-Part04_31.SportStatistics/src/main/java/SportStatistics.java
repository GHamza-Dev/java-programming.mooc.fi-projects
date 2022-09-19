
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gamesCounter = 0;
        int winsCounter = 0;
        int losesCounter = 0;

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))){
            while (file.hasNextLine()){
                String record = file.nextLine();
                if (record.contains(team)) {
                    gamesCounter++;
                }

                String[] tmpArr = record.split(",");
                String team1 = tmpArr[0];
                String team2 = tmpArr[1];
                int r1 = Integer.valueOf(tmpArr[2]);
                int r2 = Integer.valueOf(tmpArr[3]);

                if ((team.equals(team1) && r1 > r2) || (team.equals(team2) && r1 < r2)) {
                    winsCounter++;
                } else if ((team.equals(team1) && r1 < r2) || (team.equals(team2) && r1 > r2)){
                    losesCounter++;
                }

            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Games: "+gamesCounter);
        System.out.println("Wins: "+winsCounter);
        System.out.println("Losses: "+losesCounter);
    }

}
