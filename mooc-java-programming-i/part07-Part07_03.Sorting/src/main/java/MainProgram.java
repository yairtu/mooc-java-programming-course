
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int indexOfSmallest = startIndex;

        if (indexOfSmallest < 0 || indexOfSmallest > array.length - 1) {
            return 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int valueThatWasIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = valueThatWasIndex1;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        
        while(index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            index++;
        }
    }

}
