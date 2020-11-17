package geco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        this.loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        this.loginGenerator = new LoginGenerator(loginService);
    }

    @After
    public void tearDown() throws Exception {
        loginService = null;
        loginGenerator = null;
    }

    //CT1 : quand on génère le login de "Paul Durand", on vérifie que le login
    //généré et ajouté à la liste des logins existants est "PDUR".
    @Test
    public void generateLoginForNomAndPrenomCT1() {
        assertEquals("PDUR", this.loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    //CT2 : quand on génère le
    //login de "John Ralling", on vérifie que le login généré et ajouté à la liste des logins
    //existants est "JRAL2"
    @Test
    public void generateLoginForNomAndPrenomCT2() {
        assertEquals("JRAL2", this.loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    //CT3 : quand on génère le login de "Jean Rolling", on vérifie que le login
    //généré et ajouté à la liste des logins existants est "JROL1"
    @Test
    public void generateLoginForNomAndPrenomCT3() {
        assertEquals("JROL1", this.loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    //CT4 : quand on génère le login de "Paul Dùrand", on vérifie que le login
    //généré et ajouté à la liste des logins existants est "PDUR".
    @Test
    public void generateLoginForNomAndPrenomCT4() {
        assertEquals("PDUR", this.loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }
}