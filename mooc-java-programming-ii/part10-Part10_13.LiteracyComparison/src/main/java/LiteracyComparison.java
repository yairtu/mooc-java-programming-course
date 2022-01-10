
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<String> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        //s3 is country, s4 is year, s2 is gender, s5 is literacy rate

        rows.stream()
                .map(r -> r.split(","))
                .sorted((s1, s2) -> s1[5].compareTo(s2[5]))
                .map(p -> p[3] + " (" + p[4] + "), " + p[2].replace("(%)", "").trim() + ", " + p[5])
                .forEach(l -> System.out.println(l));
                
               
        
    }
}
