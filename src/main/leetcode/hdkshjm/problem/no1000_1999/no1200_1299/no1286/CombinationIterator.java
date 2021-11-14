package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1286;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

class CombinationIterator {
    private Queue<StringBuilder> combinations;

    public CombinationIterator(String characters, int combinationLength) {
        this.combinations = new ArrayDeque<>();
        List<Character> list = new ArrayList<>();
        for (char c : characters.toCharArray()) list.add(c);
        permutation(0, list, new ArrayList<Character>(), combinationLength);
    }

    public void permutation(int start, List<Character> list, List<Character> used, int combinationLength) {
        if (used.size() == combinationLength) {
            StringBuilder sb = new StringBuilder();
            for (char c : used) sb.append(c);
            this.combinations.add(sb);
            return;
        }

        for (int i = start; i < list.size(); i++) {
            if (used.contains(list.get(i))) continue;
            used.add(list.get(i));
            permutation(i + 1, list, used, combinationLength);
            used.remove(used.size() - 1);
        }
    }

    public String next() {
        return this.combinations.poll().toString();
    }

    public boolean hasNext() {
        return !this.combinations.isEmpty();
    }
}
