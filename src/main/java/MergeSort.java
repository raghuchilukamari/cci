import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] a){

        if(a.length < 2) {
            return ;
        }

        int size = a.length;
        int split_index = size/2;

        int[] l_arr =Arrays.copyOfRange(a,0,split_index);
        int[] r_arr =Arrays.copyOfRange(a, split_index,size);

        mergeSort(l_arr);
        mergeSort(r_arr);

        merge(l_arr,r_arr,a);

    }

    public void merge(int[] l_arr, int[] r_arr, int[] a){

        int i = 0; int j = 0; int k = 0;

        while ( i < l_arr.length && j < r_arr.length){
            if (l_arr[i] <= r_arr[j]) {
                a[k] = l_arr[i];
                i++;
            }
            else {
                a[k] = r_arr[j];
                j++;
            }
            k++;
        }

        while (i < l_arr.length){
            a[k] = l_arr[i];
            i++;
            k++;
        }

        while (j < r_arr.length){
            a[k] = r_arr[j];
            j++;
            k++;
        }

    }


    public static void main(String[] args) {

        MergeSort sort = new MergeSort();
        //int a[] = {18,36,1,293,3,93};
        int[] a = {12,5,11,2,8,30,16,7,38};
        sort.mergeSort(a);

        for (int i: a
        )
            System.out.print(i + " ");
        System.out.println();

    }

}
