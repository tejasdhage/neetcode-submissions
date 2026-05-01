class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> ransomNoteMap = getCharFreqMap(ransomNote);
        Map<Character, Integer> magazineMap = getCharFreqMap(magazine);

        for (Map.Entry<Character, Integer> e: ransomNoteMap.entrySet()) {
            char ch = e.getKey();
            int cnt = e.getValue();

            if (magazineMap.containsKey(ch) && magazineMap.get(ch) >= cnt) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }


    private Map<Character, Integer> getCharFreqMap(String word) {
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        return hm;
    }
}