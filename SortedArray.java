package DSA.Leetcode;

public class SortedArray {
    public boolean sorted(int[] a) {
        //int num = arr[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= a[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        //int j = 1;
        //int n = 5;
        int[] arr = new int[]{3, 4, 5, 1, 2};
    }
}
