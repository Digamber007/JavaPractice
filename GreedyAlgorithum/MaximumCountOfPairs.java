package GreedyAlgorithum;

public class MaximumCountOfPairs {
}


/*
#include <bits/stdc++.h>

        using namespace std;

        #ifdef LOCAL
        #define debug(...) cerr << "[" << #_VA_ARGS_ << "]:", debug_out(_VA_ARGS_)
        #else
        #define debug(...) 2351
        #endif

        int main() {
        #ifdef LOCAL
        auto start = std::chrono::high_resolution_clock::now();
        #endif
        ios::sync_with_stdio(0);
        cin.tie(0);
        int n;
        cin >> n;
        vector<int> arr;
        vector<pair<int, int>> a;
        for (int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        arr.push_back(temp);
        a.push_back({temp, i});
        }
        auto compare = [](pair<int, int>& x, pair<int, int>& y) {
        return x.first < y.first;
        };
        priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(compare)> pq(compare);

        for (int i = 0; i < n; i++) {
        if (a[i].first > 0) {
        pq.push(a[i]);
        }
        }

        vector<pair<int, int>> res;
        while (pq.size() >= 2) {
        int top = pq.top().second;
        pq.pop();
        int cur = pq.top().second;
        pq.pop();
        res.push_back({top + 1, cur + 1});
        arr[top]--;
        arr[cur]--;
        if (arr[top] > 0)
        pq.push({arr[top], top});
        if (arr[cur] > 0)
        pq.push({arr[cur], cur});
        }

        cout << res.size() << "\n";
        for (auto& it : res) {
        cout << it.first << " " << it.second << "\n";
        }
        #ifdef LOCAL
        auto stop = std::chrono::high_resolution_clock::now();
        auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(stop - start);
        cerr << "Time taken : " << ((long double)duration.count()) / ((long double)1e9) << "s " << endl;
        #endif
        return 0;
        }

 */