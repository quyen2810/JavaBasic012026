package JavaBasic1;

public class SinhVien {
    // 1. Instance variable (biến đối tượng)
    String ten = "Pham Hoang Quyen";

    // 2. Static variable (biến lớp)
    static String truong = "Dai hoc Luat TP.HCM";

    public static void main(String[] args) {

        // 3. Local variable (biến cục bộ)
        int tuoi = 28;

        // Tạo object để gọi instance variable
        SinhVien sv = new SinhVien();

        System.out.println("Ten: " + sv.ten);          // instance
        System.out.println("Truong: " + truong);       // static
        System.out.println("Tuoi: " + tuoi);           // local
        System.out.println(ThongTin.lop);              // gọi biến lớp từ class ThongTin va in ra
    }
}
