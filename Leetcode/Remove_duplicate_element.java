import java.util.Scanner;

public class Remove_duplicate_element {

    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int [] result = removeDuplicates(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] removeDuplicates(int [] nums){
        int n = nums.length;
        int [] b = new int[n];
        return b;
    }
}