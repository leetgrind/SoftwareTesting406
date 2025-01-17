public class Main {

    public static void main(String[] args) {
        int c = 10;
        int d = 10;

        int e = divide(c, d);

        System.out.println(e);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        int answer = a / b;
        return answer;
    }

}