class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        long ans = 0;
        for(int i=n-1; i>=(n-k); i--) {
            long prod = (long)nums[i]*mul;
            mul--;
            
            if(prod>nums[i]){
                ans += prod;
            }else{
                ans += nums[i];
            }
            
        }
        return ans;
    }
}
