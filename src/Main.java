import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] intArray = new int[10];

        // Generating random int array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-255,255);
        }

        // Sorting array with selection sort algorithm
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }

        // Printing Array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


    // Swap method for selection sort
    public static void swap (int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}