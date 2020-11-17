package geco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp() throws Exception {
        String [] listStrings = {"abc", "bcd", "aaa"};
        this.loginService = new LoginService(listStrings);
    }

    @After
    public void tearDown() throws Exception {
        this.loginService = null;
    }

    @Test
    public void loginExistsTrue() {
        assertTrue(this.loginService.loginExists("abc"));
    }

    @Test
    public void loginExistsFalse() {
        assertFalse(this.loginService.loginExists("ab"));
    }

    @Test
    public void addLogin() {
        this.loginService.addLogin("cde");
        assertTrue(this.loginService.loginExists("cde"));
    }

    @Test
    public void findAllLoginsStartingWithSize() {
        assertEquals(2, this.loginService.findAllLoginsStartingWith("a").size());
    }

    @Test
    public void findAllLoginsStartingWithFirst() {
        assertEquals("aaa", this.loginService.findAllLoginsStartingWith("a").get(0));
    }

    @Test
    public void findAllLoginsSize() {
        assertEquals(3, this.loginService.findAllLogins().size());
    }

    @Test
    public void findAllLoginsFirst() {
        assertEquals("aaa", this.loginService.findAllLogins().get(0));
    }
}