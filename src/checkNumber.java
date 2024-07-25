public class checkNumber {

    public static checkNumber newnum = new checkNumber();

    public static boolean checkedphonenumber(String   phonenumber){

        return phonenumber.length()==10 && phonenumber.charAt(0)=='0';

    }

}
