package PhuongThuc;

public class HamCoThamSo {

    public int cong2So(int number1, int number2){
        return number1 + number2;
    }

    public void loginTestValidCredential(String email, String password){
        System.out.println("Navigate to url");
        System.out.println("Enter email" + email);
        System.out.println("Enter password" + password);
        System.out.println("Click Login");
        System.out.println("Verify login successfully");
    }

    public void loginTestInvalidCredential(String email, String password){
        System.out.println("Navigate to url");
        System.out.println("Enter email" + email);
        System.out.println("Enter password" + password);
        System.out.println("Click Login");
        System.out.println("Verify login failed");
    }

    public static void main(String[] args) {

        HamCoThamSo object1= new HamCoThamSo();

        System.out.println(object1.cong2So(25,10));

        object1.loginTestValidCredential("quyen@ex.email", "123456");
        object1.loginTestInvalidCredential("admin@ex.com", "abcdxyz");

    }

}
