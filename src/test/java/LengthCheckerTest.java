import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthCheckerTest {

    LengthChecker lengthChecker;

    @BeforeEach
    void setUp() {
        lengthChecker = new LengthChecker();
    }

    @Test
    void inputInvalid() {
        assertThrows(IllegalArgumentException.class, () -> lengthChecker.lengthCheck(null, null));
        assertThrows(IllegalArgumentException.class, () -> lengthChecker.lengthCheck("1AB", "ABC"));
    }

    @Test
    void testLengthCheck() {
        // gap=1, shortLen=3 → tempNumber=round(1/3*100)/100=0.33 → (1-0.33)*60=40
        assertEquals(40, lengthChecker.lengthCheck("ABCD", "ABC"));
    }

    @Test
    void testLengthCheckReturnsZeroWhenNegative() {
        // 길이 차이가 매우 클 경우 0 반환 검증
        assertEquals(0, lengthChecker.lengthCheck("A", "ABCDEFGHIJK"));
    }
}
