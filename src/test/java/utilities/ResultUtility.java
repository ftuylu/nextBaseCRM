package utilities;

public class ResultUtility {

    public static void verifyEquals (int expected, int actual, int quantity){

        if (expected==actual+ quantity){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }

    }
}