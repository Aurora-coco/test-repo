import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 简单计算器 ===");
        System.out.print("请输入第一个数字: ");
        double a = scanner.nextDouble();

        System.out.print("请输入运算符 (+ - * /): ");
        String op = scanner.next();

        System.out.print("请输入第二个数字: ");
        double b = scanner.nextDouble();

        double result;
        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) {
                    System.out.println("错误: 除数不能为零");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("错误: 不支持的运算符");
                return;
        }

        System.out.println(a + " " + op + " " + b + " = " + result);
        scanner.close();
    }
}
