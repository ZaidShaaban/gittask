import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ")
        String var = scanner.nextLine();
        String regexVar = "[-+]?\\d*\\.?\\d+";

        if (var.matches(regexVar)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}