
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int count = 0;        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                if(!line.contains(searchedFor)) {
                    continue;
                }
                count++;
            }
            
        } catch ( Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if(count == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
    }
}
