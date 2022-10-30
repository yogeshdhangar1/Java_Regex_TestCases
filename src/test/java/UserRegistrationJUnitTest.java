import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserRegistrationJUnitTest {
    @Test
    public void firstNameTest_ShouldReturnTrue() {
        UserRegistration obj1 = new UserRegistration();
        boolean value = obj1.CheckFirstName("Yogesh");
        //test output
        assertEquals(true, value);
    }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        UserRegistration obj2 = new UserRegistration();
        boolean value = obj2.CheckLastName("Dhangar");
        //test output
        assertEquals(true, value);
    }
    @Test
    public void emailTest3_ShouldReturnTrue(){
        UserRegistration obj3 = new UserRegistration();
        boolean value = obj3.CheckEmail("abc.xyz@gmail.com");
        assertEquals(true,value);
    }
    @Test
    public void numberTest4_ShouldReturnTrue(){
        UserRegistration obj4 = new UserRegistration();
        boolean value = obj4.CheckMobileNum("919284046592");
        assertEquals(true,value);
    }
    @Test
    public void passWordTest5_ShouldReturnTrue(){
        UserRegistration obj5 = new UserRegistration();
        boolean value =obj5.CheckPass("Yogesh@5213");
        assertEquals(true,value);
    }

}
