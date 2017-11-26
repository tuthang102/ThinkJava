public class IndexOfMax {
    public static void main (String [] args) {
        int[] array = {1,2,3,4,3,5,0,3};
        System.out.println(indexOfMax(array));
        System.out.println(indexOfMaxEnhancedLoop(array));
    }
    public static int indexOfMax (int[] array) {
        int point = array[0];
        int result = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] <= point) {
                result = i;
            }
        }
        return result;
    }

    public static int indexOfMaxEnhancedLoop( int [] array) {
        int point = array[0];
        int result = 0;
        int i = 0;
        for (int value : array) {
            if (value <= point) {
                result = i;
            }
            i= i + 1;
        }
        return result;
    }
}
