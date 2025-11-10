import java.util.Scanner;

public class selection_sort {
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
        selection(arr);
    }
    public static void selection(int[] arr){
        int i,j;
        int n= arr.length;
        for ( i = 0; i < n; i++) {
int minimum=i;
for (j=i+1;j<n;j++){
    if(arr[j]<arr[minimum]){
        minimum=j;
    }
}if(minimum!=i){
    int temp=arr[i];
    arr[i]=arr[minimum];
    arr[minimum]=temp;
            }
        }
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
