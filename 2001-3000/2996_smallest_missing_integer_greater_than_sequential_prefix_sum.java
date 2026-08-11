class Solution {
    public int missingInteger(int[] nums) {

        //// Find the sum of the longest consecutive prefix
        int seqSum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == (nums[i-1]+1)){
                seqSum += nums[i];
            }else{
                break;
            }
        }
        // put all the numbers in set
        HashSet<Integer> set = new HashSet();
        for(int num : nums){
            set.add(num);
        }

        // Find the smallest integer >= seqSum
        // that doesn't exist in nums
        while(set.contains(seqSum)){
            seqSum++;
        }
        return seqSum;
        
    }
}