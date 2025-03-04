public class quest4 {
    // Method to swap two integers
    public void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Using a temporary variable to swap the values
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Create an object of SwapIntegers
        quest4 swapIntegers = new quest4();

        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;

        // Call the swap method
        swapIntegers.swap(a, b);
    }
}
