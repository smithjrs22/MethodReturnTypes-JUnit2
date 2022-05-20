import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing Different Method Return Types")
class MethodReturnTypesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @DisplayName("Testing the Main Method")
    @org.junit.jupiter.api.Test
    void mainPrintsOut() {
        assertEquals("String of text", MethodReturnTypes.stringy("String of text"));
        assertEquals(5 , MethodReturnTypes.inty(5));
        assertFalse(MethodReturnTypes.booly(false), "false");
    }

    @DisplayName("Testing the String Method")
    @org.junit.jupiter.api.Test
    void returnString() {
        assertEquals("String of text", MethodReturnTypes.stringy("String of text"));
    }
    @DisplayName("Testing the Integer Method")
    @org.junit.jupiter.api.Test
    void returnsInteger() {
        assertEquals(15 , MethodReturnTypes.inty(15));
    }
    @DisplayName("Testing the Boolean Method")
    @org.junit.jupiter.api.Test
    void returnsBoolean() {
        assertTrue(MethodReturnTypes.booly(true), "true");
    }
}