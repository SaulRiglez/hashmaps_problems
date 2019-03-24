public class FindSubset {

    /*
    Given two arrays: arr1[0..m-1] and arr2[0..n-1].
    Find whether arr2[] is a subset of arr1[] or not.
    Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.
    Time Complexity: O(m*n)
    */
    public boolean findSubsetSimple(int[] array1, int[] array2) {

        boolean isContained;

        for (int item : array2) {
            isContained = false;
            for (int j = 0; j < array1.length; j++) {
                if (item == array1[j]) {
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
}
