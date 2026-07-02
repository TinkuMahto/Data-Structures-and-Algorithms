class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int totalSum = 0;
        //max subarray sum
        for(int i=0; i<n; i++) {
           totalSum += nums[i];
            sum += nums[i];

            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        //min suarray sum
        for(int i=0; i<n; i++) {
           
            sum += nums[i];

            if(sum < minSum) {
                minSum = sum;
            }
            if(sum > 0) {
                sum = 0;
            }
        }
        // 
        if(maxSum < 0){    // if all ele negative in array
            return maxSum;
        }else{
            return Math.max(maxSum, (totalSum-minSum));
        }
    }
}