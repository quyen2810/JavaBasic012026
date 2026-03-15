package StaticJava;

public class BienStatic {
    String email = "quyen@email.example";
    public static String password ="123456";

    public static void main(String[] args) {
        BienStatic object1 = new BienStatic();
        System.out.println(object1.email);
        //sout(email) -> sẽ không chạy được nếu không khai báo đối tượng class bởi vì biến này không phải biến static

        //Biến static có thể được gọi mà không cần khai báo đối tượng
        System.out.println(password);
        System.out.println(BienStatic.password);

        System.out.println(ConfigData.browser); //có thể gọi biên static từ class khác

    }
}
