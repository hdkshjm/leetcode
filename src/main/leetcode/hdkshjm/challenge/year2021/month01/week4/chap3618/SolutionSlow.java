package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3618;

//Runtime: 824 ms
//Memory Usage: 44.3 MB
class SolutionSlow {
    public int concatenatedBinary(int n) {
        int MODULO = 1000000007;
        if (n == 1) return 1;

        int previous = concatenatedBinary(n - 1);
        int num = n;
        int ret = previous;
        while (num > 0) {
            num = num >> 1;
            ret = ret << 1;
            if (ret >= MODULO) ret %=  MODULO;
        }

        ret += n;
        return ret;
    }
}
