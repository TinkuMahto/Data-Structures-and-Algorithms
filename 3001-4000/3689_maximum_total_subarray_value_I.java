class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(long num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            
        }
        return k*(max-min);
    }
}