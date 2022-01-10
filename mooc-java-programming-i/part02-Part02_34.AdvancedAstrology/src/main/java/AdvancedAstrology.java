
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 0;
        int stars = 1;
        while ((size - 1) >= i) {
            printSpaces(size - 1);
            printStars(stars);

            stars++;
            size--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        int stars = 1;
        int spaces = height;
        while (i < height) {
            printSpaces(spaces-1);
            printStars(stars);

            stars = stars + 2;
            i++;
            spaces--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("--------");
        christmasTree(5);

    }
}
