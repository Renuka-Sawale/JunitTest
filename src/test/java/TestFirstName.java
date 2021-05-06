import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirstName {
    @Test
    public void firstNameTest() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.firstNameTest();
        Assertions.assertEquals(true,result);
    }

    @Test
    public void lastNameTest() {
        UserRegistractionCheck userRegistractionCheck = new UserRegistractionCheck();
        boolean result = userRegistractionCheck.lastNameTest();
        Assertions.assertEquals(true,result);
    }
}


