package bridgelabzRegex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserReg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user email");
        String email = sc.nextLine();

        boolean validate_email= Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$",email);
        if (validate_email) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid");
        }
    }
}
