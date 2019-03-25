import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubset {

    /*
    Given two arrays: arr1[0..m-1] and arr2[0..n-1].
    Find whether arr2[] is a subset of arr1[] or not.
    Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.
    Time Complexity: O(m*n)
    */
    public boolean findSubset(int[] array1, int[] array2, int m, int n) {

        boolean isContained;

        for (int i = 0; i < n; i++) {
            isContained = false;
            for (int j = 0; j < m; j++) {
                if (array2[i] == array1[j]) {
                    isContained = true;
                    break;
                }
            }
            if (!isContained) {
                return false;
            }
        }
        return true;
    }

//     O(mLogm + nLogm)
    public boolean findSubsetBetter(int[] array1, int[] array2, int m, int n) {
       //quickSort algorithm
        Arrays.sort(array1);

        for(int item : array2){
            if(binarySearch(array1, 0, array1.length, item) == -1){
                return false;
            }
        }
        return true;
    }


    int binarySearch(int[] a, int min, int max, int target) {
        if (max >= min) {
            int mid = (min + max) / 2;

            if ((mid == 0 || target > a[mid - 1]) && (a[mid] == target))
                return mid;
            else if (target > a[mid]) {
                return binarySearch(a, (mid + 1), max, target);
            } else {
                return binarySearch(a, min, (mid - 1), target);
            }
        }
        return -1;
    }
}