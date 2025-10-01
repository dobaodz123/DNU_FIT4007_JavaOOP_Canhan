import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi của sinh viên (tính đến năm 2023): ");
        if (!sc.hasNextInt()) {
            System.out.println("Giá trị không hợp lệ.");
            return;
        }
        int age = sc.nextInt();
        if (age < 0 || age > 150) {
            System.out.println("Tuổi không hợp lệ.");
            return;
        }
        int birthYear = 2023 - age;
        System.out.println("Năm sinh: " + birthYear);
    }
}
