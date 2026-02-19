import java.util.*;
public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("King");
        System.out.println(sb);
    
    //char at index 0
    System.out.println(sb.charAt(0));
    //Set char at index 0 
    sb.setCharAt(0,'S');
    System.out.println(sb);
    }
}
