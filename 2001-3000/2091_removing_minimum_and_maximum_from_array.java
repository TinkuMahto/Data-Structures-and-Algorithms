class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<n; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int minIndex = -1;
        int maxIndex = -1;

        for(int i=0; i<n; i++){
            if(min == nums[i]){
                minIndex = i;
            }
            if(max == nums[i]){
                maxIndex = i;
            }
        }
        //scenario 1 :  Both elements are removed by only deleting from the front.
        int sc1 = (minIndex > maxIndex) ? minIndex+1 : maxIndex+1;

        //Scenario 2: Both elements are removed by only deleting from the back.
        int sc2 = (minIndex > maxIndex) ? n-maxIndex : n-minIndex;

        //Scenario 2: Both elements are removed by only deleting from the back.
        int sc3 = (minIndex > maxIndex) ? (maxIndex+1 + n-minIndex) : (minIndex+1 + n-maxIndex);

        return Math.min(sc1, Math.min(sc2,sc3));
    }
}
