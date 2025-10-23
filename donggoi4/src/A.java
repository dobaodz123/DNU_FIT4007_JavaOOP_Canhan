public class A {
    private int a;

    // Constructor
    public A(int a) {
        this.a = a;
    }

    // ✅ Getter KHÔNG có tham số
    public int getA() {
        return a;
    }

    // ✅ Setter CÓ tham số
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Giá trị của a là: " + a;
    }
}
