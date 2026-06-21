class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            long sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[j];

                if(firstDigit(sum) == x && sum % 10 == x) {
                    count ++;
                }    
            }
        }
        return count;
        
    }
    public long firstDigit(long num) {
        while(num>=10) {
            num/=10; 
        }
        return num;
    }
}
