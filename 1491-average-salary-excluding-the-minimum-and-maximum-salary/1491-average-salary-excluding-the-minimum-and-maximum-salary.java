// class Solution {
//     public double average(int[] salary) {
//         int minS=Integer.MAX_VALUE;
//         int maxS=Integer.MIN_VALUE;
//         for(int i=0;i<salary.length;i++){
//             minS=Math.min(minS,salary[i]);
//             maxS=Math.max(maxS,salary[i]);
//         }
//         double sum=0;
//         for(int i=0;i<salary.length;i++){
//             if(minS!=salary[i] && maxS!=salary[i]){
//                 sum+=salary[i];
//             }
//         }
//         return sum/(salary.length-2);
//     }
// }

class Solution {
    public double average(int[] salary) {
        int h=0,l=salary[0];
        double s=0;
        for (int i=0;i<salary.length;i++)
        {
            if(h<salary[i])
                h=salary[i];
            if(l>salary[i])
                l=salary[i];
            s+=salary[i];
        }
        return (s-h-l)/(salary.length-2);
    }
}