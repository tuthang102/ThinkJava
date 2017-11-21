public class CheckFermat {
    public static void checkFermat(int a , int b, int c, int n) {
        int left = (int) Math.pow(a,n) + (int) Math.pow(b,n);
        int right = (int) Math.pow(c,n);
        if (left==right && n >2) {
            System.out.println("Holy smoke! Fermat was wrong");
        }
        else {
            System.out.println("That doesn't work");
        }
    }
    public static void main(String [] args) {
        checkFermat(2,3,4,4);
    }
}
