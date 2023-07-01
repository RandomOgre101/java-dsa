import java.util.ArrayList;
import java.util.List;

public class String_Builder {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a'+i);
//            sb.append(ch);
//        }
//
//        System.out.println(sb);
        System.out.println(excel(28));


    }

    static String excel(int columnNumber){
        StringBuilder output = new StringBuilder();
        // Run a while loop while columnNumber is positive...
        while(columnNumber > 0){
            // Subtract 1 from columnNumber...
            columnNumber--;
            // Get current character by doing modulo of columnNumber by 26...
            char c = (char) (columnNumber % 26 + 'A');
            // Divide columnNumber by 26...
            columnNumber /= 26;
            // Append the character into output...
            output.append(c);
        }
        // Reverse the output string...
        // Bcause we have found characters from right to left...
        output.reverse();
        // Return the reversed string.
        return output.toString();
    }
}