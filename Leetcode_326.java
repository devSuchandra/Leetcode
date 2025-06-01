package DSA.Leetcode.Leetcode;

public class Leetcode_326 {

    public static boolean isPowerOfThree(int n) {
        if(n == 1){
            System.out.println("true");
            return true;
        }
        if(n <= 0 || n%3 != 0){
             System.out.println("false");
            return false;
        }
         return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        isPowerOfThree(27);
    }
}
