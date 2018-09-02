import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ImplementationTest {
    private Implementation imp;

    @Before
    public void setup() {
        imp = new Implementation();
    }

    @Test
    public void simplePassingBFS() {
        ArrayList<Node> nodes = new ArrayList<Node>();
        for (int i = 0; i < 6; i++) {
            nodes.add(new Node(Integer.toString(i)));
        }

        nodes.get(0).neighbors.add(nodes.get(1));
        nodes.get(1).neighbors.add(nodes.get(0));

        nodes.get(1).neighbors.add(nodes.get(2));
        nodes.get(2).neighbors.add(nodes.get(1));

        nodes.get(1).neighbors.add(nodes.get(3));
        nodes.get(3).neighbors.add(nodes.get(1));

        nodes.get(1).neighbors.add(nodes.get(4));
        nodes.get(4).neighbors.add(nodes.get(1));

        nodes.get(3).neighbors.add(nodes.get(2));
        nodes.get(2).neighbors.add(nodes.get(3));

        nodes.get(4).neighbors.add(nodes.get(4));
        nodes.get(3).neighbors.add(nodes.get(4));

        nodes.get(0).neighbors.add(nodes.get(4));
        nodes.get(4).neighbors.add(nodes.get(0));

        nodes.get(0).neighbors.add(nodes.get(5));
        nodes.get(5).neighbors.add(nodes.get(0));

        Graph g = new Graph(nodes);

        boolean result = imp.findRoute(g, nodes.get(0), nodes.get(3), "bfs");

        assertTrue(result);
    }

    @Test
    public void simplePassingDFS() {
        ArrayList<Node> nodes = new ArrayList<Node>();
        for (int i = 0; i < 6; i++) {
            nodes.add(new Node(Integer.toString(i)));
        }

        nodes.get(0).neighbors.add(nodes.get(1));
        nodes.get(1).neighbors.add(nodes.get(0));

        nodes.get(1).neighbors.add(nodes.get(2));
        nodes.get(2).neighbors.add(nodes.get(1));

        nodes.get(1).neighbors.add(nodes.get(3));
        nodes.get(3).neighbors.add(nodes.get(1));

        nodes.get(1).neighbors.add(nodes.get(4));
        nodes.get(4).neighbors.add(nodes.get(1));

        nodes.get(3).neighbors.add(nodes.get(2));
        nodes.get(2).neighbors.add(nodes.get(3));

        nodes.get(4).neighbors.add(nodes.get(4));
        nodes.get(3).neighbors.add(nodes.get(4));

        nodes.get(0).neighbors.add(nodes.get(4));
        nodes.get(4).neighbors.add(nodes.get(0));

        nodes.get(0).neighbors.add(nodes.get(5));
        nodes.get(5).neighbors.add(nodes.get(0));

        Graph g = new Graph(nodes);

        boolean result = imp.findRoute(g, nodes.get(0), nodes.get(5), "dfs");

        assertTrue(result);
    }
}
