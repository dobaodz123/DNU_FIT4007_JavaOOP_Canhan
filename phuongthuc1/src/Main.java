import java.util.Scanner;

public class Main {
    public static int tinhtong(int a ,int b ){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên thứ 1 :");
        int a = sc.nextInt();
        System.out.print("nhập số nguyên thứ 2 :");
        int b = sc.nextInt();
        int tong=tinhtong(a,b);
        System.out.println(tong);

    }
}
