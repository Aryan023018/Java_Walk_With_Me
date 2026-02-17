# cumulative-string-length-java
import java.util.*;

public class Strings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Take size
        int size = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Create array
        String[] arr = new String[size];

        // Take array input
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        // Take one separate string
        String single = sc.nextLine();

        // Calculate total length
        int totalLength = 0;

        // Add array strings length
        for(int i = 0; i < size; i++) {
            totalLength += arr[i].length();
        }

        // Add single string length
        totalLength += single.length();

        // Print result
        System.out.println("Cumulative Length = " + totalLength);
    }
}
