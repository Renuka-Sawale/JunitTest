import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistractionCheck {
    boolean test;
    public boolean firstNameTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        String string = scan.nextLine();
        test= Pattern.compile("(^[A-Z]{1}[a-z]{2,}$)").matcher(string).matches();

        if (test){
            System.out.println("First name is valid");
        }
        else {
            System.out.println("First name is not valid");
        }
        return test;
    }

    public boolean lastNameTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Last Name");
        String string = scan.nextLine();
        test= Pattern.compile("^[A-Z]{1}[a-z]{2,}").matcher(string).matches();
        if (test) {
            System.out.println("The given input is valid");
        }
        else {
            System.out.println("The given input is not valid");
        }
        return test;
    }

    public static void main(String[] args) {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        userRegistractionCheck.firstNameTest();
        userRegistractionCheck.lastNameTest();

    }
}
