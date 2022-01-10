
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        
        int in = Integer.valueOf(scan.nextLine());
        
        if(in < 0) {
            System.out.println("Impossible!");
        } else if(in < 50) {
            System.out.println("failed");
        } else if(in < 60) {
            System.out.println("1");
        } else if(in < 70) {
            System.out.println("2");
        } else if(in < 80) {
            System.out.println("3");
        } else if(in < 90) {
            System.out.println("4");
        } else if(in <= 100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible!");
        }
    }
}
