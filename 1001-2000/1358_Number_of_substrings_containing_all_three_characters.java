class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1,-1,-1};
        int count = 0;

        int n = s.length();

        for(int i=0; i<n; i++) {

            lastSeen[s.charAt(i)-'a'] = i;
            int minIndex = Math.min(lastSeen[0], Math.min(lastSeen[1],lastSeen[2]));

            count += (minIndex+1);
        }
        return count;
    }

}
