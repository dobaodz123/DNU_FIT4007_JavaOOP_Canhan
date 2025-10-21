import java.util.Scanner;

public class Main {

    public static boolean laSoChan(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên : ");
        int n = sc.nextInt();
        if(laSoChan(n)) {
            System.out.println(n+ "là số chẵn");
        }else{
            System.out.println(n+ "là số lẻ ");
        }
    }
}