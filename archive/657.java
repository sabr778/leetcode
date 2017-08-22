/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/
class Solution {
    public boolean judgeCircle(String moves) {
        int[] movesNum = new int[4];
        for (char ch: moves.toCharArray()) {
        	switch(ch) {
        		case 'R':
        			movesNum[0] = movesNum[0] + 1;
        			break;
        		case 'L':
        			movesNum[1] = movesNum[1] + 1;
        			break;
        		case 'U':
        			movesNum[2] = movesNum[2] + 1;
        			break;
        		case 'D':
        			movesNum[3] = movesNum[3] + 1;
        			break;
        		default: break;
        	}
        }
        return movesNum[0] == movesNum[1] && movesNum[2] == movesNum[3];
    }
}