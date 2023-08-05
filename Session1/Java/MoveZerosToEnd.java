import java.util.Scanner;

class MoveZerosToEnd{  

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeros(int arr[])
    {
        int n = arr.length;
        int j=0; // index of non-zero element

        for(int i=0; i<n; i++) {
            if(arr[i]!=0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        } 
    }  
}  