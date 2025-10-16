import java.util.Scanner;

public class Main {
    public static int tinhtich(int a ,int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên s1 :");
        int a = sc.nextInt();
        System.out.print("nhập số nguyên s2 :");
        int b = sc.nextInt();
        System.out.print("nhập số nguyên s3 :");
        int c = sc.nextInt();
        int tich =tinhtich(a,b,c);
        System.out.println("tích là "+tich);
        sc.close();

    }


}