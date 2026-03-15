package JavaBasic4;

public class VongLapForvaMang {

    public static void main(String[] args) {
        //Khai báo mảng
        int[] arr = new int[26];
        int index=0;

        //For để in ra
        for (int so=0; so <= 50; so+=2){
            arr[index]=so;
            index++;
        }
        //Duyệt mảng trên
        for (int tenMang: arr){
            System.out.println(tenMang);
        }


    }

}
