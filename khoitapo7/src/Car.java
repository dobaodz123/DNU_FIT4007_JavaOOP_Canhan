import java.time.Year;

public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;
    public Car() {
        this.color = "";
        this.name = "";
        this.seatingCapacity = 0;
        this.year = 0;
    }

    // ===== Phương thức khởi tạo có tham số =====
    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    // ===== Getter và Setter =====
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // ===== Phương thức toString() =====
    @Override
    public String toString() {
        return "Car{name='" + name + "', color='" + color +
                "', seatingCapacity=" + seatingCapacity +
                ", year=" + year + "}";
    }

    // ===== Phương thức getAge(): Tính tuổi của xe =====
    public int getAge() {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại
        return currentYear - year;
    }
}
