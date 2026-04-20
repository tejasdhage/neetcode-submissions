class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }

        if (hm1.size() != hm2.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> e: hm1.entrySet()) {
            char key = e.getKey();
            int val = e.getValue();

            if (hm2.containsKey(key) && hm2.get(key) == val) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
