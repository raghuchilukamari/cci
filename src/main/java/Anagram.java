import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {

        String a = "iceman";
        String b = "cinema";

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if(String.valueOf(a1).equals(String.valueOf(b1))) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }

    }
}
