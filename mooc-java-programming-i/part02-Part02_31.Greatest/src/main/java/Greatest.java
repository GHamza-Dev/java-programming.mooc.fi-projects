
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int g = number1;

        if (number2 > number1 && number2 > number3) {
            g = number2;
        } else if (number3 > number1) {
            g = number3;
        }
        return g;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
