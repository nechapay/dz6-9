import java.util.Scanner;
    /*
    Напишите функцию, которая принимает число N и рекурсивно вычисляет число на позиции N
    в последовательсности Фибоначчи. Последовательность
    Фибоначчи - это последовательность чисел 0, 1, 1, 2, 3, 5, 8, 13, 21...,
    где каждое следующее число равно сумме двух предыдущих. *
     */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = sc.nextInt();
        System.out.println("Fibonacci in position " + N + " is " + fibonacci(N));
    }
    // fibonacci 1 is 0, 2 is 1 etc
    public static int fibonacci(int n) {
        return loop(n - 1, 0, 1);
    }

    public static int loop (int i, int a, int b) {
        if(i == 0) {
            return a;
        }
        return loop(i - 1, b, a + b);
    }
}
