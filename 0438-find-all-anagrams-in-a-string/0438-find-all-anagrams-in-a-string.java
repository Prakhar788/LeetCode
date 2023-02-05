class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] strs = new int[26];
        int[] pattern = new int[26];
        int index = 0;
        for(int i = 0; i < p.length(); i++){
            pattern[p.charAt(i) - 'a']++;
            strs[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(strs, pattern)){
            ans.add(index);
            index++;
        } else{
            index++;
        }
        for(int j = p.length() ; j < s.length() ; j++){
            strs[s.charAt(j - p.length()) - 'a']--;
            strs[s.charAt(j) - 'a']++;
            if(Arrays.equals(strs, pattern)){
                ans.add(index);
            }
            index++;
        }
        return ans;
    }
}