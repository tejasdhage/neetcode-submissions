class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        

        return Math.max(findMaxIncreasing(nums), findMaxDecreasing(nums));
    }

    private int findMaxIncreasing(int[] nums) {

        int maxCnt = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int prevNum = Integer.MIN_VALUE;
            if (i - 1 >= 0) {
                prevNum = nums[i - 1];
            }

            if (currNum > prevNum) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }

        return maxCnt;
    }

    private int findMaxDecreasing(int[] nums) {

        int maxCnt = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int prevNum = Integer.MAX_VALUE;
            if (i - 1 >= 0) {
                prevNum = nums[i - 1];
            }

            if (currNum < prevNum) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }

        return maxCnt;
    }
}