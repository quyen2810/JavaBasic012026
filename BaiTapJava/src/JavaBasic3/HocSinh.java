package JavaBasic3;

public class HocSinh {
    // khai báo 3 biến
    int HocSinhGioi = 120;
    int HocSinhKha = 80;
    int HocSinhTB = 50;

    static int number = 100;

    public static void kiemTra(int n) {
        if (n == number) {
            System.out.println("n == 100");
        } else if (n < number) {
            System.out.println("n < 100");
        } else {
            System.out.println("n > 100");
        }
    }

    public static void main(String[] args) {

        HocSinh hs = new HocSinh();

        // Toán tử quan hệ
        System.out.println(hs.HocSinhGioi > hs.HocSinhKha);
        System.out.println(hs.HocSinhTB == 50);

        // Toán tử logic
        System.out.println(hs.HocSinhGioi < hs.HocSinhKha && hs.HocSinhKha > hs.HocSinhTB);
        System.out.println(hs.HocSinhTB > 60 || hs.HocSinhKha > 70);

        // Gọi hàm
        kiemTra(hs.HocSinhGioi);
    }
}
