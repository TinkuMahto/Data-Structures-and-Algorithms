class Solution {
    public int rearrangeCharacters(String s, String target) {
        //count the frequency of each character of string s
        int freq[] = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        //count the frequency of each character of string target
        int []freq_target = new int[26];
        for(char ch : target.toCharArray()){
            freq_target[ch-'a']++;
        }

        
        for(int i=0; i<26; i++){
            if(freq_target[i]!=0){
                freq[i]/=freq_target[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<target.length(); i++){
            char ch = target.charAt(i);
            if(freq[ch-'a']<min){
                min = freq[ch-'a'];
            }
        }
        return min;
    }
}
