import java.util.Scanner;

public class Remove_element {

    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        int val = S.nextInt();
        int result = removeElement(arr, val);
        System.out.println(result);
    }
public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}