package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0043;

class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";

        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int length = array1.length + array2.length;
        int[] production = new int[length];
        for (int i = array1.length - 1; i >= 0; i--)
            for (int j = array2.length - 1; j >= 0; j--)
                production[array1.length - 1 - i + array2.length - 1 - j] += (array1[i] - '0') * (array2[j] - '0');

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < production.length - 1; i++) {
            production[i + 1] += production[i] / 10;
            sb.insert(0, production[i] % 10);
        }
        int firstDigit = production[production.length - 1] % 10;
        if (firstDigit != 0) sb.insert(0, firstDigit);

        return sb.toString();
    }
}
