package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0165;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> list1 = new ArrayList<>();
        for (String val : version1.split("\\.")) list1.add(Integer.valueOf(val));
        List<Integer> list2 = new ArrayList<>();
        for (String val : version2.split("\\.")) list2.add(Integer.valueOf(val));

        int diff = list1.size() - list2.size();
        if (diff > 0) for (int i = 0; i < diff; i++) list2.add(0);
        else for (int i = 0; i < -diff; i++) list1.add(0);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < list2.get(i)) return -1;
            if (list1.get(i) > list2.get(i)) return 1;
        }
        return 0;
    }
}
