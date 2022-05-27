class Solution {
    public void reverseString(char[] s) {
        
        //System.out.println(s);
        
        int left, right = s.length-1;
        
        for(left=0; left < right; left++,right--){
            
            char temp = s[left];
            s[left]   = s[right];
            s[right]  = temp;
        }
        
        for(char c : s){
            System.out.print(c);
        }
        
    }
}