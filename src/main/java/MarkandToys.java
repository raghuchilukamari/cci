import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkandToys {

    public static void main(String[] args) {

        int[] prices = {1,2,3,4};
        int k = 7;

        List<int[]> l = new ArrayList<int[]>();

        for(int i=0;i<prices.length-1;i++){
            int sum = prices[i];

            for (int j = i+1; j < prices.length; j++) {
                 sum = sum + prices[j];
                 if(sum == k) {

                    l.add(Arrays.copyOfRange(prices,i,j+1));

                 }


            }

        }

        for (int[] a: l
             )
            for (int i: a
                 )
                System.out.println(i);


    }
}
