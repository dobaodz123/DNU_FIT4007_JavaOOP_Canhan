public class Student {
    private String mssv ;
    private String name ;
    private int age ;
    // khởi tạo k tham số
    public Student() {
        this.mssv = "";
        this.name = "";
        this.age = 0;
    }
    public Student(String mssv, String name, int age) {
        this.mssv = mssv;
        this.name = name;
        this.age = age;
    }

    public String getMssv() {
        return mssv;
    }
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }
    @Override
    public String toString() {
        return "Student [Mã SV: " + mssv + ", Tên: " + name + ", Tuổi: " + age + "]";
    }
}
