import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int i=start, j=mid+1, k=0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for(int itr=0; itr<k; itr++) {
            arr[start+itr] = temp[itr];
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // 1. divide
        int mid = start + (end - start) / 2;

        // 2. recursively sort
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // 3. merge
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}