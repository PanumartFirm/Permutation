import java.util.*;

public class Permutations {

	public static void main (String args[]) {
        Scanner kb = new Scanner (System.in);
		// Check usage
        String word = "MAN";
        String str ; 
		if (word.length() < 1) {
			System.out.println("Usage: java Permutations [word]");
			
			return;
		}         
		// Get word		     		
		// Create empty indices ArrayList
		ArrayList<Integer> indices = new ArrayList<Integer>();

		// Get the permutations
		ArrayList<String> permutations = Permutations.getPermutations(word, indices);

		// Display the permutations
		System.out.println(permutations);

		return;
	}

	// Takes a word and an ArrayList of already considered indices
	// Input: word (String), indices (ArrayList<Integer>)
	// Output: ArrayList<String> containing all possible permutations
	public static ArrayList<String> getPermutations (String word, ArrayList<Integer> indices) {

		int length = word.length();

		// Create the empty ArrayList to return
		ArrayList<String> toReturn = new ArrayList<String>();
        
		
		// If all characters are considered, we are done. Return empty ArrayList
		if (indices.size() == length) {
			toReturn.add("");
			return toReturn;
		}

		// Iterate over each character to find the permutation
		for (int i = 0; i < length; i++) {

			// Skip if index is already considered
			if (indices.contains(i)) {
				//System.out.println(i);
				continue;
			}
                          
			// Create and populate a duplicate ArrayList of indices that have already been considered
			ArrayList<Integer> newIndices = new ArrayList<Integer>();
			for (int index : indices) {
				newIndices.add(index);
			}

			// Add current index
			newIndices.add(i);
	
			// Calculate permutations
			ArrayList<String> permutations = Permutations.getPermutations(word, newIndices);

			// Add the current character before the permutations of the rest of the word
			for (String str : permutations) {
				System.out.println(word.charAt(i) +" "+ str+" "+i);
				toReturn.add(word.charAt(i) + str);
			}

		}

		// Return
		return toReturn;

	}

}