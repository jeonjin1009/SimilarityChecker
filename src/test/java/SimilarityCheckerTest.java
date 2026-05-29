import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    SimilarityChecker similarityChecker;

    @BeforeEach
    void setUp() {
        similarityChecker = new SimilarityChecker();
    }

    @Test
    void inputInvalid() {
        assertThrows(IllegalArgumentException.class, () -> similarityChecker.check(null, null));
        assertThrows(IllegalArgumentException.class, () -> similarityChecker.check("1AB", "ABC"));
    }

    @Test
    void testCheck() {
        // alphaCheck("ABCD","ABC") = 30, lengthCheck("ABCD","ABC") = 40 → 합계 70
        assertEquals(70, similarityChecker.check("ABCD", "ABC"));
    }
}
