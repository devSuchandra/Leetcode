package DSA.Leetcode.Leetcode;

public class Leetcode_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] a = new int[2];
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                a[0] = start + 1;
                a[1] = end + 1;
                System.out.println(a[0] + " " + a[1]);
                return a;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            }else{
                start++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] num = new int[]{-1,0};
        twoSum(num, -1);
    }

}
