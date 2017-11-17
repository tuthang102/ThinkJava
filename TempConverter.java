import java.util.Scanner;
public class TempConverter {
    public static void main(String [] args){
        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        celsius = in.nextDouble();
        fahrenheit = celsius*(9.0/5.0) + 32;
        System.out.print(celsius + " C = " + fahrenheit + " F" );
    }
}
