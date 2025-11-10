import java.util.Scanner;

public class check_if_array_is_sorted_or_not {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("element is:");
        for (i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        checkarray(arr);
    }
    public static void checkarray(int[] arr) {
        int i;
        boolean sorted=true;
        for (i = 0; i < arr.length-1; i++) {
          if(arr[i]>arr[i+1]   ){
              sorted=false;
              break;
          }
        }if (sorted){
            System.out.println("array sorted");
        }else {
            System.out.println("array not sorted ");
        }
    }
}
