import java.util.Scanner;

public class Main {
    public static int tinhTich(int a, int b, int c) {
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số thứ 1 :");
        int a = input.nextInt();
        System.out.print("nhập số thứ 2 :");
        int b = input.nextInt();
        System.out.print("nhập số thứ 3 :");
        int c = input.nextInt();
        int tich=tinhTich(a,b,c);
        System.out.println(tich);
    }

}