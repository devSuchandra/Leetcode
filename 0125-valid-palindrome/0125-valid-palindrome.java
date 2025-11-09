class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c :  s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        char[] c = sb.toString().toCharArray();
        
        int start = 0, end = c.length - 1;
        while(start < end){
            if(c[start] == c[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}