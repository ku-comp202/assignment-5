package code;

import given.AbstractArraySort;

/*
 * Implement the tim-sort algorithm here. You can look at the slides for the pseudo-codes.
 * Make sure to use the swap and compare functions given in the AbstractArraySort!
 * 
 * 
 */

public class TimSort<K extends Comparable<K>> extends AbstractArraySort<K> {

  // Add any fields here

  static int MIN_MERGE = 32;

  public TimSort() {
    name = "Timsort";

    // Initialize anything else here
  }

  @Override
  public void sort(K[] inputArray) {
    // TODO: Implement the tim-sort algorithm [ascending order]

    // Suggested implementation [See the pdf for more details]]:
    // 1. Sort individual subarrays of size MIN_MERGE (using insertion sort)
    // 2.1 Start merging from size MIN_MERGE (using merge function)
    // 2.2 Double the size on each iteration

  }

  // Public since we are going to check its output!
  public void merge(K[] inputArray, int lo, int mid, int hi) {
    // TODO: Implement the merging algorithm. Same as the 'merge' of Merge Sort.

  }

  // It's just the insertion sort we know but with the lo and hi parameters as an
  // extra. (Recommended for the implementation)

  // TODO: Implement the insertion sort algorithm. You can use your implementation
  // from InsertionSort.java.
  protected void insertionSort(K[] inputArray, int lo, int hi) {

  }

  // Feel free to add more methods

}
