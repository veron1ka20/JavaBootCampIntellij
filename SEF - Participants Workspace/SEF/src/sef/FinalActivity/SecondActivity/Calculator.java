package SecondActivity;

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
    }
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int sub(int a, int b){
        int diff = 0;
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
        return diff;
    }
    public int multi(int a, int b) {
        int multi = a * b;
        return multi;
    }
    public double div(int a, int b) {
        int divVal = 0;
        if (a == 0 || b == 0){
            divVal = 0;
        } else {
            divVal = a / b;
        }
        return divVal;
        }

}
