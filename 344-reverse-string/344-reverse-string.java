class Solution {
    public void reverseString(char[] s) {
        
        //System.out.println(s);
        int left=0,right=s.length-1;
        reverse(s,left,right);
        return ;
        
    }
    
    public void reverse(char[] s, int left,int right){
        
        if(left > right){
            
            //System.out.print(s);
            return ;
        }
        
        char temp = s[left];
        s[left]   = s[right];
        s[right]  = temp;
        
        reverse(s,++left,--right);
    }   
}

/*  public void reverseString(char[] s) {
         int i=0;
         int j=s.length-1;
         letMeReverse(s,i,j);
            
    }
   void letMeReverse(char[] s, int i, int j){
        if(i>j) return; // Base Case
        char temp=s[i]; // Solving just one case
        s[i]=s[j];
        s[j]=temp;
        i++; 
        j--;
        letMeReverse(s,i,j); // Recursive call 
    }*/


