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
    
Here is the output of these algos:

1.

![Bubble sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/9f49fa76-191b-4194-a71c-c7d83edc6511)

2.

![Insertion sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/bf80a79a-3b24-4f4f-93d0-a8b4b0cf6fd8)

3.

![Selection sort](https://github.com/rathodlucky12/Soritng-Algorithms-Java/assets/131651450/77777c74-3c24-4b4c-8258-f060d0f4644d)
