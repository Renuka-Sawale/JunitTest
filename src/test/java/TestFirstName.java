import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirstName {
    @Test
    public void firstNameTest() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.firstNameTest("Renuka");
        Assertions.assertTrue(result);
    }

    @Test
    public void lastNameTest() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.lastNameTest("Sawale");
        Assertions.assertTrue(result);
    }

    @Test
    public void emailTest() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.emailTest("reenusurya11@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void phoneNo() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.phoneNoTest("91810423232323");
        Assertions.assertFalse(result);
    }

    @Test
    public void password() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.passwordTest("rrstpa@1234");
        Assertions.assertFalse(result);
    }
}


