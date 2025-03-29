package DSA.Leetcode.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1941 {
    public static  boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int first = map.get(s.charAt(0));
        for (Map.Entry<Character,Integer> mp : map.entrySet()){

            if(mp.getValue() != first){       
                return false;
            }
        }
        return true;
    }
}
