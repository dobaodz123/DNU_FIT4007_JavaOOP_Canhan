public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 15000.0, 3);

        System.out.println(p1);
        System.out.println("Tổng giá trị: " + p1.getTotalPrice());

        p1.increaseQuantity();
        System.out.println("Sau khi tăng số lượng: " + p1.getQuantity());

        p1.decreaseQuantity();
        System.out.println("Sau khi giảm số lượng: " + p1.getQuantity());
    }
}
