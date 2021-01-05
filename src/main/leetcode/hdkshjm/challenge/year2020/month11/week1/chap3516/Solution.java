package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3516;

class Solution {
    public int getDecimalValue(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret = ret << 1;
            ret += head.val;
            head = head.next;
        }
        return ret;
    }
}
