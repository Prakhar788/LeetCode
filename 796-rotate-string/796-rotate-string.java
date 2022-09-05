class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(char x:s.toCharArray()){
            String first=s.substring(0,1);
            String rem=s.substring(1,s.length());
            s=rem+first;
            if(s.equals(goal)){
                return true;
            }
            
        }
        return false;
    }
}