class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> prevRow = null;
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int sum = prevRow.get(j) + prevRow.get(j - 1);
                    row.add(sum);
                }
            }

            ans.add(row);
            prevRow = row;
        }

        return ans;
    }
}