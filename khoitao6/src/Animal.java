import java.time.Year;

public class Animal {
    // 🔹 Thuộc tính
    private String name;
    private String color;
    private int age;

    // 🔹 Constructor mặc định (không tham số)
    public Animal() {
        this.name = "";
        this.color = "";
        this.age = 0;
    }

    // 🔹 Constructor có tham số (khởi tạo với giá trị cho sẵn)
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // 🔹 Getter và Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 🔹 Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 🔹 Getter và Setter cho age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 🔹 Phương thức lấy năm sinh
    public int getYearOfBirth() {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại
        return currentYear - age;
    }

    // 🔹 Kiểm tra xem hai động vật có cùng màu không
    public boolean equalsColor(Animal a) {
        return this.color.equalsIgnoreCase(a.color);
    }

    // 🔹 Tăng tuổi lên 1
    public void increaseAge() {
        this.age++;
    }

    // 🔹 Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Animal [name=" + name + ", color=" + color + ", age=" + age + "]";
    }
}
