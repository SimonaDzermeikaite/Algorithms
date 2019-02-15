package comparingAlgorithms;

public class Main {

    public static void main(String args[]) {
        int[] testArr = new int[1000];
        for (int i = 0; i < testArr.length; i++) {
            int number = (int) (Math.random() * 500 + 1);
            double sum = 0;

            for(int m = 0; m <testArr.length; m++){
                sum = sum + testArr[i];
            }

            //rearrange array - pasitvarkyti pagal pavyzdi;

        }

        for (int n = 0; n <= 10; n++) {
            long startTimeMerge = System.nanoTime();
            mergeSort(testArr);
            long endTimeMerge = System.nanoTime();
            System.out.println("The mergeSort(arr) took: " + (endTimeMerge - startTimeMerge) + "ns");
            for (int i = 0; i < testArr.length; i++) {
                System.out.print(testArr[i] + " ");
            }
        }


        }

        static void mergeSort(int[] arr){
            int aLen = arr.length;
            if (aLen < 2) {
                return;
            }

            int mid = aLen / 2;
            int[] left = new int[mid];
            int[] right = new int[aLen - mid];

            for (int i = 0; i <= mid - 1; i++)
                left[i] = arr[i];

            for (int i = mid; i <= aLen - 1; i++)
                right[i - mid] = arr[i];

            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }

        static void merge ( int[] origArr, int[] arrL, int[] arrR){
            int sizeLeft = arrL.length;
            int sizeRight = arrR.length;
            int i = 0, j = 0, k = 0;
            while (i < sizeLeft && j < sizeRight) {
                if (arrL[i] <= arrR[j]) {
                    origArr[k] = arrL[i];
                    i++;
                } else {
                    origArr[k] = arrR[j];
                    j++;
                }
                k++;
            }
            while (i < sizeLeft) {
                origArr[k] = arrL[i];
                i++;
                k++;
            }
            while (j < sizeRight) {
                origArr[k] = arrR[j];
                j++;
                k++;
            }
        }



}