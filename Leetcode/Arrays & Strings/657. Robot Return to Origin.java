// Example 1:

// Input: moves = "UD"
// Output: true
// Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
// Example 2:

// Input: moves = "LL"
// Output: false
// Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
class Solution {
    public boolean judgeCircle(String moves) {

        int side = 0;
        int height = 0;
        for(int i=0;i<moves.length();i++){
        
                switch(moves.charAt(i)){
                    case 'R':
                        side++;
                        break;
                    case 'L':
                        side--;
                        break;
                    case 'U':
                        height++;
                        break;
                    case 'D':
                        height--;
                        break;
                    default:
                        break;
                }
        }
        if((side == 0 && height == 0)){
            return true;
        }
        return false;
    }
}
