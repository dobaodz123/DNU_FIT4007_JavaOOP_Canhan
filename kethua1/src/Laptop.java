import java.util.Scanner;

public class Laptop extends ElectronicDevice {
    private String screenSize;
    public Laptop() {
        super();
    }
    public Laptop(String manufacturer, long price, String screenSize) {
        super(manufacturer, price);
        this.screenSize = screenSize;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    @Override
    public void input() {
        super.input(); // nhập phần chung từ lớp cha
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước màn hình: ");
        screenSize = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + ", Kích thước màn hình: " + screenSize;
    }
}
