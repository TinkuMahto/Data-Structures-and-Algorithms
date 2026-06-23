class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        //count freq of chars
        int freq[] = new int[26];
        for(char ch : chars.toCharArray()) {
            freq[ch-'a']++;
        }

        //check every word
        for(String word : words) {
            int []count = new int[26];
            boolean canForm = true;

            for(char ch : word.toCharArray()) {
                count[ch-'a']++;

                if(count[ch-'a'] > freq[ch-'a']){
                    canForm = false;
                    break;
                }
            }
            if(canForm){
                sum += word.length();
            }
            
        }
        return sum;

    }
        
}

