public class arrays {
    public static void main(String[] args) {
        // Define the size of the array
        int size = 150;

// Create the array
        String[] numbersArray = new String[size];

// Populate the array using a for loop
        for (int i = 1; i < size; i++) {
            // Format the number with leading zeros using String.format
            numbersArray[i] = String.format("%03d", i); // Storing even numbers in "001" format
        }

// Fetching numbers from the array and printing them
        System.out.println("Numbers stored in the array:");
        for (int i = 1; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbersArray[i]);
        }


    }
}
