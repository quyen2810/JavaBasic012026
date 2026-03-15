package Variables;

public class Loop {
    public static void main(String[] args) {
        takeEventScreenshots ();
    }
    public static void takeEventScreenshots (){
        for (int i=1; i<=10; i++){
            if (i%2==0){
                System.out.println("Taking screenshot of page "+i);
            }
        }
    }

}
