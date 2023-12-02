import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testing {
    /**
     * Write a java program that validates if a string read from the console is a
     * valid floating-point number
     * (e.g., 22.01, 2.0, 33, 0.4, .5 are all valid)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String var = scanner.nextLine();
        String regexVar = "[-+]?\\d*\\.?\\d+";

        if (var.matches(regexVar)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}