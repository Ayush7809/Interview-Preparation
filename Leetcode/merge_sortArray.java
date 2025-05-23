import java.util.*;

public class merge_sortArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int m = S.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = S.nextInt();
        }
        int[] mergedArray = mergeSortedArrays(n,arr,m, arr1);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
    public static int [] mergeSortedArrays(int n, int [] arr, int m, int [] arr1){
        int [] arr2 = new int [n + m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(arr[i]<arr1[j]){
                arr2[k++] = arr[i++];
            }
            else{
                arr2[k++] = arr1[j++];
            }
        }
        while(i<n){
            arr2[k++] = arr[i++];
        }
        while(j<m){
            arr2[k++] = arr1[j++];
        }
        return arr2;
    }
}