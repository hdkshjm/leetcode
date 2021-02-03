package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3627;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null ) return false;

        ListNode first = head;
        ListNode second = head.next;

        int count = 0;
        while(count++ < 10000){
            if( first.val == second.val ) return true;
            if( second.next == null || second.next.next == null ) return false;
            first = first.next;
            second = second.next.next;
        }
        return true;
    }
}
