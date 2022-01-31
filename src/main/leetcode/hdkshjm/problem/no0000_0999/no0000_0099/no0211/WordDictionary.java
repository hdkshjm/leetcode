package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0211;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {
    private Trie root;

    public WordDictionary() {
        root = new Trie();
    }

    public void addWord(String word) {
        Trie current = root;
        for (char n : word.toCharArray()) {
            if (!current.children.containsKey(n)) current.children.put(n, new Trie());
            current = current.children.get(n);
        }
        current.end = true;
    }

    public boolean search(String word) {
        return search(word, root);
    }

    public boolean search(String word, Trie trie) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                for (char child : trie.children.keySet())
                    if (search(word.substring(i + 1), trie.children.get(child))) return true;

                return false;
            }
            if (!trie.children.containsKey(word.charAt(i))) return false;
            trie = trie.children.get(word.charAt(i));
        }
        return trie.end;
    }

}

class Trie {
    public Map<Character, Trie> children = new HashMap();
    public boolean end;

    public Trie() {
    }
}
