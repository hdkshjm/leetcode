package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0878;

class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long modulo = (int) Math.pow(10, 9) + 7;
        return (int) (calc(n, a, b) % modulo);
    }

    public long calc(int n, int a, int b) {
        if (a == b) return (long) n * a;
        if (a % b == 0 || b % a == 0) return (long) n * Math.min(a, b);

        long lcm = calcLcm(a, b);
        long numOfDivisors = lcm / a + lcm / b - 1;
        long ret = n / numOfDivisors * lcm;

        long remainder = n % numOfDivisors;
        if (remainder == 0) return (long) ret;

        long multipleOfA = 0;
        long multipleOfB = 0;
        if(a < b) multipleOfA +=a;
        else multipleOfB +=b;

        while (remainder != 0) {
            if (multipleOfA < multipleOfB) multipleOfA += a;
            else multipleOfB += b;
            remainder--;
        }
        ret += Math.min(multipleOfA, multipleOfB);
        return ret;
    }

    long calcGcd(long a, long b) {
        if (b == 0) return a;
        else return calcGcd(b, a % b);
    }

    long calcLcm(long a, long b) {
        long d = calcGcd(a, b);
        return a / d * b;
    }
}
