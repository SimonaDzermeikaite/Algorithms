package factorial;

public class Main {
    public static void main(String[] args){
        int n = 7;
        int output = factorial(n);

        System.out.println(output);
    }
    public static int factorial(int input){
        if(input == 1){
            return 1;
        }
        int result = input * factorial(input - 1);
        return result;
    }

}
