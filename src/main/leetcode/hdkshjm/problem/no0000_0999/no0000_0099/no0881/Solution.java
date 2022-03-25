package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0881;

import java.util.*;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light = 0;
        int heavy = people.length - 1;
        int count = 0;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) light++;
            heavy--;
            count++;
        }
        return count;
    }

    //150ms
    public int numRescueBoatsSlow(int[] people, int limit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int p : people) map.put(p, map.getOrDefault(p, 0) + 1);
        TreeSet<Integer> set = new TreeSet<>(map.keySet());

        int count = 0;
        while (!map.isEmpty()) {
            int heavy = set.last();
            if (heavy * 2 <= limit) break;

            int light = limit - heavy;
            while (light > 0) {
                if (map.containsKey(light)) {
                    int numOfLight = map.get(light);
                    int numOfHeavy = map.get(heavy);
                    if (numOfHeavy > numOfLight) {
                        count += numOfLight;
                        map.remove(light);
                        set.remove(light);
                        map.put(heavy, numOfHeavy - numOfLight);
                    } else if (numOfHeavy == numOfLight) {
                        count += numOfLight;
                        map.remove(light);
                        set.remove(light);
                        map.remove(heavy);
                        set.remove(heavy);
                        break;
                    } else {
                        count += numOfHeavy;
                        map.remove(heavy);
                        set.remove(heavy);
                        map.put(light, numOfLight - numOfHeavy);
                        break;
                    }
                }
                light--;
            }
            if (map.containsKey(heavy)) {
                count += map.get(heavy);
                map.remove(heavy);
                set.remove(heavy);
            }
        }

        int tmp = 0;
        while (!map.isEmpty()) {
            tmp += map.get(set.last());
            map.remove(set.last());
            set.remove(set.last());
        }
        count += tmp / 2 + tmp % 2;

        return count;
    }
}
