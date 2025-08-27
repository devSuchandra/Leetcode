package DSA.Leetcode;

public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int r1 = m - n - 1;  // Last valid element in nums1
//        int r2 = n - 1;  // Last valid element in nums2
//        int w =  m-1;//(r1 > r2) ? r1 : r2; // Last index of nums1 (total space available)
//
//        while (r1 >= 0 && r2 >= 0) {
//            if (nums1[r1] > nums2[r2]) {
//                nums1[w] = nums1[r1];
//                r1--;
//            } else {
//                nums1[w] = nums2[r2];
//                r2--;
//            }
//            w--;
//        }
//
//
//        while (r2 >= 0) {
//            nums1[w] = nums2[r2];
//            r2--;
//            w--;
//        }
//
//        // Print merged array
//        for (int num : nums1) {
//            System.out.print(num + " ");
//        }

        int r1 = m - 1;  // Last valid element in nums1
        int r2 = n - 1;  // Last valid element in nums2
        int w = m + n - 1; // Last available position in nums1

        while (r1 >= 0 && r2 >= 0) {
            if (nums1[r1] > nums2[r2]) {
                nums1[w] = nums1[r1];
                r1--;
            } else {
                nums1[w] = nums2[r2];
                r2--;
            }
            w--;
        }

        // If nums2 has remaining elements, copy them
        while (r2 >= 0) {
            nums1[w] = nums2[r2];
            r2--;
            w--;
        }

         // Print merged array
         for (int num : nums1) {
             System.out.print(num + " ");
         }
    }


    public static void main(String[] args) {
        Leetcode88 obj = new Leetcode88();
        int[] arr1 = new int[]{0};
        int m = arr1.length;
        int[] arr2 = new int[]{1};
        int n = arr2.length;
        obj.merge(arr1,m,arr2,n);
    }
}
