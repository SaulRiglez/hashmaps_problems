public class HashMapTerster {
    private static String SUBSET ="arr2[] is a subset of arr1[]";
    private static String NO_SUBSET = "arr2[] is not a subset of arr1[]";

    public static void main(String[] args) {
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3};
        FindSubset set = new FindSubset();
        System.out.println(set.findSubsetSimple(arr1, arr2) ? SUBSET : NO_SUBSET );
    }
}
