package bubbleSort;

public class Main {

    public static void main(String[] args) {
        int[] input = {67, 5, 8, -7, 99};
        printArray(input);
        sorttArray(input);
        printArray(input);
    }

    public static void printArray(int[] arrayToPrint){
        for(int i = 0; i < arrayToPrint.length; i++){
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }

    public static void sorttArray(int[] arrayToSort){
        for(int i = 0; i <= arrayToSort.length -1; i++){
            for(int j = arrayToSort.length - 1; j >= i + 1; j--){
                if(arrayToSort[j] < arrayToSort[j - 1]){
                    swapArrayElements(arrayToSort, j, j - 1);
                }
            }
        }
    }

    public static void swapArrayElements(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
