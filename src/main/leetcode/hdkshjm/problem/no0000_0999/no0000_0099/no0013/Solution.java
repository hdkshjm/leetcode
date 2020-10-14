package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0013;

class Solution {
    public int romanToInt(String s) {
        int ret = 0;

        int[] thousandsPlace = convert(s, "M", 1000, "A", 0, "B", 0);
        s = s.substring(thousandsPlace[0]);
        ret = ret + thousandsPlace[1];

        int[] hundredsPlace = convert(s, "C", 100, "D", 500, "M", 1000);
        s = s.substring(hundredsPlace[0]);
        ret = ret + hundredsPlace[1];

        int[] tensPlace = convert(s, "X", 10, "L", 50, "C", 100);
        s = s.substring(tensPlace[0]);
        ret = ret + tensPlace[1];

        int[] onesPlace = convert(s, "I", 1, "V", 5, "X", 10);
        s = s.substring(onesPlace[0]);
        ret = ret + onesPlace[1];

        return ret;
    }

    public int[] convert(String s,
                         String multiple1String, int multiple1Value,
                         String multiple5String, int multiple5Value,
                         String multiple10String, int multiple10Value) {

        char multiple1 = multiple1String.charAt(0);
        char multiple5 = multiple5String.charAt(0);
        char multiple10 = multiple10String.charAt(0);

        if (s.length() > 1) {
            if (s.charAt(0) == multiple1 && s.charAt(1) == multiple10) { // 9
                return new int[]{2, multiple10Value - multiple1Value};
            }
            if (s.charAt(0) == multiple1 && s.charAt(1) == multiple5) { // 4
                return new int[]{2, multiple5Value - multiple1Value};
            }
        }

        int index = 0;
        int ret = 0;
        while (true) {
            if (index >= s.length()) {
                break;
            }

            char c = s.charAt(index);

            if (c == multiple1) {
                ret = ret + multiple1Value;
                index++;
                continue;
            }

            if (c == multiple5) {
                ret = ret + multiple5Value;
                index++;
                continue;
            }

            if (c == multiple10) {
                ret = ret + multiple10Value;
                index++;
                continue;
            }

            break;
        }

        return new int[]{index, ret};

    }
}
