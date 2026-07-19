class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long mod = 1_000_000_007;
        long swaps = 0;
        long seenH = 0;
        long seenM = 0;
        
        for(int x : nums){
            if(x < a) {
                swaps += seenM + seenH;
                
            }else if( x <= b) {
                swaps += seenH;
                seenM ++;
                
            }else{
                seenH++;
            }
        }
        return (int)(swaps % mod);
    }
}
