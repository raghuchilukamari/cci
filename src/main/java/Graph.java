import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<GNode> gNodes = new ArrayList<GNode>();
    List<Edge> gEdges = new ArrayList<Edge>();


    public GNode insert_node(int value, List<Edge> edges){

        GNode node = new GNode(value,edges);
        gNodes.add(node);
        return node;

    }

    public void insert_edge(int weight, int from_node_val,int to_node_val){

        GNode from = null;
        GNode to = null;

        for (GNode node: gNodes
             ) {
               if (node.value == from_node_val) from = node;
               if (node.value == to_node_val) to = node;
        }

        if (from == null){
            from = insert_node(from_node_val,new ArrayList<Edge>());
        }
        if (to == null){
            to = insert_node(to_node_val,new ArrayList<Edge>());
        }

        Edge edge = new Edge(weight, from, to);
        from.edges.add(edge);
        to.edges.add(edge);
        gEdges.add(edge);
    }

    public void getEdgeList(){
        //[(100, 1, 2), (101, 1, 3), (102, 1, 4), (103, 3, 4)]

        for (Edge edge: gEdges
        ) {
            System.out.print(edge.weight + "," + edge.from_node.value + "," + edge.to_node.value);
            System.out.println();
        }


    }

    public void  getAdjacencyList(){
       // [(2, 100), (3, 101), (4, 102)], None, [(4, 103)], None]



    }

    public void  getAdjacencyMatrix(){
       // [[0, 100, 101, 102], [0, 0, 0, 0], [0, 0, 0, 103], [0, 0, 0, 0]]

        int max = getMax();
        int[][] adjacentMatrix = new int[max][max];

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                adjacentMatrix[i][j] = 0;
            }
        }

        for (Edge edge: gEdges
             ) {
            adjacentMatrix[edge.from_node.value-1][edge.to_node.value-1] = edge.weight;
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(adjacentMatrix[i][j] + " ");
            }
            System.out.println();
        }

     }


    public int getMax(){
        int max = -1;

        for (GNode node: gNodes
             ) {
            max = (node.value > max) ? node.value : max;
        }

        return max;
    }

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.insert_edge(100,1,2);
        graph.insert_edge(101,1,3);
        graph.insert_edge(102,1,4);
        graph.insert_edge(103,3,4);

        graph.getEdgeList();
        graph.getAdjacencyMatrix();

    }

}

class GNode {
    int value;
    List<Edge> edges;

    GNode (int value, List edges){
        this.value = value;
        this.edges = edges;
    }
}

class Edge{
    int weight = 0;
    GNode from_node;
    GNode to_node;

    Edge (int weight, GNode from_node,GNode to_node ){
        this.weight = weight;
        this.from_node = from_node;
        this.to_node = to_node;
    }
}
