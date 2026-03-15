package XuLyChuoiString;

public class XuLyChuoiString {

    public static void main(String[] args) {

        String str1 = "Selenium Java Web Test";
        String str2 = "Playwright JavaScript - Web&API Test";

        //In thường, in hoa
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        //Lấy ký tự ở index nào đó
        System.out.println(str1.charAt(3) + " " + str1.charAt(4));
        //Lấy ra độ dài chuỗi
        System.out.println(str1.length());
        //Cắt chuỗi từ đâu đến đâu, không có end thì nghĩa là lấy hết
        System.out.println(str1.substring(14,22));
        //có chứa hay không
        System.out.println(str1.contains("Selenium"));
        System.out.println(str2.contains("Playwright"));
        //có chứa và so sánh bằng
        System.out.println(str1.equals("Selenium"));
        System.out.println(str2.equals("Playwright"));
        //kết hợp
        System.out.println("in ra: " + str1.equals(str1.substring(14,22)));

        //bài tập thực tế: Lấy số 40 trong chuỗi
        String textTableFooter = "Showing 1 to 25 of 40 records";
        //System.out.println(textTableFooter.substring(19,21)); không dùng được do không ổn định
        //tách chuỗi theo khoảng trắng
        String mangGiaTriSauKhiTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauKhiTach[5]);

        //nối chuỗi lại với nhau
        String str3 = "Thư viện Automation: " + "Selenium";
        System.out.println(str3);
        System.out.println(str3.concat(" + Playwright"));

        //thay thế chuỗi (toàn phần)
        String str5 = "Selenium Java Selenium Python Selenium C#";
        System.out.println(str5.replaceAll("Selenium",""));
        //thay thế chuỗi (một phần)
        System.out.println(str1.replace("Selenium", "Playwright"));

        //kiểm tra đầu cuối
        System.out.println("startsWith: " + str1.startsWith("Selenium"));
        System.out.println("endsWith: " + str1.endsWith("Check"));

        //loại bỏ tất cả khoảng trắng đầu + cuối
        String str6 = "   Kiem thu phan mem    ";
        System.out.println(str6.trim());
        //loại bỏ tất cả các khoảng trắng hiện có ở đầu giữa cuối chuỗi
        System.out.println(str6.trim().replaceAll(" ", ""));

        //chuyển đổi số thành chuỗi
        String stringNumber = "1000";
        int number = 2000;

        //System.out.println(stringNumber+10); -> in ra 100010, vì 1000 là chuỗi
        System.out.println("Chuyển số thành chuỗi: " + String.valueOf(number) + 5);
        System.out.println("Chuyển chuỗi số thành số: " + (Integer.valueOf(stringNumber) + 5));
        System.out.println("Chuyển chuỗi số thành số: " + Integer.valueOf(stringNumber) + 5);

    }

}
