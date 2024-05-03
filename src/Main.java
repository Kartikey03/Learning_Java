// Java program to check whether an element is pr
import java.util.Arrays;
class GFG {
    // Function return true if given element
    // found in array
    private static void check(String[] arr, String toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using contains() method
        boolean test = Arrays.asList(arr).contains(toCheckValue);
        // Print the result
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }
    public static void main(String[] args){
        // Get the array
        String[] array = new String[192];
        int i;
        for (i = 1; i <= 191; i++) {
            array[i] = String.format("%03d", i); // Storing even numbers, you can change this to any sequence you want
        }
        // Get the value to be checked
        String toCheckValue = "190";
        // Print the array
        System.out.println("Array: " + Arrays.toString(array));
        // Check if this value is
        // present in the array or not
        check(array, toCheckValue);
    }
}