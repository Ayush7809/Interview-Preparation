package Arrays;
import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefixSum[i] + " ");
        }
    }
}
