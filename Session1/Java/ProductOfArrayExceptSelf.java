import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] arr, int n) {
        int[] ans = new int[n];
        ans[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i];
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 1; i--) {
            ans[i] = ans[i - 1] * rightProduct;
            rightProduct *= arr[i];
        }
        ans[0] = rightProduct;
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = productExceptSelf(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}

