package Arrays;
import java.util.*;
public class moveZeroEnd{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                arr[j++] = arr[i];
        }
        while(j<n){
            arr[j++] = 0;
        }
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}