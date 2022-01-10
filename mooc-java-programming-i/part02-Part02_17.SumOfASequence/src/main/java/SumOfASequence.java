
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int in = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int count = 0;
        while(i <= in) {
            count = count + i;
            i++;
            System.out.println(count);
        }
        System.out.println(count);
    }
}
