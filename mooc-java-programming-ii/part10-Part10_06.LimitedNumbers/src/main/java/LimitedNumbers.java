
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> n = new ArrayList<>();

        while (true) {
            int in = Integer.valueOf(scanner.nextLine());

            if (in < 0) {
                break;
            }
            
            n.add(in);
        }
        
        n.stream().filter(num -> num > 0 && num < 6).forEach(number -> System.out.println(number));
    }
}
