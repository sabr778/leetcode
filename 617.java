/**
 * public class GraphNode {
 *   public int key;
 *   public List<GraphNode> neighbors;
 *   public GraphNode(int key) {
 *     this.key = key;
 *     this.neighbors = new ArrayList<GraphNode>();
 *   }
 * }
 */
public class Solution {
  public boolean isBipartite(List<GraphNode> graph) {
    HashMap<GraphNode, Integer> map = new HashMap<>();
    for (GraphNode node : graph) {        
        if (!BFS(node, map)) {
            return false;
        }
    }
    return true;
  }

  private BFS(GraphNode root, HashMap<GraphNode, Integer> map) {
    if (map.containsKey(root)) {
        return true;
    }
    Queue<GraphNode> queue = new LinkedList<GraphNode>();
    queue.offer(root);
    map.put(root, 0);
    while (queue.size() > 0) {
        GraphNode node = queue.poll();
        int sign = map.get(node);
        int neighborSign = sign == 0 ? 1:0;
        for (GraphNode neighborNode : node.neighbors) {
            if (map.containsKey(neighborNode)) {
                if (map.get(neighborNode) != neighborSign) return false;
            } else {
                queue.offer(neighborNode);
                map.put(neighborNode, neighborSign);
            }
        }
    }
    return true;
  }
}
