class Solution {
    public boolean check(int[] nums) {
        
        int lowestIdx = findLowestIdx(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int newIdx = (lowestIdx + i) % nums.length;
            int nextIdx = (lowestIdx + i + 1) % nums.length;

            if (nums[newIdx] > nums[nextIdx]) {
                return false;
            }
        }

        return true;
    }

    private int findLowestIdx(int[] nums) {

        int minIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            int currNum = nums[i];

            if (currNum < nums[minIdx]) {
                minIdx = i;
            }
        }

        return minIdx;
    }
}