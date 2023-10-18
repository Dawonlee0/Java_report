package _6_메소드와유효범위;
import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n) {
        if (m == 0) {
            return m;
        }
        if (n == 0) {
            return n;
        }
        while (n != m) {
            if (m > n) {
                m = m - n;
            }
            else if (m < n) {
                n = n - m;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        System.out.println("두 수를 입력 하세요");
        Scanner sc = new Scanner(System.in);

        Homework4 hw = new Homework4();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int m = hw.gcd(num1, num2);

        System.out.println("두 수의 최대 공약수는 "+ m +" 입니다.");

    }
}
