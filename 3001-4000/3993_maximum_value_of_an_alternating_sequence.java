class Solution {
    public long maximumValue(int n, int s, int m) {
        
        if(n == 1) {
            return s;
        }
        long g = m -1;

        long max1 = s + ((long)(n-1)/2) * g;
        long max2 = s + m + ((long)(n-2)/2) * g;

        return Math.max(max1, max2);
    }
}
