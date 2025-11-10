import java.util.ArrayList;
import java.util.Scanner;

public class union_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of array1:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: " + (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.print("enter the element of array2:");
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
        union_element obj=new union_element();
        ArrayList<Integer> result=obj.union(arr,arr2);
        System.out.print("union element is: ");
        for (int ele:result){
            System.out.print(ele+" ");
        }
    }
    public static ArrayList<Integer> union(int[] a,int[] b){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<a.length;i++){
            if(!ans.contains(a[i])){
                ans.add(a[i]);
            }
        }
        for (int i=0;i<b.length;i++){
            if(!ans.contains(b[i])){
                ans.add(b[i]);
            }
        } return ans;
    }
}
