# Simple soritng Algorithms 

Basically these are the some basic sorting algorithms, for sorting larger datasets, more advanced sorting algorithms like QuickSort, MergeSort, or TimSort are preferred due to their better performance. These basic sorting algorithms (Bubble Sort, Selection Sort, Insertion Sort) are useful for learning and teaching sorting concepts but are rarely used in production code when efficiency is a concern.

1. **Bubble Sort**:
   - **Usage**: Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the entire list is sorted.
   - **Applications**: Bubble Sort is rarely used in practice because it's not very efficient. It's mainly used for educational purposes or for sorting small lists.
   - **Advantages**:
     - Easy to understand and implement.
     - Requires minimal additional memory.
   - **Disadvantages**:
     - Inefficient for large lists, as it has a time complexity of O(n^2).
     - Not suitable for real-world applications with large datasets.

2. **Selection Sort**:
   - **Usage**: Selection Sort is another simple sorting algorithm that divides the input list into two parts: the sorted part and the unsorted part. It repeatedly selects the minimum element from the unsorted part and moves it to the sorted part.
   - **Applications**: Similar to Bubble Sort, Selection Sort is primarily used for educational purposes. It's not efficient for larger datasets.
   - **Advantages**:
     - Easy to implement.
     - Performs fewer swaps compared to Bubble Sort.
   - **Disadvantages**:
     - Inefficient for large datasets (O(n^2)).
     - Not suitable for real-world applications with extensive data.

3. **Insertion Sort**:
   - **Usage**: Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It takes an element from the unsorted part and inserts it into its correct position in the sorted part.
   - **Applications**: Insertion Sort can be practical for small datasets or when the input is mostly sorted, as it performs well in those scenarios.
   - **Advantages**:
     - Efficient for small lists or nearly sorted data.
     - Simple to implement and understand.
   - **Disadvantages**:
     - Inefficient for large datasets (O(n^2)).
     - Quicksort or Mergesort are usually better choices for larger datasets.

- Here is the output of these algos:

  1. Bubble sort:
 
 ![Bubble sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/889bdacb-2437-4325-9fdd-a29061585810)
 
  2.

 ![Selection sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/cae7ad9a-ac3c-4336-81fc-10cee7e35475)
 
3.

![Insertion sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/96de67fa-4ea5-4aee-a6c1-470684e99523)
