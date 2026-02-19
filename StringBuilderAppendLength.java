import java.util.*;

public class StringBuilderAppendLength {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("h");

        // Append characters
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');

        // Print final string
        System.out.println(sb);

        // Print length of string
        System.out.println(sb.length());
    }
}
