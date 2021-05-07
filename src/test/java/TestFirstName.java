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
}


