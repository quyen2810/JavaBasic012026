package Variables;

public class DemoVariable2 {
    static String name = "Quyen Pham"; //Bien instance, co the su dung trong ham nao cung duoc, co the co hoac khong co pham vi truy cap
    public static int age = 28; //Bien instance co them static, luu tru gia tri se duoc cap nhat, thay doi trong qua trinh xu ly

    //Cau truc Ham 1
    public void getInfo1 () {
        String address = "Vinhomes"; //Bien Local, khong su dung duoc o ngoai Ham 1, khong co pham vi truy cap (Public, Private)
        System.out.println(address);
        System.out.println(name);
        System.out.println(age);
    }

    //Cau truc Ham 2
    static public void getInfo2 (){
        //System.out.println(address); Khong su dung duoc o Ham 2 do la Bien local cua Ham 1
        System.out.println(name);
    }

    //Cau truc Ham main
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(name);

        //DemoVariables2.getInfo1 (); khong chay duoc do khong phai ham static
        DemoVariable2.getInfo2 ();
        //getInfo1 (); khong chay duoc do khong phai ham static
        //getInfo2 (); them static vao cau truc dung cua ham
    }
}
