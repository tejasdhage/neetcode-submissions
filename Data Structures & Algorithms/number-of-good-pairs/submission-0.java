class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            hm.put(currNum, hm.getOrDefault(currNum, -1) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> e: hm.entrySet()) {
            int key = e.getKey();
            int cnt = e.getValue();

            ans = ans + (cnt * (cnt + 1) / 2);
        }

        return ans;
    }
}