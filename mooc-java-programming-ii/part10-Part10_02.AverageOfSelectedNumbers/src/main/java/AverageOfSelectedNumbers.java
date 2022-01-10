
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> n = new ArrayList<>();
        
        while (true) {
            String in = scanner.nextLine();
            
            if (in.equalsIgnoreCase("end")) {
                break;
            }
        
            n.add(in);
            
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String a = scanner.nextLine();
        
        if(a.equalsIgnoreCase("n")) {
            System.out.println("Average of the negative numbers: " + n.stream().mapToInt(i -> Integer.valueOf(i)).filter(num -> num < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + n.stream().mapToInt(i -> Integer.valueOf(i)).filter(num -> num > 0).average().getAsDouble());
        }
    }
}
