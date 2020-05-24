import java.util.Arrays;

// Raja Hammad Mehmood.
// This program sorts a list using insertion sort and shows the list while it is being processed.
public class Question3 {

	public static void main(String[] args) {
		int[] list = new int[] { 7, 6, 10, 68, 4, 2, 1, 3 };// unsorted list
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(list));
		System.out.println();
		System.out.println();
		System.out.print("While Sorting:");
		System.out.println();
		insertionSort(list);
		System.out.println();
		System.out.println();
		System.out.print("After Sorting:");
		System.out.println();
		System.out.println(Arrays.toString(list));

	}

	/**
	 * Sorts the list using insertion sort
	 * 
	 * @param 1 is the unsorted list
	 */
	public static void insertionSort(int[] A) {
		// Sort the array A into increasing order.
		int itemsSorted; // Number of items that have been sorted so far.
		for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
			// Assume that items A[0], A[1], ... A[itemsSorted-1]
			// have already been sorted. Insert A[itemsSorted]
			// into the sorted part of the list.
			int temp = A[itemsSorted]; // The item to be inserted.
			int loc = itemsSorted - 1; // Start at end of list.
			while (loc >= 0 && A[loc] > temp) {
				A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
				loc = loc - 1; // Go on to next location.
			}
			A[loc + 1] = temp; // Put temp in last vacated space.
			System.out.println(Arrays.toString(A));
		}

	}

}
