
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(s -> s.split(","))
                    .sorted((s1, s2) -> s1[5].compareTo(s2[5]))
                    .map(p -> p[3] + " (" + p[4] + "), " + p[2].replace(" (%)", "").trim() + ", " + p[5])
                    .forEach(s -> System.out.println(s));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
