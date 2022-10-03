package leetcode.hdkshjm.problem.no1000_1999.no1032;

import java.util.ArrayDeque;
import java.util.Deque;

class StreamChecker {
    private Node root;
    private Deque<Character> deque;

    public StreamChecker(String[] words) {
        this.root = new Node();
        this.deque = new ArrayDeque<>();
        for (String word : words) {
            char[] array = word.toCharArray();
            Node node = root;
            for (int i = array.length - 1; i >= 0; i--) {
                int index = (int) array[i] - 'a';
                if (node.children[index] == null) node.children[index] = new Node();
                node = node.children[index];
            }
            node.isEnd = true;
        }
    }

    public boolean query(char letter) {
        deque.addFirst(letter);
        Node node = root;
        for (char c : deque) {
            if (node.isEnd) return true;
            int index = (int) c- 'a';
            if (node.children[index] == null) return false;
            node = node.children[index];
        }

        return node.isEnd;
    }
}

class Node {
    public boolean isEnd;
    public Node[] children;

    public Node() {
        this.children = new Node[26];
    }
}
