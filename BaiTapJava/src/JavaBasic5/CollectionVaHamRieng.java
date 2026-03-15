package JavaBasic5;

import java.util.ArrayList;

public class CollectionVaHamRieng {
    //tạo collection
    static ArrayList<String> nhanvien = new ArrayList<>();

    //thêm nhân viên
    public static void themNhanVien() {
        nhanvien.add("Nguyen Van A - 25 - Ha Noi");
        nhanvien.add("Pham Thi B - 28 - Ho Chi Minh");
        nhanvien.add("Tran Van C - 31 - Da Nang");
    };

    public static void main(String[] args) {
        themNhanVien();
        //duyệt để in
        for (int i=0; i< nhanvien.size(); i++){
            System.out.println(nhanvien.get(i));
        }

    }

}
