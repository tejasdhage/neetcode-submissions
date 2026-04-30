class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> prevRow = null;
        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currRow.add(1);
                } else {
                    currRow.add(prevRow.get(j) + prevRow.get(j - 1));
                }
            }

            prevRow = currRow;
        }

        return prevRow;
    }
}