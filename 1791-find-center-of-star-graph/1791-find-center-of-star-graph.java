import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
        // int n=edges.length+1;
        // int[] edgeCount=new int[n+1];            code 1
        // for(int[] edge:edges){
        //     int x=edge[0];
        //     int y=edge[1];
        //     edgeCount[x]++;
        //     edgeCount[y]++;
        //     if(edgeCount[x]>1){
        //         return x;
        //     }
        //     if(edgeCount[y]>1){
        //         return y;
        //     }
        // }
        // return 0;
        
        // Set<Integer> outEdgesFound=new HashSet<>();              code 2
        // for(int[] edge:edges){
        //     if(outEdgesFound.contains(edge[0])){
        //         return edge[0];
        //     }
        //     outEdgesFound.add(edge[0]);
        //     if(outEdgesFound.contains(edge[1])){
        //         return edge[1];
        //     }
        //     outEdgesFound.add(edge[1]);
        // }
        // return -1;
        
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
        
        
    }
}