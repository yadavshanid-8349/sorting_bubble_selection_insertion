import java.util.Scanner;

public class move_0_end_and_sort {

    public static void printarray(int[] arr){
        int i;
        System.out.print("element is: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int countzero(int[] arr){
        int i, c = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("enter the element: " + (i + 1) + " → ");
            arr[i] = input.nextInt();
        }

        // 👇 Function calls in correct order
        System.out.println();
        printarray(arr);  // 1️⃣ array print
        System.out.println();

        System.out.println("Total zeros = " + countzero(arr)); // 2️⃣ zero count
        System.out.println();

        bubblesort(arr); // 3️⃣ sort and move zero
        printarray(arr); // 4️⃣ final array print
    }

    public static void reverse(int[] arr){
        int i = 0, j = arr.length - countzero(arr) - 1; // last non-zero element tak
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void bubblesort(int[] arr){
        int i, j;
        int n = arr.length;
        for (i = 0; i < n - 1; i++){
            boolean issorted = true;
            for (j = 0; j < n - 1 - i; j++){
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    issorted = false;
                }
            }
            if (issorted){
                break;
            }
        }
        reverse(arr); // ✅ function call inside bubblesort
    }
}
