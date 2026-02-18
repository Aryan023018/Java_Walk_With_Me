import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();   // input string
        String name1 = "";             // result string

        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'e') {
                name1 += 'i';
            } else {
                name1 += name.charAt(i);
            }
        }

        System.out.println(name1);
    }
}
