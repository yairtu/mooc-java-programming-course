
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int in = Integer.valueOf(scanner.nextLine());
        
        while(in <= 100) {
            System.out.println(in);
            in++;
        }
    }
}
