import java.util.Arrays;

public class BinarySearch {

    static boolean binarySearch(int[] a,int search, int low, int high){

        boolean res = false;

        int mid = (low + high)/2;

        if(search == a[mid]) {
            res = true;
        } else if (search < a[mid] && mid > 0){
            res = binarySearch(a,search,low,mid-1);
            } else if (search > a[mid] && mid < high) {
             res = binarySearch(a,search,mid+1,high);
        }
        return res;
    }

    public static void main(String[] args) {

        int a[] = {4,5,6,7,8,9};
        boolean res = binarySearch(a,9,0,a.length-1);

        System.out.println(res);

    }


}
