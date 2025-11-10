import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class common_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array1:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: " + (i + 1));
            arr[i] = input.nextInt();
        }System.out.print("enter the element of array2:");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (i = 0; i < arr2.length; i++) {
            System.out.println("enter the element: " + (i + 1));
            arr2[i] = input.nextInt();
        }
        System.out.print("element is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("element is:");
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        common_element obj = new common_element();
        ArrayList<Integer> result = obj.common(arr, arr2);
        if(result.isEmpty()){
            System.out.println("no common element:");
        }else {
            for (int ele:result){
                System.out.print(ele+" ");
            }
        }
    }
    public static ArrayList<Integer> common(int[] arr1,int[] arr2){
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i<arr1.length && j< arr2.length){
            if(arr1[i]==arr2[j]){
ans.add(arr1[i]);
i++;
j++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            } else if (arr1[i]<arr2[j]) {
             i++;
            }
        } return ans;
    }
}
