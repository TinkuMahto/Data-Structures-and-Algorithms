class Solution {
    public int minimumCost(int[] nums, int k) {
        long mod = 1_000_000_007L;
        long res = k;
        long count = 0;
        for(int x : nums){
            if(res < x){
                long need = x-res;
                long ops = (need + k -1L)/k;

                res += ops*k;
                count += ops;
            }
            res -= x;
        }
        long a = count % mod;
        long b = (count +1) % mod;
        long half;
        if(count % 2 == 0) {
            half = ((count/2) % mod) * b % mod;
        }else{
            half = a * (((count + 1 )/2) % mod) % mod;
        }
        
        return (int) (half % mod);
    }
}