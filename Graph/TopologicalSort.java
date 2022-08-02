package Graph;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
    int V;
    LinkedList<Integer>[] adjList;

    TopologicalSort(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEgde(int u, int v) {
        adjList[u].addFirst(v);
    }

    public void topoSort() {
        boolean[] visited = new boolean[V];
        Stack stack = new Stack();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSortRE(i, visited, stack);
            }
        }
        System.out.println("Topological Sort: ");
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");

        }
    }

    public void topoSortRE(int s, boolean[] visited, Stack stack) {
        visited[s] = true;
        for (int i = 0; i < adjList[s].size(); i++) {
            int vertex = adjList[s].get(i);
            if (!visited[vertex])
                topoSortRE(vertex, visited, stack);
        }
        stack.push(s);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TopologicalSort g = new TopologicalSort(n);
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEgde(u , v );
        }

        g.topoSort();


//        System.out.println("Enter no. of island you want to be intially on");
//        int r= sc.nextInt();
//        try{ for (int i=0; i<m;i++){
//            System.out.println("This one-way bridge connects between");
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            if(u == v || u>n || v>n){ throw new Bounds("");}
//            else{ g.addEgde(u-1, v-1);}
//
//        }
//            g.topoSort();}
//        catch(IndexOutOfBoundsException e){
//            System.out.println("Please enter a valid input!");
//        }
//        catch(Bounds e){
//            System.out.println("Please enter a valid input!");
//        }
//
//
//    }
//    public static class Bounds extends Exception{
//
//        public Bounds (String message){
//            super(message);
//        }}

    }
}