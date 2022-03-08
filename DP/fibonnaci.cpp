#include<bits/stdc++.h>

using namespace std;
const int m = 1e5+2;

//recursive
int fib(int n)
{
    if (n <= 1)
        return n;
    return fib(n-1) + fib(n-2);
}

//dp recursive
int dp[m];
int dp_fib(int n){
    if(n<=1)
        return n;
    if(dp[n]==-1)
        dp[n] = fib(n-1)+fib(n-2);    
    
    return dp[n];
}

 
int main ()
{
    int n;
    cin>>n;
//iterative
//     int s=0,t=1;
//     // int t=f+s;
//     while(t<=n){
//         // swap(f,s);
//         // s=t;
//         t=s+t;
//         s=t-s;
//         cout<<"t : "<<t<<" ,s :"<<s<<endl;
//     }
//     cout<<t;
    
    //recursive dp
    // for(int i=0;i<m;i++){
    //     dp[i]=-1;
    // }
    // cout<<dp_fib(n);

    //setting values in dp
    dp[0]=0;
    dp[1]=1; 
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    cout<<dp[n];
    return 0;
}