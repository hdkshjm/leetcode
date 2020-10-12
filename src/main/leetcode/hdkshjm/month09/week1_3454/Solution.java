package leetcode.hdkshjm.month09.week1_3454;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");

        int min = Math.min(version1Array.length, version2Array.length);
        int max = Math.max(version1Array.length, version2Array.length);

        for (int i = 0; i < max; i++) {
            int revision1 = 0;
            int revision2 = 0;

            if (i < min) {
                revision1 = Integer.parseInt(version1Array[i]);
                revision2 = Integer.parseInt(version2Array[i]);
            }
            if (i >= min) {
                if (version1Array.length > version2Array.length) {
                    revision1 = Integer.parseInt(version1Array[i]);
                } else {
                    revision2 = Integer.parseInt(version2Array[i]);
                }
            }
            if (revision1 > revision2) {
                return 1;
            }
            if (revision1 < revision2) {
                return -1;
            }
        }
        
        return 0;
    }
}
