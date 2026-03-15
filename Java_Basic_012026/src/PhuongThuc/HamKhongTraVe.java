package PhuongThuc;

public class HamKhongTraVe {

    //Khai báo hàm không trả về giá trị

    //CTRL + ALT +L -> Format lại đoạn code
    //CRTL +/ -> Comment đoạn code

    public void showInfo() {
        String name = "Lan";
        String address = "Đak Lak";
        System.out.println(name);
        System.out.println(address);
    }

    public void displayVersion() {
        String version = "1.0.0";
        System.out.println(version);
    }

    public static void main(String[] args) {
        HamKhongTraVe object1 = new HamKhongTraVe();

        object1.showInfo();
        object1.displayVersion();

        //String version = object1.displayVersion();
    }
}
