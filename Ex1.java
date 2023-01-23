import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Number(i));
        System.out.printf("N!: %d\n", Number_1(i));
        iScanner.close();
    }
    public static int Number(int a) {
        return (a * (a + 1)) / 2;
    }
    public static int Number_1(int a) {
        int result = 1;
        for ( int i = 1; i <= a; i++ ) {
            result *= i;
        }
        return result;
    }
}

