package allDublicates;

public class Main {
    public static void main(String[] args){
        int[] arr = {4, 7, 4, 4, 7};
        int[] dublicates = new int[arr.length];


        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    if(i != j){
                        System.out.println(arr[i]);

                    }
                }
            }
        }
    }

}
