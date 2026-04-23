class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if (!map1.containsKey(ch1)) {
                map1.put(ch1, ch2);
            } else {
                char ch3 = map1.get(ch1);
                if (ch2 != ch3) {
                    return false;
                }
            }

            if (!map2.containsKey(ch2)) {
                map2.put(ch2, ch1);
            } else {
                char ch3 = map2.get(ch2);
                if (ch1 != ch3) {
                    return false;
                }
            }
        }

        return true;
    }
}