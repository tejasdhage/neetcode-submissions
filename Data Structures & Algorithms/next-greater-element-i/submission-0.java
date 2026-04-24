class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> hm = getHm(nums1);
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            int currNum = nums2[i];

            while (!stack.isEmpty() && stack.peek() < currNum) {
                int prevNum = stack.pop();

                int idx = hm.getOrDefault(prevNum, -1);
                if (idx != -1) {
                    ans[idx] = currNum;
                }
            }
            stack.push(currNum);
        }

        return ans;
    }

    private Map<Integer, Integer> getHm(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        return hm;
    }
}