public class HashMapTerster {
    private static String SUBSET ="arr2[] is a subset of arr1[]";
    private static String NO_SUBSET = "arr2[] is not a subset of arr1[]";

    public static void main(String[] args) {
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3};
        FindSubset set = new FindSubset();
        //System.out.println(set.findSubset(arr1, arr2, arr1.length, arr2.length) ? SUBSET : NO_SUBSET );
        System.out.println(set.findSubsetBetter(arr1, arr2, arr1.length, arr2.length) ? SUBSET : NO_SUBSET );
    }
}
