import java.util.*;

/*
    0  1  2
 0  |_|_|_|
 1  |_|X|_|
 2  |_|_|_|
 */

public class maze_with__obstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true , true}
        };

        obstacle(0,0, "", board);
    }

    static void obstacle(int r, int c, String p, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
           return;
        }


        if (r < maze.length-1) {
            obstacle(r+1, c, p+'D', maze);
        }

        if (c < maze[0].length-1) {
            obstacle(r, c+1, p+'R', maze);
        }
    }
}
