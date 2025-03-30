package DSA.Leetcode.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_451 {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder str = new StringBuilder();
        for(Map.Entry<Character,Integer> mp : list){
            char key = mp.getKey();
            int value = mp.getValue();
            for(int i = 0; i<value; i++){
                str.append(key);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        frequencySort(s);
    }
}
