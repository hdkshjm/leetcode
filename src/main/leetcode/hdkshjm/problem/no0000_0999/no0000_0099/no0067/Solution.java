package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0067;

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) return addBinary(b, a);

        // a.length() < b.length()
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < a.length(); i++) {
            carry += a.charAt(a.length() - 1 - i) - '0' + b.charAt(b.length() - 1 - i) - '0';
            sb.insert(0, carry % 2);
            carry >>= 1;
        }
        for (int i = a.length(); i < b.length(); i++) {
            carry += b.charAt(b.length() - 1 - i) - '0';
            sb.insert(0, carry % 2);
            carry >>= 1;
        }
        if (carry > 0) sb.insert(0, carry);
        return sb.toString();
    }
}
