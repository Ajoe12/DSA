#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define pb push_back
#define mp make_pair
#define umap unordered_map
#define mod 1000000007

bool solve(int src,int par,vector<int> adj[],vector<bool> &vis){
        vis[src]=true;
        for(auto x : adj[src]){
            if(vis[x]!=1){
                if(solve(x,src,adj,vis)) 
                    return true;
            }
            else if(x!=par) return true;
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    bool isCycle(int V, vector<int> adj[]) {
        vector<bool> vis(V,false);
        for(int i=0;i<V;i++){
            if(!vis[i]){
                bool f = solve(i,-1,adj,vis);  
                if(f) return true;
            }
        }
        return false;
    }

int main(){
    // ios_base::sync_with_stdio(false);
    // cin.tie(NULL);
    ll v,e;
    cin>>v>>e;
    vector<int> g[v];

    //directed graph
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
    bool ans =  isCycle(v,g);
    cout<<ans;
}