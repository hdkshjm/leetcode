package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0258;

class Solution {
    public int addDigits1(int num) {
        while(num > 9){
            int sum = 0;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
