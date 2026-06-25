class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int subarraysCnt = 0;
        
        for(int i=0; i<n; i++) {
            list.clear();
            int count = 0;
            for(int j=i; j<n; j++) {
                list.add(nums[j]);
                if(nums[j] == target){
                    count++;
                }
                if(list.contains(target) && 2*count>list.size() ) {
                    subarraysCnt++;
                }
            }
        }
        return subarraysCnt;
    }
}
