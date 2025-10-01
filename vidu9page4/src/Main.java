import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên a :");
        int a = sc.nextInt();
        System.out.println("nhập số nguyên b(khác 0) :");
        int b = sc.nextInt();
        if(b==0){
            System.out.println("b phải khác không ");
            return ;
        }
        double result = (double) a / b;

        System.out.println(a + " / " + b + " = " + result);


    }
    }
