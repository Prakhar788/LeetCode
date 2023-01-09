class Solution {
    public List<List<String>> partition(String s) {
    List<String> list = new ArrayList<>();
	List<List<String>> ans = new ArrayList<>();
	PrintPartitioning(s, list,ans);  
    return ans;
        
    }
    public static void PrintPartitioning(String ques,List<String> list,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<String>(list));
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if( isPalindromeString(s)){
                list.add(s);
                PrintPartitioning(ques.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindromeString(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}
}