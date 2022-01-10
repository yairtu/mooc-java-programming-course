
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("P;aster", "home improvement section");
        Product tire = new Product("Tire", 5);
        
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tire);
    }
}
