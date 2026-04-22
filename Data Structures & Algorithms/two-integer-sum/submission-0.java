class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            int reqNum = target - currNum;
            if (hm.containsKey(reqNum)) {
                return new int[] {hm.get(reqNum), i};
            }

            hm.put(currNum, i);
        }

        return null;
    }
}
