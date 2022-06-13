package binersearch;

import java.util.Arrays;

public class BinerySearch {
    public int binerySearch(int[] array, int x){
        int left = 0;
        int right = array.length-1;
        while (left<right){
           int middle = (right-left)/2;
           if(x<array[middle]){
            right = middle-1;
           } else if (x>array[middle]) {
             left=middle+1;
           }
           else {
               return middle;
           }
        }
        return -1;
    }
}
