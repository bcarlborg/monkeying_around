import java.util.LinkedList;

public class Implementation {

    public boolean findRoute(Graph g, Node start, Node end, String mode) {
        if (mode.equals("bfs")) return breadthFirstSearch(g, start, end);
        if (mode.equals("dfs")) return depthFirstSearch(g, start, end);
        return false;
    }

    public boolean breadthFirstSearch(Graph g, Node start, Node end) {
        start.state = State.visited;
        LinkedList<Node> queue = new LinkedList<Node>(start.neighbors);

        while (!queue.isEmpty()) {
            Node curr = queue.removeFirst();
            curr.state = State.visited;

            if (curr == end) return true;

            for (Node curr_neighbor : curr.neighbors) {
                if (curr_neighbor.state == State.unvisited) {
                    curr_neighbor.state = State.visiting;
                    queue.push(curr_neighbor);
                }
            }
        }
        return false;
    }

    public boolean depthFirstSearch(Graph g, Node start, Node end) {
        start.state = State.visited;
        LinkedList<Node> queue = new LinkedList<Node>(start.neighbors);

        while (!queue.isEmpty()) {
            Node curr = queue.pop();
            System.out.println(curr.name);
            curr.state = State.visited;

            if (curr == end) return true;

            for (Node curr_neighbor : curr.neighbors) {
                if (curr_neighbor.state == State.unvisited) {
                    curr_neighbor.state = State.visiting;
                    queue.push(curr_neighbor);
                }
            }
        }

        return false;
    }
}
