package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1044;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String longestDupSubstring(String s) {
        char[] array = s.toCharArray();
        Suffix[] suffixes = new Suffix[array.length];
        for (int i = 0; i < array.length; i++) {
            suffixes[i] = new Suffix(array, i);
        }
        Arrays.sort(suffixes, new SuffixComparator());

        int position = 0;
        int length = 0;
        for (int i = 0; i < array.length - 1; i++) {
            Suffix left = suffixes[i];
            Suffix right = suffixes[i + 1];
            int j;
            for (j = 0; j < Math.min(left.getLength(), right.getLength()); j++) if (left.charAt(j) != right.charAt(j)) break;
            if (j > length) {
                position = left.getPosition();
                length = j;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(array, position, length);
        return sb.toString();
    }
}

class Suffix {
    private char[] array;
    private int position;

    public Suffix(char[] array, int position) {
        this.array = array;
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public int getLength() {
        return this.array.length - this.position;
    }

    public char charAt(int i) {
        return array[i + this.position];
    }
}

class SuffixComparator implements Comparator<Suffix> {
    @Override
    public int compare(Suffix left, Suffix right) {
        int n = Math.min(left.getLength(), right.getLength());
        for (int i = 0; i < n; i++) {
            if (left.charAt(i) < right.charAt(i)) return -1;
            if (left.charAt(i) > right.charAt(i)) return +1;
        }
        return left.getLength() - right.getLength();
    }
}
