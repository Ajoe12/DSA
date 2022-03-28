#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define pb push_back
#define mp make_pair
#define umap unordered_map
#define mod 1000000007

bool solve(int x,vector<int> &ord,vector<int> &vis,vector<int> adj[]){
    vis[x]=1;  
    ord[x]=1;
    for(auto i : adj[x]){
        if(vis[i]!=1){
            bool chk = solve(i,ord,vis,adj);
            if(chk) return true;
        }
        else if(ord[i]==1) return true;
    }
    ord[x]=0;
    return false;
}
bool dfsdetectcycle(int V, vector<int> adj[]) {
    vector<int> vis(V,0);
    vector<int> ord(V,0);
    for(int i=0;i<V;i++){
        if(vis[i]!=1){
            bool chk = solve(i,ord,vis,adj);
            if(chk) return true;    
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
    bool ans =  dfsdetectcycle(v,g);
    cout<<ans;
}