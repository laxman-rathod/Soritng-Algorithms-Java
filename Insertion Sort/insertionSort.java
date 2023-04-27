//Insertion sort
import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,size,temp;
        System.out.print("Enter the size of an array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the array elements : ");
        for(i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(i=1;i<size;i++) {
            temp=arr[i];
            for(j=i-1;j>=0&&arr[j]>temp;j--) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        System.out.print("Sorted elements are : ");
        for(i = 0; i < size; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}