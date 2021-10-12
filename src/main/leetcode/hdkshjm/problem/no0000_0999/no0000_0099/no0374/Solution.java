package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0374;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long min = 1;
        long max = n;

        long current = 0;
        while (max >= min) {
            current = (min + max) / 2;
            int result = guess((int) current);
            if (result == -1) {
                if (current == max) max--;
                else max = current;
                continue;
            }
            if (result == 1) {
                if (current == min) min++;
                else min = current;
                continue;
            }
            break;
        }

        return (int) current;
    }
}
