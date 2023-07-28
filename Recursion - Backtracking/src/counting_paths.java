import java.util.*;

public class counting_paths {
    public static void main(String[] args) {
        System.out.println(path(3,3));

        paths(3,3,"");

        System.out.println(pathsList(3,3,""));

        System.out.println(pathsDiagonal(3,3,""));
    }

    static int path(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = path(r-1, c);
        int right = path(r, c-1);

        return left+right;
    }

    // to print the paths:
    static void paths(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }


        if (r>1) {
            paths(r-1, c, p+'D');
        }

        if (c>1) {
            paths(r, c-1, p+'R');
        }

    }

    static List<String> pathsList(int r, int c, String p) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1) {
            list.addAll(pathsList(r-1, c, p+'D'));
        }

        if (c>1) {
            list.addAll(pathsList(r, c-1, p+'R'));
        }

        return list;
    }

    static List<String> pathsDiagonal(int r, int c, String p) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathsDiagonal(r-1, c-1, p+"d"));
        }

        if (r>1) {
            list.addAll(pathsDiagonal(r-1, c, p+'D'));
        }

        if (c>1) {
            list.addAll(pathsDiagonal(r, c-1, p+'R'));
        }

        return list;
    }
}
