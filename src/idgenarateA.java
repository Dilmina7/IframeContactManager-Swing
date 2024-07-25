public class idgenarateA {

    public static int numnum = 0;
    public static String num="C000";


    public static String idgenarate() {


        if (numnum >= 0) {
            num = "C000";

            numnum++;
        }
        // num="C000";

        // numnum++;
        if (numnum >= 10) {
            num = "C00";

            numnum++;
        } else if (numnum >= 100) {
            num = "C0";
            //numnum+=100;
            numnum++;
        } else if (numnum >= 1000) {
            num = "C";
            //numnum+=1000;
            numnum++;
        }
        return num + numnum;

        // if(id){

    }

}
