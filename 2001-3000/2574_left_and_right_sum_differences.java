class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int []leftSum = new  int[n] ;
        int []rightSum = new int[n];
        int []answer = new int[n];

        int lSum = 0;
        int rSum = 0;
        for(int i=0; i<n; i++) {
            if(i>0) {
                lSum += nums[i-1];
                rSum += nums[n-i];
            }
            leftSum[i] = lSum;
            rightSum[n-i-1] = rSum;
           

        }
        for(int i=0; i<n; i++){
            int ans = Math.abs(leftSum[i]-rightSum[i]);
            answer[i] = ans;

        }
        return answer;
    }
}
