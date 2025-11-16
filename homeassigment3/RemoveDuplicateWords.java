package week2.homeassigment3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

        String[] words = text.split(" ");
        int count;

        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {

                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {

                    words[j] = "";  // Replace duplicate
                    count++;
                }
            }

            // We only print after scanning all duplicates for the word at index i
            if (count > 1) {
                // Do nothing (just means duplicates were found)
            }
        }

        // Print final result
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

	}


