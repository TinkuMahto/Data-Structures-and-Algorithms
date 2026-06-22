class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[26];
        //count the frequency of each character of text
        for(char ch : text.toCharArray()) {
            freq[ch-'a']++;
        }
        
        freq['b'-'a']/=1;
        freq['a'-'a']/=1;
        freq['l'-'a']/=2;
        freq['o'-'a']/=2;
        freq['n'-'a']/=1;

        int min = Integer.MAX_VALUE;
        String str = "balloon";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch-'a']<min){
                min = freq[ch-'a'];
            }
        }
        return min;
    }
}
