import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = sc.nextInt();
        System.out.print("Nhap canh b: ");
        int b = sc.nextInt();

        if (a > 0 && b > 0) {  // phải là cạnh dương
            if (a == b) {
                System.out.println("Day la hinh vuong.");
            } else {
                System.out.println("Day khong phai hinh vuong (chi la hinh chu nhat).");
            }
        } else {
            System.out.println("Do dai canh phai lon hon 0!");
        }

        sc.close();
    }
}
