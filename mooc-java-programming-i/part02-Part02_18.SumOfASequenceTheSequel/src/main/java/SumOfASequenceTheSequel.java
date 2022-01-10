
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        int second = Integer.valueOf(scanner.nextLine());
        
        int i = first;
        int sum = 0;
        
        while(i <= second) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
