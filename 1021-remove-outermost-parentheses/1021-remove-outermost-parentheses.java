class Solution {
   public String removeOuterParentheses(String s) {
    
        final StringBuilder sb = new StringBuilder();
        int len = s.length();
       
        int c = 0;
        
        for(int i = 0; i < len; ++i){
            char ch = s.charAt(i);
            
            if(ch == '(') c++;
            
            if(c > 1) sb.append(ch);
            
            if(ch == ')') c--;
            
                
        }
        
        return sb.toString();
    }
}