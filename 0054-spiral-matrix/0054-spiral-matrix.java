class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
     int minr=0;
     int maxr=arr.length-1;
     int minc=0;
     int maxc=arr[0].length-1;
     int total=arr.length*arr[0].length;
     int count=0;
    List<Integer> list=new ArrayList<>();
        while(count<total){
         for(int i=minc;i<=maxc && count<total;i++){
          list.add(arr[minr][i]);
             count++;
         }  
            minr++;
            for(int i=minr;i<=maxr && count<total;i++){
          list.add(arr[i][maxc]);
             count++;
         } 
            maxc--;
            for(int i=maxc;i>=minc && count<total;i--){
          list.add(arr[maxr][i]);
             count++;
         }  
            maxr--;
             for(int i=maxr;i>=minr && count<total;i--){
          list.add(arr[i][minc]);
             count++;
         }  
            minc++;
        }
        return list;
    }
}