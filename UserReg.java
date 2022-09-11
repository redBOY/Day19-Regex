package bridgelabzRegex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserReg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ 5][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }
}
