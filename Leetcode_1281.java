package DSA.Leetcode.Leetcode;

public class Leetcode_1281 {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0, 
        result = 0, temp = 0, 
        length = 0, temp1 = n ,div= 1;
        while(temp1 > 0){
            temp1 = temp1 / 10;
            length++;    
        }
        for(int i = 0; i<length - 1; i++){
            div = div * 10;
        }
        for(int i = 0; i<length; i++){
            temp = n/div;
            n = n % div;
            div = div / 10;
            product = product * temp;
            sum = sum + temp;
        }
        result = product - sum;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int number = 4421;
        Leetcode_1281 obj = new Leetcode_1281();
        obj.subtractProductAndSum(number);

    }

}
