
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> nums = new ArrayList<>();
        while (true) {
            String in = scanner.nextLine();

            if (in.equalsIgnoreCase("end")) {
                break;
            }

            nums.add(in);

        }
        
        System.out.println("average of the numbers: " + nums.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble());
    }
}
