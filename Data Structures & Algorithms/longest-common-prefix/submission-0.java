class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int minLen = getSmallestStrLength(strs);

        for (int i = 0; i < minLen; i++) {

            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char currCh = strs[j].charAt(i);
                if (ch != currCh) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }

    private int getSmallestStrLength(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int currLen = strs[i].length();
            if (currLen < minLen) {
                minLen = currLen;
            }
        }

        return minLen;
    }
}