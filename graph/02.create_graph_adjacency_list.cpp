class Solution {
public:
    int solve(vector<int>& nums){
        vector<int> v;
        for(int i=0;i<n;i++){
            if(v.size() == 0) v.push_back(nums[i]);
            else if(v.size()%2!=0){
                if(nums[i] == v[v.size()-1]) continue;
                else v.push_back(nums[i]);
            }
            else v.push_back(nums[i]);
        }
        return v.size();
    }
    int minDeletion(vector<int>& nums) {
        int n = nums.size();
        int c=0;
        
        int n2 = solve(nums);        
        
        c=n- n2;
        if(n2%2!=0) c++;
        
        return c;
    }
};