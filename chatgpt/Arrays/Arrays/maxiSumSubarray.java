package Arrays;

import java.util.Scanner;

public class maxiSumSubarray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int max =arr[0];
        int sum =0;
        for(int i=0;i<n;i++){
            sum = Math.max(arr[i], sum+arr[i]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}