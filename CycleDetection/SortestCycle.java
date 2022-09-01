package CycleDetection;

public class SortestCycle {
}

/*
#include<bits/stdc++.h>
        using namespace std;


        #define sz 200000

        vector<int> NEB[sz];
        int sum=0;
        int vis[sz],H[sz];
        int cycl=1000000000;
        void dfs(int s,int f,int h)
        {

        H[s]=h;
        vis[s]=1;
        //cout<<s<<endl;
        for(int i=0;i<NEB[s].size();i++)
        {  int it=NEB[s][i];
        if(it==f) continue;
        if(vis[it]==0) dfs(it,s,h+1);
        else if(vis[it]==1)
        {
        cycl=min( abs(H[s]-H[it])+1, cycl);
        }
        }
        }
        signed main()
        {


        int n,m;
        cin>>n>>m;
        for(int i=0;i<m;i++)
        {
        int a,b;
        cin>>a>>b;
        NEB[a].push_back(b);
        NEB[b].push_back(a);
        }

        for(int i=1;i<=n;i++)
        {
        if(vis[i]==0) dfs(i,-1,0);
        }
        cout<<cycl<<endl;

        }


 */