// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//      List<List<Integer>> ans=new ArrayList<List<Integer>>();
//      LinkedList<Integer>comb=new LinkedList<Integer>();
//      this.backtrack(target,comb,0,candidates[],results);
//         return results;
//     }
//     public void backtrack(int remain,LinkedList<Integer>comb,int start,int[]candidates,List<List<Integer>>results){
//         if(remain==0){
//             results.add(new ArrayList<Integer>(comb));
//             return;
//         }
//             else if(remain<0){
//                 return;
//             }
//         for(int i=start;i<candidates.length;++i){
//             comb.add(candidates[i]);
//             this.backtrack(remain-candidates[i],comb,i,candidates,results);
//             comb.removeLast();
//         }
//     }
// }

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
            List<Integer>list=new ArrayList<>();
            print(candidates,target,0,list,ans);
            return ans;
        }
    
        public static void print(int[] coin, int sum,int idx,List<Integer>list,List<List<Integer>>ans) {
            if(sum==0)
            {
                ans.add(new ArrayList<>(list));
                return;
            }
            for (int i = idx; i < coin.length; i++) {
                if(sum>=coin[i])
                {
                    list.add(coin[i]);
                    print(coin, sum-coin[i],i,list,ans);
                    list.remove(list.size()-1);
                }
            }
        }
}