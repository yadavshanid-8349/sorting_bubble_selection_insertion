import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: " + (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.print("element is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion(arr);
    }
    public static void insertion(int[] arr){
        int i;
        for (i=1;i< arr.length;i++){
            int j=i-1;
            int k=arr[i];
            while (j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        } for (i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
