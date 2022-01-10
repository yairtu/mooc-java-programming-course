
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Game> games = readFromFile(file);
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<Game> gameOfATeam = new ArrayList<>();

        for (Game game : games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getAwayTeam())) {
                gameOfATeam.add(game);
            }
        }
        System.out.println("Games: " + gameOfATeam.size());

        int wins = 0;
        for (Game game : gameOfATeam) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gameOfATeam.size() - wins));

    }

    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String opposingTeam = parts[1];

                int homePoints = Integer.valueOf(parts[2]);
                int opposingPoints = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, opposingTeam, homePoints, opposingPoints));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }

        return games;

    }
}
