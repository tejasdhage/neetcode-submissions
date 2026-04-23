class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];

            if (isSubString(currWord, i, words)) {
                ans.add(currWord);
            }
        }

        return ans;
    }

    private boolean isSubString(String target, int idx, String[] words) {
        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];

            if (i != idx && currWord.contains(target)) {
                return true;
            }
        }

        return false;
    }
}