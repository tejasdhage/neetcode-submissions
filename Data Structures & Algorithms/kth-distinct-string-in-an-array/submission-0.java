class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            String currStr = arr[i];
            hm.put(currStr, hm.getOrDefault(currStr, 0) + 1);
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            String currStr = arr[i];

            if (hm.get(currStr) == 1) {
                cnt++;

                if (cnt == k) {
                    return currStr;
                }
            }
        }

        return "";
    }
}