package GreedyAlgorithum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumCostOfRopes {

    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Queue<Long> q=new PriorityQueue<>();
        int t=Integer.parseInt(br.readLine());
        long ans=0;
        long ans1=0;

        while(t!=0)
        {

            int n=Integer.parseInt(br.readLine());
            long a[]=new long[n];
            String S[]=br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(S[i]);
            }
            for(int i=0;i<n;i++)
            {
                q.offer(a[i]);
            }
            while(!q.isEmpty() && q.size()!=1)
            {
                ans=q.poll() + q.poll();
                q.offer(ans);
                ans1=ans1+ans;
            }
            q.poll();
            System.out.println(ans1);
            ans1=0;
            t--;
        }
    }
}
