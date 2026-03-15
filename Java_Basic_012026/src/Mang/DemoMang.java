package Mang;

public class DemoMang {

    public static void main(String[] args) {

        //khai báo mảng một chiều

        //mảng kiểu số nguyên int
        int mangSoNguyen [] = new int[3]; //độ dài mảng là 3 phần tử

        //gán giá trị cho mảng
        //vị trí bắt đầu phải là 0
        mangSoNguyen[0] = 2;
        mangSoNguyen[1] = 4;
        mangSoNguyen[2] = 6;

        //duyệt mảng 1
        for (int i=0; i<mangSoNguyen.length; i++){
            System.out.println(mangSoNguyen[i]);
        }

        //vừa khai báo mảng + gán giá trị cho mảng đó
        int mang2[] = new int[]{5, 10, 20, 25, 30};

        //duyệt mảng 2
        for (int i=0; i <mang2.length; i++){
            System.out.println("mang 2 gia tri so: " + mang2[i]);

        }


    }

}
