class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        // if array is empty
        if(n == 0){
            return new int[n];
        }
        //copy the given array to temp
        int [] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        // sort the temp array
        Arrays.sort(temp);

        //for finding the rank
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1; i<n; i++){
            if(temp[i-1] == temp[i]){
                ans[i] = ans[i-1];

            }else{
                ans[i] = ans[i-1] + 1; 
            }
        }
        //to make the ans array
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++) {
            hmap.putIfAbsent(temp[i], ans[i]);
        }
        for(int i=0; i<n; i++){
            ans[i] = hmap.get(arr[i]);
        }
        return ans;
    }
}
