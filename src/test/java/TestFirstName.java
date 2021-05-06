import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirstName {
    @Test
    public void firstNameTest() {
        UserRegistractionCheck firstName = new UserRegistractionCheck();
        boolean result = firstName.firstNameTest();
        Assertions.assertEquals(true,result);
    }
}
