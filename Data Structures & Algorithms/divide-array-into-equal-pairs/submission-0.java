class Solution {
    public boolean divideArray(int[] nums) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            hm.put(currNum, hm.getOrDefault(currNum, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e: hm.entrySet()) {
            int key = e.getKey();
            int cnt = e.getValue();

            if (cnt % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}