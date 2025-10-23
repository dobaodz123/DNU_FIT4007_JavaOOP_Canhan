public class Main {
    public static void main(String[] args) {
        A obj = new A();

        // obj.a = 10;   Lỗi, vì a là private

        obj.setA(10);   //  gán giá trị qua setter
        System.out.println("Giá trị a là: " + obj.getA()); //  đọc qua getter
    }
}
