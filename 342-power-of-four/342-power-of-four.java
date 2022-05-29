class Solution {
    public boolean isPowerOfFour(int n) {
        
        int k = n;
        return  checkPowFour(n,k);
    }
    
    public boolean checkPowFour(int n,int k){
        
        if(n == 0)  return false;
        
        if(n == 1)  return true;
        
        if(n%4 != 0)    return false;
        
        n = n/4;
        return  checkPowFour(n,k);
        
    }
    
    
}