class Solution {
    public int fib(int n) {
        
        return findFib(n);
        
    }
    
    public int findFib(int n){
        
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            
            return findFib(n-1) + findFib(n-2);            
        }
       
    }
    
}