package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0208;

import java.util.HashMap;
import java.util.Map;

class Trie {
    private Map<Character, Node> map;

    public Trie() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        char[] array = word.toCharArray();
        Node head = map.getOrDefault(array[0], new Node(array[0]));
        map.put(array[0], head);
        for (int i = 1; i < array.length; i++) {
            if (head.nexts[array[i] - 'a'] == null) head.nexts[array[i] - 'a'] = new Node(array[i]);
            head = head.nexts[array[i] - 'a'];
        }
        head.isEnd = true;
    }

    public boolean search(String word) {
        char[] array = word.toCharArray();
        Node head = map.get(array[0]);
        if(head == null) return false;
        for (int i = 1; i < array.length; i++) {
            if (head.nexts[array[i] - 'a'] == null) return false;
            head = head.nexts[array[i] - 'a'];
        }

        if(head.isEnd) return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        char[] array = prefix.toCharArray();
        Node head = map.get(array[0]);
        if(head == null) return false;
        for (int i = 1; i < array.length; i++) {
            if (head.nexts[array[i] - 'a'] == null) return false;
            head = head.nexts[array[i] - 'a'];
        }
        return true;
    }
}

class Node {
    public char val;
    public boolean isEnd;
    public Node[] nexts = null;

    public Node(char val) {
        this.val = val;
        this.nexts = new Node[26];
    }
}
