

public class Largest {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {12, 45, 67, 89, 34, 23};

        // Find the largest number
        int largest = findLargest(numbers);

        // Output the largest number
        System.out.println("The largest number in the array is: " + largest);
    }

    // Method to find the largest number in an array
    public static int findLargest(int[] arr) {
        int largest = arr[0]; // Assume the first element is the largest

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update the largest number
            }
        }

        return largest;
    }
}

