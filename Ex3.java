import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scan.next();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        int result = 0;
        switch (operations) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
        }
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        scan.close();
    }
}
