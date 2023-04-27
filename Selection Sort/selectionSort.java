//Selection sort
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,size,temp;
        System.out.print("Enter the size of an array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the array elements : ");
        for(i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(i = 1; i < size - 1; i++) {
            k = i;
            for(j = i + 1; j < size; j++) {
               if(arr[j]< arr[k]) {
                k = j;
               } 
               if(i != k) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.print("Sorted elements are : ");
        for(i = 0; i < size; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}