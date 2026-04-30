class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> charMap = getCharFreqMap(chars);
        
        int n = words.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String word = words[i];
            Map<Character, Integer> freqMap = getCharFreqMap(word);
            
            boolean isPossible = true;
            for (Map.Entry<Character, Integer> e: freqMap.entrySet()) {
                char ch = e.getKey();
                int cnt = e.getValue();

                if (!charMap.containsKey(ch) || charMap.get(ch) < cnt) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                ans += word.length();
            }
        }

        return ans;
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