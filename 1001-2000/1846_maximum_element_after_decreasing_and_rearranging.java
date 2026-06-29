class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        int n = arr.length;
        
        int[] count = new int [n+1];

        for(int a : arr){
            int idx = Math.min(a,n);
            count[idx]++;
        }
        int ans = 1;
        for(int i=2; i<=n; i++){
            int curr = ans + count[i];
            ans = Math.min(curr,i);
        }
        return ans;
    }
}
