
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int factorial = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int total = 1;
        
        while(i <= factorial) {
            total = total * i;
            i++;
        }
        System.out.println("Factorial" + total);
    }
}
