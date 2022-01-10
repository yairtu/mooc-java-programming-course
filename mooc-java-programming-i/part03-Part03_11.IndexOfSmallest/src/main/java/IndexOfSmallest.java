
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> numbers = new ArrayList<>();
        
        int smallest = Integer.MAX_VALUE;
        int i = 0;
        int index = 0;

        while(true) {
            int in = Integer.valueOf(scanner.nextLine());
            if(in == 9999) {
                break;
            }
            numbers.add(in);
        }
        while(i < numbers.size()) {
            if(smallest > numbers.get(i)) {
                smallest = numbers.get(i);               
            }
            i++;
        }
        
        while(index < numbers.size()) {
            if(numbers.get(index) == smallest) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }
        System.out.println("Smallest number: " + smallest);
    } 
}
