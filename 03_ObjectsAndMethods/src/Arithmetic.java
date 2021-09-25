public class Arithmetic {
    int a;
    int b;

    public void InitialData (int firstInt, int secInt){
        a = firstInt;
        b = secInt;
    }

    public int getSum () {
        int sum = a + b;
        return sum;
    }

    public int getMultiplication () {
        int multiplication = a * b;
        return multiplication;
    }

    public int getMax () {
        if (a >= b) {
            return a;
        } else
            return b;
    }

    public int getMin () {
        if (a <= b) {
            return a;
        } else
            return b;
    }
}
