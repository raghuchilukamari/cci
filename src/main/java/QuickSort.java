
import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] a, int low, int pivot_idx){

        if (pivot_idx <= low){
            return;
        }

        int pi = partition(a,pivot_idx);

        quickSort(a,0,pi-1);
        quickSort(a,pi+1,pivot_idx);

    }

    static int partition(int[] a, int pivot_idx){

        int i=0;
        while (i < pivot_idx){

            if (a[i] < a[pivot_idx])
                i++;
            else {
                int temp = a[i];
                a[i] = a[pivot_idx-1];
                a[pivot_idx-1] = a[pivot_idx];
                a[pivot_idx] = temp;
                pivot_idx = pivot_idx-1;
            }
        }

        return pivot_idx;

    }

    public static void main(String[] args) {

        //int[] a = {18,36,1,293,3,93};
        int[] b = {12,5,11,2,8,30,16,7,38};

        int pivot_idx = b.length-1;
        quickSort(b,0,pivot_idx);

        for (int j : b
             ) {
            System.out.print(j + " ");
        }








    }


}
