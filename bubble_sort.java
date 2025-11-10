import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: "+(i+1));
            arr[i] = input.nextInt();
        }
        System.out.print("element is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr);
    }
    public static void bubblesort(int[] arr){
        int i,j;

        int n= arr.length;
        for (i=0;i< n-1;i++){
            boolean issorted=true;
//            for (int k= 0; k< n-1; k++) {
//                if(arr[k]>arr[k+1]   ){
//                    issorted=false;
//                    break;
//                }
            for (j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    issorted=false;
                }
                }
            if (issorted==true){
                break;
            }
        }
        System.out.print("element is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
