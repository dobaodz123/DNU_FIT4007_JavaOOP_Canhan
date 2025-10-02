import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N(số nguyên)");
        int n = sc.nextInt();
        if (n>=0){
            System.out.println("N là số nguyên :");
        }
        else{
            System.out.println(n + " khong phai la so tu nhien.");
        }
        sc.close();
    }
}