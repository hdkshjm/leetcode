package leetcode.hdkshjm.month09.week2_3455;

class Solution {
    public String getHint(String secret, String guess) {
        String[] guessArray = guess.split("");
        String[] secretArray = secret.split("");
        
        int bulls = 0;
        int cows = 0;

        int[] guessDist = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] secretDist = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        
        for (int i = 0; i < guessArray.length; i++) {
            if( guessArray[i].equals(secretArray[i]) ) {
                bulls++;
            } else {
                guessDist[Integer.parseInt(guessArray[i])]++;
                secretDist[Integer.parseInt(secretArray[i])]++;
            }
        }
        for (int i = 0; i < guessDist.length; i++) {
            cows = cows + Math.min(guessDist[i], secretDist[i]);
        }
        return String.format("%dA%dB", bulls, cows);
    }
}