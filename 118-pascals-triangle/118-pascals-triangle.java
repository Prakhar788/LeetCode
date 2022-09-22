class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
          List<Integer> prev = null ; 
        for(int i=0;i<numRows;i++){
            List<Integer> sublist = new ArrayList<>();
           for(int j=0;j<=i;j++){
                if(j==0||j==i) sublist.add(1);
               
                else sublist.add(prev.get(j-1)+prev.get(j)) ;
           }
                
                prev=sublist;
                res.add(sublist);
            
        }
        return res;
    }
}

