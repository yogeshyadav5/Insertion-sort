# Insertion-sort

* Question is that What is Insertion Sort ?
Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

* Time Complexity:

In worst case,each element is compared with all the other elements in the sorted array. For  elements, there will be  comparisons. Therefore, the time complexity is O(n^2).

* characteristics of Insertion Sort:

1. It is efficient for smaller data sets, but very inefficient for larger lists.
2. Insertion Sort is adaptive, that means it reduces its total number of steps if a partially sorted array is provided as input, making it efficient.
3. It is better than Selection Sort and Bubble Sort algorithms.
4. Its space complexity is less. Like bubble Sort, insertion sort also requires a single additional memory space.
5. It is a stable sorting technique, as it does not change the relative order of elements which are equal.


* How Insertion Sort Works?

STEPS ARE :-

1. We start by making the second element of the given array, i.e. element at index 1, the key. The key element here is the new card that we need to add to our existing sorted set of cards(remember the example with cards above).
2. We compare the key element with the element(s) before it, in this case, element at index 0:
3. If the key element is less than the first element, we insert the key element before the first element.
4. If the key element is greater than the first element, then we insert it after the first element.
5. Then, we make the third element of the array as key and will compare it with elements to it's left and insert it at the right position.
6. And we go on repeating this, until the array is sorted.
