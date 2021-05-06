import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirstName {
    @Test
    public void firstNameTest() {
        FirstName firstName = new FirstName();
        boolean result = firstName.firstNameTest();
        Assertions.assertEquals(true,result);
    }
}
