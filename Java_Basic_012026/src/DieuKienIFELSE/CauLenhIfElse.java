package DieuKienIFELSE;

public class CauLenhIfElse {

    public void createBrowser (String browser){
        String browserSystem = System.getProperty("browser");
        if (browserSystem != null) {
            browser = browserSystem;
        }
    }

        public static void main(String[] args) {
            String actualCustomerName = "Nga 01";
            int CustomerId = 231;

            if (actualCustomerName.equals("Nga 01") && CustomerId == 231) {
                System.out.println("Passed by Customer Id");
                System.out.println("Test passed by Actual Customer Name");
            } else {
                System.out.println("Test case failed");
            }
        }
    }
