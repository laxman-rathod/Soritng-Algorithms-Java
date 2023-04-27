//Bubble sort
import java.util.*;
public class bubbleSort {
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
        for(i = 0; i < size; i++) {
            for(j = 0; j < size - 1; j++) {
               if(arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
               } 
            }
        }
        System.out.print("Sorted elements are : ");
        for(i = 0; i < size; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}