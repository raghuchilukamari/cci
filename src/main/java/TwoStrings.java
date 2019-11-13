import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {

        String b = "Hi";
        String c = "Hello";


        int step = 1;
        int substring_count = 0;

        while (step <= b.length() && step <= c.length()) {
            for (int begin_index = 0; begin_index < b.length(); begin_index++) {
                if (begin_index + step <= b.length()) {
                    System.out.println(b.substring(begin_index, begin_index + step));
                    substring_count = c.contains(b.substring(begin_index, begin_index + step)) ? substring_count + 1 : substring_count;

                }
            }
            step++;
        }

        System.out.println(substring_count);

    }
}


