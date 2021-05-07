import java.util.regex.Pattern;

public class UserRegistractionCheck {
    private static final String First_Name_Check="(^[A-Z]{1}[a-z]{2,}$)";
    private static final String Last_Name_Check=("^[A-Z]{1}[a-z]{2,}");
    private static final String Email_Check=("^[a-zA-Z[0-9]+.-]*+[a-zA-Z0-9+]*@[a-zA-Z0-9+.,]*+$");
    private static final String PhoneNo_Check=("^[0-9]{1,2} [0-9]{10}");
    private static final String Password_Check=("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");

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

    public boolean emailTest(String email) {
        boolean test= Pattern.compile(Email_Check).matcher(email).matches();
        if (test){
            System.out.println(email + " Is valid");
        }
        else {
            System.out.println(email + " Is not valid");
        }
        return test;
    }

    public boolean phoneNoTest(String phoneNo) {
        boolean test= Pattern.compile(PhoneNo_Check).matcher(phoneNo).matches();
        if (test){
            System.out.println(phoneNo + " Is valid");
        }
        else {
            System.out.println(phoneNo + " Is not valid");
        }
        return test;
    }

    public boolean passwordTest(String password) {
        boolean test= Pattern.compile(Password_Check).matcher(password).matches();
        if (test){
            System.out.println(password + " Is valid");
        }
        else {
            System.out.println(password + " Is not valid");
        }
        return test;
    }
}
