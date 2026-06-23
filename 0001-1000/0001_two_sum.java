
//Approach-1 Brute Force: O(n²) time, O(1) space
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
        
    }
}


//Apprach-2: HashMap Approach: O(n) time, O(n) space

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            
            int complement = target-nums[i];
            if(hm.containsKey(complement)) {

                return new int[]{hm.get(complement),i};

            }

            hm.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}