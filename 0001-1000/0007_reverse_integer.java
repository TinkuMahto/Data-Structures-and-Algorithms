class Solution {
    public int reverse(int x) {
        int temp=x;

        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            temp=temp/10;
            
            if(x>0){
                if(rev>Integer.MAX_VALUE/10){
                    return 0;
                }
                else if(rev<Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && digit<=7)){
                    rev=rev*10+digit;
                }
            
            }else{
                 if(rev<Integer.MIN_VALUE/10){
                    return 0;
                }
                else if(rev>Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && digit>=-8)){
                    rev=rev*10+digit;
                }
            }
           
        }
        return rev;

    }
}
