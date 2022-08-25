class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int index=0;
    int count=0;
        if(ruleKey.equals("color")){
            index=1;
        }
        if(ruleKey.equals("name")){
            index=2;
        }
        for(List<String> i:items){
            if(i.get(index).equals(ruleValue)){
                                   count++;
                                   }
        }
                                   return count;
        
    }
}