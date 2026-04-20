class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            int l = s.length();

            sb.append(l);
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        int i = 0;
        StringBuilder cntStr = new StringBuilder();
        while (i < str.length()) {
            char ch = str.charAt(i);

            if (ch == '#') {
                int cnt = Integer.parseInt(cntStr.toString());
                i++;
                ans.add(str.substring(i, i + cnt));
                i += cnt;

                cntStr = new StringBuilder();
            } else {
                cntStr.append(ch);
                i++;
            }
        }

        return ans;
    }
}
