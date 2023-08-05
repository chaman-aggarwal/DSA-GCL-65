import java.util.Scanner;

class ReverseArray{  

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        } 
    }  
}  