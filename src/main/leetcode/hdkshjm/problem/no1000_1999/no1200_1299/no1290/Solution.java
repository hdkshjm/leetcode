package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1290;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public int getDecimalValue(ListNode head) {
        int ret = 0;
        while(head != null){
            ret = (ret << 1) + head.val;
            head = head.next;
        }
        return ret;
    }
}
