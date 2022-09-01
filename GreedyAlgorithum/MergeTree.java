package GreedyAlgorithum;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeTree {

    static int count=0;

    static void dfs(ArrayList<Integer>[] li,boolean visited [],int src){
        if(visited[src]) return;
        visited[src]=true;
        count++;
        for(int i : li [src]){
            dfs(li,visited,i);
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int nodes=sc.nextInt();
        int edges=sc.nextInt();

        ArrayList<Integer> li [] =new ArrayList [nodes+1];
        for(int i=0;i<=nodes;i++)
            li[i]=new ArrayList<>();
        for(int i=0;i<edges;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            li[u].add(v);
            li[v].add(u);
        }
        boolean [] visited=new boolean [nodes+1];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=1;i<=nodes;i++){
            if(visited[i]==false){
                count=0;
                dfs(li,visited,i);
                pq.add(count);
            }
        }
        long ans=0;
        while(pq.size()>1){
            int sumOfTwoComp=pq.poll() + pq.poll();
            ans+=sumOfTwoComp;
            pq.add(sumOfTwoComp);
        }
        System.out.println(ans);
    }
}
