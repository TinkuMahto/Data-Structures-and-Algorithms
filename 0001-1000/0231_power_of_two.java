
//Approach 2 : using bit-manipulation
class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<1){
        return false;
       }
       if((n & (n-1)) == 0){
        return true;
       }
       else return false;
    }
}

//Approach 2 : check by division of 2

class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<1){
        return false;
       }
       while(n%2==0){
        n=n/2;
       }
       if(n==1){
        return true;
       }else{
        return false;
       }
    }
}
