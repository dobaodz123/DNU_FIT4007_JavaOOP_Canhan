import java.util.Scanner;

public class ElectronicDevice {
    protected String manufacturer;
    protected long price ;
    public ElectronicDevice(){

    }
    public ElectronicDevice(String manufacturer, long price){
        this.manufacturer = manufacturer;
        this.price = price;

    }
    public  String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    // nhập phương thức
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập nhà sản xuất :");
        manufacturer  = input.nextLine();
        System.out.print("nhập giá");
        price = input.nextLong();
    }
    @Override
    public String toString() {
        return "nhà sản xuất :" + manufacturer + "Giá  " + price;
    }
}
