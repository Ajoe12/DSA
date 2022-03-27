#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define pb push_back
#define mp make_pair
#define umap unordered_map
#define mod 1000000007

vector<int> bfsOfGraph(int v, vector<int> adj[]) {
    vector<int> ans;
    queue<int> q;
    q.push(0);
    vector<int> vis(v,0);
    vis[0]=1;
        
    while(!q.empty()){
        int temp = q.front();
        ans.push_back(temp);
        q.pop();
        for(auto x : adj[temp]){
            if(vis[x]!=1){
                vis[x]=1;
                q.push(x);
            }
        }
    }
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
    vector<int> bfs;
    bfs = bfsOfGraph(v,g);
    for(int i=0;i<bfs.size();i++)
        cout<<bfs[i]<<" ";
}