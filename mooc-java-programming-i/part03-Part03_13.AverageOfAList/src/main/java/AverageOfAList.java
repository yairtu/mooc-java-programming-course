
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int in = Integer.valueOf(scanner.nextLine());
            if (in == -1) {
                break;
            }
            numbers.add(in);
        }

        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        double avg = (double)sum / numbers.size();

        System.out.println(avg);
    }
}
