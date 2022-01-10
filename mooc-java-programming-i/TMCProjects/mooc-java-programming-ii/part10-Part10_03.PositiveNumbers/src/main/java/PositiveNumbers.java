
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here


    }

    public static List<Integer> positive(List<Integer> numbers) {
        numbers = new ArrayList<>();
        numbers.stream()
                .filter(main::positive)
                .collect(Collectors.toList())
                .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> numbers1 = numbers;
        return numbers1;
    }

    public static boolean positive(int value) {
        return value % 2 == 0;
    }

}
