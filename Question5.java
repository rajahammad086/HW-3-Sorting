// Raja Hammad Mehmood
// Quicksort implementation from Intro. to Programming in Java by David Eck.
// This program made some modifications to the Quicksort program to show the list while it is being sorted.
import java.util.*; // Required for Arrays class
public class Question5 {
    public static void main(String[] args) {
        int[] array = {3, 9, 2, 8, 1, 7, 5, 4, 6}; // Initialize array
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorting....");
        quicksort(array, 0, array.length - 1);
       
    }
    /**
    * Apply QuicksortStep to the list of items in locations lo through hi
    * in the array A. The value returned by this routine is the final
    * position of the pivot item in the array.
    */
    static int quicksortStep(int[] A, int lo, int hi) {
        int pivot = A[lo]; // Get the pivot value.
        // The numbers hi and lo mark the endpoints of a range
        // of numbers that have not yet been tested. Decrease hi
        // and increase lo until they become equal, moving numbers
        // bigger than pivot so that they lie above hi and moving
        // numbers less than the pivot so that they lie below lo.
        // When we begin, A[lo] is an available space, since its
        // value has been moved into the local variable, pivot.
        while (hi > lo) {
            // Loop invariant (See Subsection Subsection 8.2.3): A[i] <= pivot
            // for i < lo, and A[i] >= pivot for i > hi.
            while (hi > lo && A[hi] >= pivot) {
                // Move hi down past numbers greater than pivot.
                // These numbers do not have to be moved.
                hi--;
            }
            if (hi == lo)
                break;
            // The number A[hi] is less than pivot. Move it into
            // the available space at A[lo], leaving an available
            // space at A[hi].
            A[lo] = A[hi];
            lo++;
            while (hi > lo && A[lo] <= pivot) {
                // Move lo up past numbers less than pivot.
                // These numbers do not have to be moved.
				lo++;
            }
            if (hi == lo)
                break;
            // The number A[lo] is greater than pivot. Move it into
            // the available space at A[hi], leaving an available
            // space at A[lo].
            A[hi] = A[lo];
            hi--;
        } // end while
        // At this point, lo has become equal to hi, and there is
        // an available space at that position. This position lies
        // between numbers less than pivot and numbers greater than
        // pivot. Put pivot in this space and return its location.
        A[lo] = pivot;
        return lo;
    } // end QuicksortStep
    /**
    * Apply quicksort to put the array elements between
    * position lo and position hi into increasing order.
    */
    static void quicksort(int[] A, int lo, int hi) {
        if (hi <= lo) {
            // The list has length one or zero. Nothing needs
            // to be done, so just return from the subroutine.
            return;
        }
        else {
            // Apply quicksortStep and get the new pivot position.
            // Then apply quicksort to sort the items that
            // precede the pivot and the items that follow it.
            int pivotPosition = quicksortStep(A, lo, hi);
            System.out.println("After quicksortStep("+"A,"+" "+lo+", "+hi+"): "+Arrays.toString(A));// shows each and every step while we do the quick sort.
            quicksort(A, lo, pivotPosition - 1);
            quicksort(A, pivotPosition + 1, hi);
        }
    }
}