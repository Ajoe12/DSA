#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define pb push_back
#define mp make_pair
#define umap unordered_map
#define mod 1000000007

vector<int> ans;
void solve(int x,vector<int> &vis,vector<int> adj[]){
    vis[x]=1;
    ans.push_back(x);
    for(auto i : adj[x]){
        if(vis[i]!=1){
            solve(i,vis,adj);
        }
    }
}
vector<int> dfsOfGraph(int V, vector<int> adj[]) {
    ans.clear();
    vector<int> vis(V,0);
    solve(0,vis,adj);
    return ans;
}

int main(){
    // ios_base::sync_with_stdio(false);
    // cin.tie(NULL);
    ll v,e;
    cin>>v>>e;
    vector<int> g[v];

    for(int i=0;i<e;i++){
        ll x,y;
        cin>>x>>y;
        g[x].push_back(y);
        g[y].push_back(x);
    }

    //graph list representation
    for(int i=0;i<v;i++){
        cout<<i<<"-->" ;
        for(int j=0;j<g[i].size();j++){
            cout<<g[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<endl;

    //bfs display
    vector<int> dfs;
    dfs = dfsOfGraph(v,g);

    for(int i=0;i<dfs.size();i++)
        cout<<dfs[i]<<" ";
}