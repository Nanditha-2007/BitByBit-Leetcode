class Solution {
    public boolean isPalindrome(int x) {
        int rem,res=0,org=x;
        if(x<0) return false;
        while(x>0){
            rem=x%10;
            res =res*10+rem;
            x=x/10;
        }
        if(res==org) return true;
        return false;
    }
}
