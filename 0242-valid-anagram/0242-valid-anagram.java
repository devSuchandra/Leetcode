class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i = 0; i < sArray.length; i++){
            map.put(sArray[i] , map.getOrDefault(sArray[i], 0) + 1);
        }
        for(char c : tArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            }else{
                return false;
            }
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() > 0 || m.getValue() < 0){
                return false;
            }    
            
        }
        return true;
    }
}