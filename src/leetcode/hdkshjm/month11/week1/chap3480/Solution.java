package leetcode.hdkshjm.month11.week1.chap3480;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    private List<Integer> range;

    public RecentCounter() {
        range = new ArrayList<Integer>();
    }

    public int ping(int t) {
        while (true) {
            if (range.size() == 0) {
                break;
            }

            int time = range.get(0);
            if (t - time > 3000) {
                range.remove(0);
            } else {
                break;
            }
        }

        range.add(range.size(), t);
        return range.size();
    }
}
