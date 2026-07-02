class Solution {
    public int maximumSum(int[] arr) {
        int len = arr.length;
        int prevNotDeleted = arr[0];
        int prevWithDeleted = 0;
        int max = arr[0];

        for(int i=1; i<len; i++) {
            prevWithDeleted = Math.max(prevNotDeleted, prevWithDeleted + arr[i] );
            prevNotDeleted = Math.max(prevNotDeleted + arr[i], arr[i]);
            max = Math.max(max, Math.max(prevWithDeleted, prevNotDeleted));

        }
        return max;

    }
}