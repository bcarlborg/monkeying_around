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
        assertFalse(imp.isUnique("a"));
    }
}
