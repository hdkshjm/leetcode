package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0374;

public class GuessGame {
    private int pick;

    public GuessGame() {
        this.pick = pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        if (pick < num) return -1;
        if (pick == num) return 0;
        return 1;
    }
}
