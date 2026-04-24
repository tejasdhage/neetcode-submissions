class Solution {
    public int maxDifference(String s) {
        
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int maxOddCnt = Integer.MIN_VALUE;
        int minEvenCnt = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> e: hm.entrySet()) {
            char ch = e.getKey();
            int cnt = e.getValue();

            if (cnt % 2 == 0) {
                if (cnt < minEvenCnt) {
                    minEvenCnt = cnt;
                }
            } else {
                if (cnt > maxOddCnt) {
                    maxOddCnt = cnt;
                }
            }
        }

        return maxOddCnt - minEvenCnt;
    }
}