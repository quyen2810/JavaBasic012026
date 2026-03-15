import StaticJava.PhuongThucStatic;

public class Counter1 {
    int count = 0; // Không cộng dồn, sẽ lấy bộ nhớ khi instance được tạo ra

    Counter1() {
        count++;
        System.out.println(count);
        //PhuongThucStatic.clickElement("Search box");
       // PhuongThucStatic.setText("Quyen Customer", "Search box");
    }


    public static void main(String args[]) {

        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        Counter1 c3 = new Counter1();

    }
}