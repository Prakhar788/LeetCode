class Solution {
    public boolean checkIfPangram(String sentence) {
      if(sentence.length()>=26) {
         for(char ch='a';ch<='z';ch++){
             int n=sentence.indexOf(ch);
             if(n==-1){
                 return false;
             }
         } return true;
      } 
        else 
            return false;
    }
}