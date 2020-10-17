package leetcode.hdkshjm.month10.week3.chap3498;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 20) {
            return Arrays.asList(s.substring(0, 10));
        }

        List<String> ret = new ArrayList<>();
        int length = 0;
        char[] chars = s.toCharArray();
        int i;
        for (i = 0; i < chars.length - 10; i++) {
            System.out.println("============ i=" + i);

            if (length >= 10) {
                System.out.println("i=" + i);
                ret.add(s.substring(i - 9, i + 1));
                System.out.println("add String=" + s.substring(i - 9, i + 1));
            }

            System.out.println("before c=" + chars[i] + ", length=" + length);
            if (chars[i] == chars[i + 10]) {
                length++;
            } else {
                for (int j = 2; j < length;j++) {
                    if ( chars[i-1] != chars[i-j] ||  j == length -1 ){
                        System.out.println("backto chars[i]=" + chars[i] + ", chars[i-j]=" + chars[i-j]);
                        System.out.println("backto i=" + i + ", i-j=" + (i-j));
                        i = i - j-1;
                        break;
                    }
                }
                System.out.println("backto length=" + length);
                length = 0;
                continue;
            }
            System.out.println("after c=" + chars[i] + ", length=" + length);
        }
        if (length >= 10) {
            ret.add(s.substring(i - 9, i + 1));
            System.out.println("add String=" + s.substring(i - 9, i + 1));
        }

        return ret;
    }
}