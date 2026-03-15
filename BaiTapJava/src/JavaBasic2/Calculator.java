package JavaBasic2;

public class Calculator {

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static double tinhTich(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Tong la: " + tinhTong(1, 2));
        System.out.println("Tich la: " + tinhTich(10.5, 3));
    }
}
