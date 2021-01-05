package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3509;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;

        ListNode loopedNode1 = head.next;
        ListNode loopedNode2 = head.next.next;
        while (loopedNode1 != loopedNode2) {
            loopedNode1 = loopedNode1.next;
            if (loopedNode2.next == null || loopedNode2.next.next == null) return null;
            loopedNode2 = loopedNode2.next.next;
        }

        /*
        - 定義
        loop開始までの距離: S
        loop内の長さ: L
        かめ(loopedNode)のloop内の移動距離: X

        - かめ(loopedNode)とうさぎ(tempNode)の交差した点までの距離
        かめ: S + X mod L
        うさぎ: S + (S + 2X ) mod L

        - かめとウサギは出会ってることから
        X mod L = (S + 2X ) mod L
        0 = (S + X ) mod L

        なので、カメの交差点までの距離 S + X mod L に Sを足すと
        S + (X + S)mod L = S
        head と loopedNodeを一緒に移動させて交わったところがloop開始点になる
         */
        while (loopedNode1 != head) {
            loopedNode1 = loopedNode1.next;
            head = head.next;
        }

        return loopedNode1;
    }
}
