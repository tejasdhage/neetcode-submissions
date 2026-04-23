class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String mail = emails[i];

            String email = trimEmail(mail);

            ans.add(email);
        }

        return ans.size();
    }

    private String trimEmail(String mail) {

        String[] mailSplit = mail.split("@");
        String localName = mailSplit[0];
        String domainName = mailSplit[1];

        localName = removePlus(localName);
        localName = removePeriod(localName);

        return localName + "@" + domainName;
    }

    private String removePlus(String localName) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localName.length(); i++) {
            char ch = localName.charAt(i);
            if (ch == '+') {
                break;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private String removePeriod(String localName) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localName.length(); i++) {
            char ch = localName.charAt(i);
            if (ch == '.') {
                continue;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


}