import java.util.Scanner;

public class Main {
    public static boolean lasotunhien(int n) {
        return n >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên :");
        int n = sc.nextInt();
        if(lasotunhien(n)) {
            System.out.println(n+"là số tự nhiên ");

        }else {
            System.out.println(n + " không phải là số tự nhiên.");
        }
sc.close();

    }
}