ackage bridgelabzRegex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserReg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validate_password= Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$",password);
        if (validate_password) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
}
