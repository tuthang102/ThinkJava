public class MyExp {
    public static void main(String [] args) {
        check(1);
    }


    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        else {
            int re = n*factorial(n-1);
            return re;
        }
    }


    public static double myexp(double x, int n) {
        double result = 1;
        int i = 1;
        while (i <= n) {
            result = result + Math.pow(x,i)/factorial(i);
            i = i + 1;
        }
        return result;
    }


    public static double myexp2(double x, int n) {
        double result = 1;
        int i = 1;
        double term = 1;
        while (i <= n) {
            term = term*(x/i);
            result = result + term;
            i = i + 1;
        }
        return result;
    }


    public static void check(double x){
        System.out.println(x + "\t" + myexp(x,10) + "\t" + Math.exp(x));
    }
}

