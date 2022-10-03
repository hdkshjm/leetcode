package leetcode.hdkshjm.problem.no1000_1999.no1345;

import java.util.*;

class Solution {
    public int minJumps(int[] arr) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int previous = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) map.put(arr[i], new HashSet<>());
            if (previous == arr[i]) continue;
            if (i > 0 ) map.get(arr[i - 1]).add(i - 1) ;
            map.get(arr[i]).add(i);
            previous = arr[i];
        }
        map.get(arr[arr.length-1]).add(arr.length-1);
        return dijkstra(arr, map);
    }

    // 1 1 1 2 2 2 3 3

    private int dijkstra(int[] arr, Map<Integer, Set<Integer>> map) {
        int MAX_LENGTH = arr.length + 1;

        // int position {index, length}
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> (a[1] - b[1]));
        boolean[] visited = new boolean[arr.length];

        int[] lengths = new int[arr.length];
        Arrays.fill(lengths, MAX_LENGTH);
        lengths[0] = 0;

        queue.add(new int[]{0, lengths[0]});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int current = node[0];
            visited[current] = true;

            int[] direction = new int[map.get(arr[current]).size() + 2];
            Set<Integer> set = map.get(arr[current]);
            Iterator<Integer> ite = set.iterator();
            for (int i = 0; i < set.size(); i++) direction[i] = ite.next();

            direction[direction.length - 2] = current - 1;
            direction[direction.length - 1] = current + 1;

            for (int next : direction) {
                if (next < 0 || next >= arr.length || visited[next]) continue;

                // 参考 http://www.deqnotes.net/acmicpc/dijkstra/
                if (lengths[next] > lengths[current] + 1) {
                    lengths[next] = lengths[current] + 1;
                    queue.add(new int[]{next, lengths[current] + 1});
                }
            }
        }
        return lengths[arr.length - 1] == MAX_LENGTH ? -1 : lengths[arr.length - 1];
    }
}
