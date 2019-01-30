package fibonacci;

public class Main {
    public static void main(String[] args){
        int n = 40;
        int output = fibonacci(n);
        System.out.println(output);
    }
    public static int fibonacci(int input){
        if(input <= 1) {
            return 1;
        }

        int result = fibonacci(input -1) + fibonacci(input - 2);
        return result;
    }

}
