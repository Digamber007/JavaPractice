package Graph;

import java.util.*;

public class DetectCycleInDirectedGraph {

     int v;
    private static List<List<Integer>> adj;

    public DetectCycleInDirectedGraph(int v)
    {
       // this.v = v;
        adj = new ArrayList<>(v);

        for (int i = 0; i < v; i++)
            adj.add(new LinkedList<>());
    }

    private void addEdge(List<List<Integer>> list, int u, int v) {
        adj.get(u).add(v);
    }

    private static boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack){
        if (recStack[i])
            return true;

        if (visited[i])
            return false;

        visited[i] = true;

        recStack[i] = true;
        List<Integer> children = adj.get(i);

        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;

        recStack[i] = false;

        return false;
    }

    private boolean isCyclic(){

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];

        for (int i = 0; i < v; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;

        return false;
    }


    public static void main(String[] args) {

        DetectCycleInDirectedGraph detectCycleInDirectedGraph = new DetectCycleInDirectedGraph(4);

        //Map<Integer, TreeSet<Integer>> graph = new HashMap<>();
//
//        detectCycleInDirectedGraph.addEdge(0, 1);
//        detectCycleInDirectedGraph.addEdge(0, 2);
//        detectCycleInDirectedGraph.addEdge(1, 2);
//        detectCycleInDirectedGraph.addEdge(2, 0);
//        detectCycleInDirectedGraph.addEdge(2, 3);
//        detectCycleInDirectedGraph.addEdge(3, 3);

        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            int u, v;
            for(int i=0; i<m; i++){
                u = sc.nextInt();
                v = sc.nextInt();

              //  addEdge(list, u, v);
            }

        if(detectCycleInDirectedGraph.isCyclic()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
