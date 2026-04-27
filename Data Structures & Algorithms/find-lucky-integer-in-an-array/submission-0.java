class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int currNum = arr[i];

            hm.put(currNum, hm.getOrDefault(currNum, 0) + 1);
        }

        int maxNum = -1;
        for (Map.Entry<Integer, Integer> e: hm.entrySet()) {
            int currNum = e.getKey();
            int cnt = e.getValue();

            if (currNum == cnt) {
                maxNum = Math.max(maxNum, currNum);
            }
        }

        return maxNum;
    }
}