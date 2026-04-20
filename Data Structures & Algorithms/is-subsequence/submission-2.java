class Solution {
    public boolean isSubsequence(String s, String t) {

        Map<Character, List<Integer>> hm = new HashMap<>();
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!hm.containsKey(ch)) {
                List<Integer> arr = new ArrayList<>();
                arr.add(i);
                hm.put(ch, arr);
            } else {
                List<Integer> arr = hm.get(ch);
                arr.add(i);
            }
        }

        int prevCharPos = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!hm.containsKey(ch)) {
                return false;
            }

            List<Integer> arr = hm.get(ch);

            int val = search(arr, prevCharPos);
            if (val == -1) {
                return false;
            }

            prevCharPos = val;
        }

        return true;
    }

    private int search(List<Integer> arr, int target) {

        int low = 0, high = arr.size() - 1;

        int val = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > target) {
                val = arr.get(mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return val;
    }
}