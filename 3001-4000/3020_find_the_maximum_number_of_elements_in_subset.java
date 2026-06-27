class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer> map = new HashMap<>();
        int ones = 0;
        //freq map to all elements
        for(int num : nums){
            map.put((long)num,map.getOrDefault((long)num,0)+1);
            if(num == 1) ones++;
        }

        // 1^k is always 1, so any odd-length subsequence of 1s is valid
        // If count is even, best odd length we can pick is ones-1
        int ans = (ones % 2 == 0) ? ones-1 : ones;

        // 1s are already handled — remove to avoid reprocessing in chain logic
        map.remove(1L);

        // Follow the squaring chain: num -> num^2 -> num^4 -> ...
        for(long key : map.keySet()) {
            int count = 0;
            long curr = key;
            while(map.containsKey(curr)) {

                if(map.get(curr) >= 2) {
                    count+=2;  // Can take a pair at this level
                }
                else {
                    count++;  // Only one occurrence — can end the chain here
                    break;    // Cannot continue: need pairs to keep squaring
                   
                    
                }
                curr = curr*curr;
            }
            // Subsequence must have odd length to satisfy the zigzag/power condition
            if(count % 2 == 0 ) count --;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
