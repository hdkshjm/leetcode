package leetcode.hdkshjm.september.week3_3463;

class Solution {

    final int NORTH = 0;
    final int EAST = 1;
    final int SOUTH = 2;
    final int WEST = 3;

    final int X = 0;
    final int Y = 1;
    final int DIRECTION = 2;

    public boolean isRobotBounded(String instructions) {
        // X, Y, direction;
        int[] position = new int[] { 0, 0, NORTH };

        for (String s : instructions.split("")) {
            switch (s){
            case "G":
                switch (position[DIRECTION]) {
                case NORTH:
                    position[Y]++;
                        break;
                    case EAST:
                        position[X]++;
                        break;
                    case SOUTH:
                        position[Y]--;
                        break;
                    case WEST:
                        position[X]--;
                        break;
                }
              break;
            case "L":
                position[DIRECTION]--;
                if (position[DIRECTION] < NORTH) {
                    position[DIRECTION] = WEST;
                }
              break;
            case "R":
                position[DIRECTION]++;
                if (position[DIRECTION] > WEST) {
                    position[DIRECTION] = NORTH;
                }
              break;
          }
        }
        switch (position[DIRECTION]) {
            case NORTH:
                return position[X] == 0 && position[Y] == 0;
            default:
                return true;
        }
    }

}

