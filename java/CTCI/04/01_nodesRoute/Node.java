import java.util.ArrayList;

public class Node {
    public ArrayList<Node> neighbors;
    public State state;
    public String name;

    public Node(String name) {
        this.neighbors = new ArrayList<Node>();
        this.state = State.unvisited;
        this.name = name;
    }

}
