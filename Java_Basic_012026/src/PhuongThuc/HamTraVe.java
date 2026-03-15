package PhuongThuc;

import java.sql.SQLOutput;

public class HamTraVe {

    //Khai báo hàm có trả về giá trị để dùng lại được
    public String getVersion() {
        String version = "2.0.0";
        return version;
    }

    public int getCategoryTotal() {
        int categoryTotal = 100;
        return categoryTotal;
    }

    public static void main(String[] args) {
        HamTraVe object1 = new HamTraVe();

        String version1 = object1.getVersion();
        System.out.println(version1);

        String version2 = object1.getVersion();
        System.out.println(version2);


        HamTraVe object2 = new HamTraVe();

        int categoryTotal1 = object2.getCategoryTotal();
        System.out.println(categoryTotal1);
    }
}
