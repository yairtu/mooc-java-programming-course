import java.util.Locale;

public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.toLowerCase().matches("(sun|mon|tue|wed|thu|fri|sat)");
    }

    public boolean allVowels(String string) {
        return string.matches("[a,e,i,o,u]*");
    }

    public boolean timeOfDay(String string) {
        return string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)");
    }

}
