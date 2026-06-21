class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //find the max ele
        int max = Integer.MIN_VALUE;
        for(int i=0; i<costs.length; i++) {
            if(max < costs[i]) {
                max = costs[i];
            }
        }

        //create a count array and count the frequency of each element
        int []cntArr = new int[max+1];
        for(int i=0; i<costs.length; i++) {
            cntArr[costs[i]]++;
        }
        //update the cntArr with prefix sum 
        for(int i=1; i<cntArr.length; i++) {
            cntArr[i] =  cntArr[i-1] + cntArr[i];
        }
        //create a ans array and calculate it is the sorted array
        int ans[] = new int[costs.length];
        for(int i=costs.length-1; i>=0; i--) {
            ans[cntArr[costs[i]]-1] = costs[i];
            cntArr[costs[i]]--;
        }
        int count = 0;
        int sum = 0;

        //calculate the ice cream bars
        for(int i=0; i<costs.length; i++) {
            sum += ans[i];
            if(sum > coins) {
                break;
            }
            count++;
        }

        return count;
         
    }
}
