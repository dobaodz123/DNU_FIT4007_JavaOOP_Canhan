import java.util.Scanner;

public class Main {

    // Phương thức tính UCLN của 2 số nguyên dương
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int x = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int y = sc.nextInt();
        System.out.println("ước chung lớn nhất của :" + x + "và " + y + "là :" + ucln(x, y));
    }
}