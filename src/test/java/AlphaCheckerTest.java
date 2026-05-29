import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaCheckerTest {

    AlphaChecker alphaChecker;

    @BeforeEach
    void setUp() {
        alphaChecker = new AlphaChecker();
    }

    @Test
    void inputInvalid() {
        assertThrows(IllegalArgumentException.class, () -> alphaChecker.alphaCheck(null, null));
        assertThrows(IllegalArgumentException.class, () -> alphaChecker.alphaCheck("1AB", "ABC"));
    }

    @Test
    void testAlphaCheck() {
        // {A,B,C,D} 합집합 4개, 교집합 {A,B,C} 3개 → 3/4 * 40 = 30
        assertEquals(30, alphaChecker.alphaCheck("ABCD", "ABC"));
    }
}
