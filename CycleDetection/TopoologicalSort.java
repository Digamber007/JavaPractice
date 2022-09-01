package CycleDetection;

public class TopoologicalSort {
}

/*
#include<bits/stdc++.h>
using namespace std;
#define sz 200000
vector<int> NEB[sz];
// bool tempvis[sz],pervis[sz];
int vis[sz];
int v;
int e;
bool flag = 0;
void dfs(int s, int p)
{
    //    if(pervis[s] == false) {

       vis[s] = 1;
    //    pervis[s] = true;
    //    tempvis[s] = true;
       for(auto it: NEB[s]) {
           if(it == p) continue;
           if(vis[it] == 1) flag = true;
           if(vis[it] == 0) dfs(it,s);
       }
       vis[s] = 2;

}
signed main()
{

		// for(int i = 0; i < v; ++i) {
        //     tempvis[i] = false;
        //     pervis[i] = false;
        // }
		cin>>v>>e;
		for(int i=0;i<e;i++)

		{
			int a,b;
			cin>>a>>b;
			NEB[a].push_back(b);
		}
		//cout<<"hh";
		// bool flag = false;
		for(int i=0;i<v;i++)
		{
            if(vis[i]) continue;
            dfs(i,v);
        }
        if(flag == true) {
            cout<<"0";
        } else {
            cout<<"1";
        }

}

 */
