package ToanTu;

public class ToanTuSoHoc {
    public static void main(String[] args) {
        int gia1 = 12;
        //click de tang gia 5 lân
        int gia2 = gia1 * 5;
        System.out.println(gia2);
        //so sanh (gia1*5) == gia2 => True/ False => Pass/ Failed
        int giasaucapnhat = gia1*5;
        if (giasaucapnhat!=gia2){
            System.out.println("true => passed");
        } else {
            System.out.println(gia2 % gia1);
        }
    }
}
