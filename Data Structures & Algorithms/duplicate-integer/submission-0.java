class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            if (set.contains(currNum)) {
                return true;
            }
            set.add(currNum);
        }

        return false;
    }
}