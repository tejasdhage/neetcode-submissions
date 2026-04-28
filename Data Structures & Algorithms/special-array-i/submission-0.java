class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            int prevNum = nums[i - 1];
            int currNum = nums[i];

            if ((prevNum % 2 == 0 && currNum % 2 == 0) ||
                (prevNum % 2 == 1 && currNum % 2 == 1)) {
                return false;
            }
        }

        return true;
    }
}