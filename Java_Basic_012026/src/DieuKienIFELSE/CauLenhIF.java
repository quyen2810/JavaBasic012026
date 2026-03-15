package DieuKienIFELSE;

import javax.management.MBeanAttributeInfo;

public class CauLenhIF {

    public static void main(String[] args) {
        String actualCustomerName = "Nga 01";
        int CustomerId = 231;

        if (actualCustomerName.equals("Nga 01") && CustomerId == 231) {
            System.out.println("Passed by Customer Id");
            System.out.println("Test passed by Actual Customer Name");
        }
    }
}
