package SwitchCase;

public class CauLenhSwitchCase {

    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser) {
            case "Chrome":
                System.out.println("Khởi tạo Chrome");
                break;
            case "Edge":
                System.out.println("Khởi tạo Edge");
                break;
            case "Firefox":
                System.out.println("Khởi tạo Firefox");
                break;
            default:
                System.out.println("Not supported");
        }

    }

}
