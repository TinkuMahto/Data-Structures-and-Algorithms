class Solution {
    public String rearrangeString(String s, char x, char y) {
        String str = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == y){
                str = s.charAt(i) + str;
            }else{
                str = str + s.charAt(i);
            }
        }
        return str;
    }
}
