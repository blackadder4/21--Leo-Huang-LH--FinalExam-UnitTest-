import org.example.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Test_StringCalculator {
    private StringCalculator tested;
    @BeforeEach
    public void setUp() {
        tested= new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        tested = null;
    }
    @Test
    public void testCount1() {
        // test for exception assertion
        assertThrows(IllegalArgumentException.class,() ->tested.add("-1,5"), "Should not execute allow negative");
    }
    @Test
    public void testCount2(){
        //testing behavior for zeroing beyond 1000
        int result = tested.add("1001,5");
        assertEquals(result,5);
    }
}
