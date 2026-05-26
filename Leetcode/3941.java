class Solution {
    public int passwordStrength(String password) {
        int low[] = new int[26];
        int upp[] = new int[26];
        int num[] = new int[10];
        int s[] = new int[4];
        int res = 0;
        for (int i = 0; i < password.length(); i++) {
            int ch = (int) password.charAt(i);
            if (ch >= 48 && ch <= 57) {
                if (num[ch - 48] != 1) {
                    res += 3;
                    num[ch - 48] = 1;
                }
            } else if (ch >= 97 && ch <= 122) {
                if (low[ch - 97] != 1) {
                    res += 1;
                    low[ch - 97] = 1;
                }
            } else if (ch >= 65 && ch <= 90) {
                if (upp[ch - 65] != 1) {
                    res += 2;
                    upp[ch - 65] = 1;
                }
            } else {
                char c = password.charAt(i);
                if (c == '!' && s[0] != 1) {
                    res += 5;
                    s[0] = 1;
                } else if (c == '@' && s[1] != 1) {
                    res += 5;
                    s[1] = 1;
                } else if (c == '#' && s[2] != 1) {
                    res += 5;
                    s[2] = 1;
                } else if (c == '$' && s[3] != 1) {
                    res += 5;
                    s[3] = 1;
                }
            }
        }
        return res;
    }
}