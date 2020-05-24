// Raja Hammad Mehmood.
// This program shows the calls made in Towers Of Hanoi.
// This program is a modification of TowersOfHanoi and it shows how many moves were made
// while moving the disks.
import java.util.Scanner;

/**
 * This program lists the steps in the solution of the TowersOfHanoi problem.
 * The number of disks to be moved is specified by the user. Warning: The number
 * of moves grows very quickly with the number of disks!
 */
public class Question1 {
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N; // The number of disks in the original stack,
				// as specified by the user.
		System.out.println("How many disks are to be moved from Stack 0 to Stack 1?");
		System.out.print("? ");
		N = in.nextInt();
		System.out.println();
		System.out.println();
		towersOfHanoi(N, 0, 1, 2); // Print the solution.
		//System.out.println("Total moves were " + printCount());
	}

	/**
	 * Solve the problem of moving the number of disks specified by the first
	 * parameter from the stack specified by the second parameter to the stack
	 * specified by the third parameter. The stack specified by the fourth parameter
	 * is available for use as a spare. Stacks are specified by number: 0, 1, or 2.
	 */
	public static void towersOfHanoi(int disks, int from, int to, int spare) {
		
		
		if (disks == 1) {
			System.out.println("towersOfHanoi(" + (disks) + ", " + from + ", " +to+", "+spare+")");
		} else {
			
			System.out.println("towersOfHanoi("+(disks)+", "+from+", "+to+", "+spare+")");
			towersOfHanoi(disks - 1, from, spare, to);
			
			
			towersOfHanoi(disks - 1, spare, to, from);
			
		}
	}

	
}
