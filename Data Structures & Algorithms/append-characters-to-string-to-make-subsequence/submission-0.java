class Solution {
    public int appendCharacters(String s, String t) {
        
        int i = 0, j = 0;

        while (i < t.length() && j < s.length()) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(j);
            
            if (tChar == sChar) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return t.length() - i;
    }
}