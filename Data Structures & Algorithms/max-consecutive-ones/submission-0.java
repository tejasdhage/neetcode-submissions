class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCnt = 0, currCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            if (currNum == 1) {
                currCount++;
                if (currCount > maxCnt) {
                    maxCnt = currCount;
                }
            } else {
                currCount = 0;
            }
        }

        return maxCnt;
    }
}