package leetcode.hdkshjm.month11.week1.chap3481;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

class Solution {
    HashMap<Integer, List<Integer>> cache = new HashMap<Integer, List<Integer>>();
    Queue<Integer> unchekedQueue = new ArrayDeque<Integer>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        unchekedQueue.add(target);
        while (true) {
            Integer i = unchekedQueue.poll();
            if (i == null)
                break;
            createCache(candidates, i);
        }


        ArrayDeque<List<Integer>> queue = new ArrayDeque<List<Integer>>();
        for (int c : cache.get(target)) {
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(target - c);// index=0には残りをいれる
            newList.add(c);
            queue.add(newList);
        }

        
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        while (true) {
            List<Integer> list = queue.poll();
            if (list == null) {
                break;
            }

            int remain = list.get(0);
            if (remain == 0) {
                list.remove(0);
                ret.add(list);
                continue;
            }

            List<Integer> nextCandidates = cache.get(remain);
            if (nextCandidates == null || nextCandidates.size() == 0) {
                continue;
            }
            for (int c : nextCandidates) {
                if (c < list.get(list.size() - 1)) {
                    continue;
                }
                
                List<Integer> newList = new ArrayList<Integer>(list);
                newList.remove(0);
                newList.add(0, remain - c);
                newList.add(c);
                queue.add(newList);
            }
        }
        return ret;
    }

    public boolean createCache(int[] candidates, int target) {
        List<Integer> list = new ArrayList<Integer>();

        for (int c : candidates) {
            int newTarget = target - c;

            if (newTarget < 0) {
                break;
            }
            
            if (newTarget == 0) {
                list.add(c);
                break;
            }

            if (newTarget > 0) {
                if (!cache.containsKey(newTarget)) {
                    unchekedQueue.add(newTarget);
                }
                list.add(c);
            }
        }
        cache.put(target, list);

        return list.size() > 0;
    }
}