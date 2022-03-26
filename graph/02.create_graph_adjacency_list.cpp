#include<bits/stdc++.h>

using namespace std;

#define ll long long int
#define pb push_back
#define mp make_pair
#define umap unordered_map
#define mod 1000000007

int main(){
    // ios_base::sync_with_stdio(false);
  // cin.tie(NULL);
    ll v,e;
    cin>>v>>e;
    vector<vector<int>> g(v+1,vector<int>(v+1,0));

    for(int i=0;i<e;i++){
        ll x,y;
        cin>>x>>y;
        g[x][y]=1;
        g[y][x]=1;
    }

    for(int i=1;i<=v;i++){
        cout<<i<<"-->" ;
        for(int j=0;j<g[i].size();j++){
            cout<<g[i][j]<<" ";
        }
        cout<<endl;
    }
}