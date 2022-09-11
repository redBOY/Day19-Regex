package bridgelabzRegex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserReg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^[a-z]{8,}$", password);
        if (validatePassword) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
}
