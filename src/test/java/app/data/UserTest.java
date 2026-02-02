package app.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test void userHasShowUser() {
        User user = new User(1,"Frank");
        assertNotNull(user.showUser(), "User should have a method named showUser");
    }

    @Test void userGetId() {
        User user = new User(1,"Frank");
        assertEquals(1, user.getId(), "User with ID=1 should return 1");
    }

    @Test void userGetId1() {
        User user = new User(2,"Frank");
        assertNotEquals(1, user.getId(), "User with ID=1 should return 1");
    }

}
