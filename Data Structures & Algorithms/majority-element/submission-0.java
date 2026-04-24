class Solution {
    public int majorityElement(int[] nums) {
        
        Integer elem = null;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];

            if (cnt == 0) {
                elem = currNum;
                cnt = 1;
            } else {
                if (elem == currNum) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }

        return elem;
    }
}