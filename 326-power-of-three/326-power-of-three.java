class Solution {
    public boolean isPowerOfThree(int n) {
        
        int k = n;
        return checkPowThree(n,k);
        
    }
    
    public boolean checkPowThree(int n, int k){
        
        if(n == 0)  return false;
        if(n == 1)  return true;
        
        //if(n % 3 == 0)  return true;
        if(n % 3 != 0)  return false;
        
        n = n/3;
        return  checkPowThree(n,k);
        
    }
        
}