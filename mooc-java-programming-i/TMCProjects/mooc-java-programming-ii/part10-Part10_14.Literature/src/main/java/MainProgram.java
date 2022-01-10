
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
            System.out.println("");
        }

        Comparator<Book> compare = Comparator
                .comparing(Book::getAge)
                        .thenComparing(Book::getName);

        Collections.sort(books, compare);

        System.out.println("");
        System.out.println(books.size() + " books in total");
        System.out.println("");
        books.forEach(book -> System.out.println(book));
    }

}
