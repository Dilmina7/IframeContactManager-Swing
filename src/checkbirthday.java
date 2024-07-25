public class checkbirthday {

    public static checkbirthday newbirthdy=new checkbirthday();

   // checkbirthday() {

        public static boolean checkedvalidbirthday (String birthday3){

            int year = Integer.parseInt(birthday3.substring(0, 4));
            int month = Integer.parseInt(birthday3.substring(5, 7));
            int day = Integer.parseInt(birthday3.substring(8, 10));

            if (year <= 2024 && month == 1 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 2 && day >= 1 && day <= 29) {
                return true;

            }
            if (year <= 2024 && month == 3 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 4 && day >= 1 && day <= 30) {
                return true;

            }
            if (year <= 2024 && month == 5 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 6 && day >= 1 && day <= 30) {
                return true;

            }
            if (year <= 2024 && month == 7 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 8 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 9 && day >= 1 && day <= 30) {
                return true;

            }
            if (year <= 2024 && month == 10 && day >= 1 && day <= 31) {
                return true;

            }
            if (year <= 2024 && month == 11 && day >= 1 && day <= 30) {
                return true;

            }
            if (year <= 2024 && month >= 1 && month == 12 && day >= 1 && day <= 31) {
                return true;

            }


            //return year <= 2024 && month >= 1 && month <= 12 && day >= 1 && day <= 31;
            else {
                return false;
            }


        }
    }
//}