public class LongestPalinSubstring_leet5 {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i ; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int start = i,aStart = i,flag = 0;
                    int end = j,aEnd = j;
                    String temp = "";
                    while (start <= end) {
                        if (s.charAt(start) == s.charAt(end)) {
                            start++;
                            end--;
                        } else {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        temp = s.substring(aStart, aEnd + 1);
                    }
                    if (temp.length() > ans.length()) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
}
