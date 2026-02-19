import java.util.*;

public class StringBuilderInsertDelete {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Aryan");
        System.out.println(sb);

        // Insert character at index 1
        sb.insert(1, 'a');
        System.out.println(sb);

        // Delete the extra 'a'
        sb.delete(1, 2);
        System.out.println(sb);
    }
}

