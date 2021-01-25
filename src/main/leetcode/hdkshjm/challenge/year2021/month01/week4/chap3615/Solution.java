package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3615;

import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = new ArrayList<>();
        for(ListNode node: lists){
            while(node!=null){
                list.add(node);
                node = node.next;
            }
        }

        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            public int compare(ListNode left, ListNode right) {
                return left.val - right.val;
            }
        };
        Collections.sort(list, comparator);
        for(int i = 0; i < list.size() -1 ; i++){
            list.get(i).next = list.get(i+1);
        }
        if(list.isEmpty()) return null;
        return list.get(0);
    }
}
