import java.util.regex.Pattern;

public class UserRegistractionCheck {
    private static final String First_Name_Check="(^[A-Z]{1}[a-z]{2,}$)";
    private static final String Last_Name_Check=("^[A-Z]{1}[a-z]{2,}");

    public boolean firstNameTest(String name) {
        boolean test= Pattern.compile(First_Name_Check).matcher(name).matches();
        if (test){
            System.out.println(name + " Is valid");
        }
        else {
            System.out.println(name + " Is not valid");
        }
        return test;
    }
    public boolean lastNameTest(String lastName) {
        boolean test= Pattern.compile(Last_Name_Check).matcher(lastName).matches();
        if (test){
            System.out.println(lastName + " Is valid");
        }
        else {
            System.out.println(lastName + " Is not valid");
        }
        return test;
    }
}
