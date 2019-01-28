package minmax;

public class Main {
    public static void main(String[] args){
        int[] input = {1, -99, 6, -101, 48, 0, -3, -11, 3, 99};
        int lowestNumber = min(input);
        System.out.println("The lowest number is " + lowestNumber);

        int biggestNumber = max(input);
        System.out.println("The biggest number is " + biggestNumber);
    }

    public static int min(int[] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];

            }
        }
        return temp;
    }

    public static int max(int[] arr){
        int biggest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(biggest < arr[i]){
                biggest = arr[i];
            }
        }
        return biggest;
    }

}
