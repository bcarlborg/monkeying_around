import org.junit.*;
import static org.junit.Assert.*;

public class ImplementationTest {

    private Implementation imp;

    @Before
    public void setup() {
        imp = new Implementation();
    }

    @Test
    public void simplePassing() {
        assertTrue(imp.isUnique("abcd"));
    }

    @Test
    public void simpleSinglePassing() {
        assertTrue(imp.isUnique("a"));
    }

    @Test
    public void simpleFailing() {
        assertFalse(imp.isUnique("aa"));
    }

    @Test
    public void overlyLongFailing() {
        StringBuilder str_builder = new StringBuilder("a");
        for (char i = 0; i <= 128; i++) {
            char new_char = i;
            str_builder.append(new_char);
        }
        assertFalse(imp.isUnique(str_builder.toString()));
    }
}
