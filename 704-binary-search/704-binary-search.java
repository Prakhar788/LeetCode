import java.util.*;
class Solution {
   
   public static int search(int arr[], int target) {
       int beg=0,end=arr.length-1;
       if(arr[beg]<arr[end])
       {
       while(beg<=end)
       {
           int mid=beg+(end-beg)/2;
           if(arr[mid]<target)
               beg=mid+1;
           else if(arr[mid]>target)
               end=mid-1;
           else
               return mid; 
       }}
       else
       {
         while(beg<=end)
       {
           int mid=beg+(end-beg)/2;
           if(arr[mid]>target)
               beg=mid+1;
           else if(arr[mid]<target)
               end=mid-1;
           else
               return mid; 
       }
       }
       return -1;
        
    }
}