import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Моделироание ошибки «NullPointerException»
        try {
            String str = null;
            if (str.length() == 2) {
                System.out.println("Ok");
            }
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException!!!");
        }

        // Моделироание ошибки «ArrayIndexOutOfBoundsException»
        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException!!!");
        }

        // Моделирование своего варианта ошибки через оператор throw
        try {
            throw new Exception();

        } catch (Exception ex) {
            System.out.println("Exception!!!");
        }
    }
}
