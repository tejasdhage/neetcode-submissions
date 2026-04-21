class Solution {
    public int lengthOfLastWord(String s) {
        
        int end = -1;
        boolean nonSpaceCharFound = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                end = i;
                break;
            }
        }

        int start = 0;
        for (int i = end; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                start = i + 1;
                break;
            }
        }

        return end - start + 1;

    }
}