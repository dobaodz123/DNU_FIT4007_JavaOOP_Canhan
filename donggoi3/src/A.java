package mypackage;

public class A {
    private int a; // Không thể truy cập trực tiếp từ ngoài class

    // Constructor
    public A(int a) {
        this.a = a;
    }

    // Getter và Setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // Hàm inc() — chỉ dùng được trong cùng package
    void inc() {
        a++;
    }

    // Hàm sqr() — cho phép dùng trong cùng package và class con
    protected int sqr() {
        return a * a;
    }

    // toString()
    @Override
    public String toString() {
        return "Giá trị a = " + a;
    }
}
