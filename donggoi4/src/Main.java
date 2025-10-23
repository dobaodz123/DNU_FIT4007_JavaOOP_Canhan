
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng từ class A
        A obj = new A(5);
        System.out.println("Giá trị ban đầu của a: " + obj.getA());
        obj.setA(10);
        System.out.println("Sau khi setA(10): " + obj.getA());
        System.out.println(obj);
    }
}
