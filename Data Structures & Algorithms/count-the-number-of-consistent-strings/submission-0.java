class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);

            set.add(ch);
        }

        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            boolean isPossible = true;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (!set.contains(ch)) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                cnt += 1;
            }
        }

        return cnt;
    }
}