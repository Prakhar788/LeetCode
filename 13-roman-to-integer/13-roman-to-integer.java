class Solution {
    int prefrance(char i){
    switch(i){
        case 'I' : return 1;
        case 'V' : return 5;
        case 'X' : return 10;
        case 'L' : return 50;
        case 'C' : return 100;
        case 'D' : return 500;
        case 'M' : return 1000;
    }
    return 0;
}
    public int romanToInt(String s) {
    int ans=prefrance(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>0;i--){
             if(prefrance(s.charAt(i))>prefrance(s.charAt(i-1))){
                ans=ans-prefrance(s.charAt(i-1)); 
             }
             else if(prefrance(s.charAt(i))<=prefrance(s.charAt(i-1))){
                ans=ans+prefrance(s.charAt(i-1)); 
             }
        }
        return ans;
    }
}