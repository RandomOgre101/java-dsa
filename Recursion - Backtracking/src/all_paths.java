public class all_paths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true , true}
        };

        allPaths(0,0, "", board);
    }

    static void allPaths(int r, int c, String p, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length-1) {
            allPaths(r+1, c, p+'D', maze);
        }

        if (c < maze[0].length-1) {
            allPaths(r, c+1, p+'R', maze);
        }

        if (r > 0) {
            allPaths(r-1, c, p+'U', maze);
        }

        if  (c > 0) {
            allPaths(r, c-1, p+'L', maze);
        }

        maze[r][c] = true;
    }

}
