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
        checkInvalid(null);
        checkInvalid("1AB");
    }

    private void checkInvalid(String value) {
        try {
            similarityChecker.alphaCheck(null, null);
            fail();
        }catch (IllegalArgumentException e ){

        }
    }

    @Test
    void testAlphaChecker() {

        assertEquals(30, similarityChecker.alphaCheck("ABCD","ABC"));
    }
}