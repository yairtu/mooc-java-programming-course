
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleBy = numbers.stream()
                .filter(num -> num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return divisibleBy;
    }

    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    public static boolean divisibleByThree(int value) {
        return value % 3 == 0;
    }

    public static boolean divisibleByFive(int value) {
        return value % 5 == 0;
    }

}
