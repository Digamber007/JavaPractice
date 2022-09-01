package GreedyAlgorithum;

public class SumSubsequence {

}

/*
#include<bits/stdc++.h>
        using namespace std;

        #define fast ios_base::sync_with_stdio(false); cin.tie(NULL);
        #define int long long
        #define pb push_back
        #define ff first
        #define ss second
        #define endl '\n'
        #define all(a) a.begin(), a.end()
        #define rall(a) a.rbegin(), a.rend()

        using T = pair<int, int>;

        typedef long long ll;
        const int mod = 1e9 + 7;
        const int INF = 1e9;

        void solve() {
        int n, k;
        cin >> n >> k;
        vector<int> a(n);
        for(auto &i : a) cin >> i;
        sort(rall(a));
        int cur = 0;
        for(int i = 0; i < n; i++){
        cur += a[i];
        if(cur >= k){
        cout << i + 1;
        return;
        }
        }
        cout << -1;
        }

        signed main(){
        fast
        int t = 1;
        // cin >> t;
        for(int i = 1; i <= t; i++){
        solve();
        if(i != t) cout << endl;
        }
        }

 */

