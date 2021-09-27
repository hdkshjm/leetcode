package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3989;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            char[] array = email.toCharArray();
            int i = 0;
            for (; i < array.length; i++) {
                if (array[i] == '@' || array[i] == '+') {
                    while (array[i] != '@' && i < array.length) i++;
                    break;
                }
                if (array[i] != '.') sb.append(array[i]);
            }
            sb.append(array, i, array.length - i);
            set.add(sb.toString());
        }
        return set.size();
    }
}
