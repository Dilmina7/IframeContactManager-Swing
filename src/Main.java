
import java.util.Scanner;
class contact{

    //public static addContact[] contactar=new addContact[0];//888888888888888888888888888888888888888888888888888888888
    public static contactlist contact1=new contactlist();


    // -----define global arrays-----
    // public static String[] idis=new String[0];
    // public static String[] name=new String[0];
    // public static String[] phoneNumber=new String[0];

    // public static String[] companyName=new String[0];
    // public static double[] salary=new double[0];
    //public static String[] birthDay=new String[0];
    public static int numnum=0;
    public static String num="C000";

    // ----define interfacemethod-------
    public static void printinterface(){
        new homepage2().setVisible(true);

//        System.out.println(" /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$ ");
//        System.out.println("|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
//        System.out.println(" /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
//        System.out.println("| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
//        System.out.println("| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
//        System.out.println("| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
//        System.out.println("| $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
//        System.out.println("|__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/ ");
//        System.out.println("                                                              ");
//
//
//        System.out.println("   _____            _             _          ____                        _              ");
//        System.out.println("  / ____|          | |           | |        / __ \\                      (_)             ");
//        System.out.println(" | |     ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ ");
//        System.out.println(" | |    / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
//        System.out.println(" | |___| (_) | | | | || (_| | (__| |_\\__ \\ | |__| | | | (_| | (_| | | | | |/ /  __/ |   ");
//        System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|   ");
//        System.out.println("                                                        __/ |                           ");
//        System.out.println("                                                       |___/                            ");
//        System.out.println("\n==========================================================================================");

    }

    public static String idgenarate(){


        if(numnum>=0){
            num="C000";

            numnum++;
        }
        // num="C000";

        // numnum++;
        if(numnum>=10){
            num="C00";

            numnum++;
        }
        else   if(numnum>=100){
            num="C0";
            //numnum+=100;
            numnum++;
        }
        else  if(numnum>=1000){
            num="C";
            //numnum+=1000;
            numnum++;
        }
        return num+numnum;

        // if(id){

    }












    //increment arrays---------------------------------------------------
    // public static void incrementarraylength(){
    //  addContact[] tempcontacta=new addContact[contactar.length+1];

    //  for(int i=0;i<contactar.length;i++){
    //     tempcontacta[i]=contactar[i];
    // }
    // contactar=tempcontacta;

    //String[] tempid=new String[idis.length+1];
    //String[] tempname= new String[name.length+1];
    //String[] tempphoneNumber= new String[name.length+1];
    //String[] tempCompanyName= new String[name.length+1];
    //double[] tempSalary= new double[name.length+1];
    //String[] tempBirthDay= new String[name.length+1];


              /*for(int i=0;i< name.length;i++){
                  tempid[i]=idis[i];
                  tempname[i]=name[i];
                  tempphoneNumber[i]=phoneNumber[i];
                  tempCompanyName[i]=companyName[i];
                  tempSalary[i]=salary[i];
                  tempBirthDay[i]=birthDay[i];

              }
              idis=tempid;
              name=tempname;
              phoneNumber=tempphoneNumber;
              companyName=tempCompanyName;
              salary=tempSalary;
              birthDay=tempBirthDay;*/










    //method valid phonenumber for check the phone number
    public static boolean checkedphonenumber(String   phonenumber){

        return phonenumber.length()==10 && phonenumber.charAt(0)=='0';

    }



    //checked birthday by method =================
    public static boolean  checkedvalidbirthday(String birthday3){

        int year = Integer.parseInt(birthday3.substring(0, 4));
        int month = Integer.parseInt(birthday3.substring(5, 7));
        int day = Integer.parseInt(birthday3.substring(8, 10));

        if(year<=2024 && month==1 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==2 && day>=1 && day<=29){
            return true;

        }
        if(year<=2024 && month==3 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==4 && day>=1 && day<=30){
            return true;

        }
        if(year<=2024 && month==5 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==6 && day>=1 && day<=30){
            return true;

        }
        if(year<=2024 && month==7 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==8 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==9 && day>=1 && day<=30){
            return true;

        }
        if(year<=2024 && month==10 && day>=1 && day<=31){
            return true;

        }
        if(year<=2024 && month==11 && day>=1 && day<=30){
            return true;

        }
        if(year<=2024 && month >=1 && month==12 && day>=1 && day<=31){
            return true;

        }


        //return year <= 2024 && month >= 1 && month <= 12 && day >= 1 && day <= 31;
        else {
            return false;
        }



    }

    String v;










    //==================define add contact method =========================
    public static void addcontact(){
        Scanner input=new Scanner(System.in);

// contact heading interface--------------------------------------------
        System.out.println("+==============================+");
        System.out.println("|------add contact------------|");
        System.out.println("+==============================+");

        do{
            String id2= idgenarate();

            System.out.print("\n\nEnter your name:");
            String name2=input.next();

            String phoneNumber2;


            do{

                System.out.print("Enter your phone Number:");
                phoneNumber2=input.next();
                //calling validate for phone number---------------------------
                if(!checkedphonenumber(phoneNumber2)){

                    System.out.println("invalid phone number....");
                    System.out.print("do you want to enter phonenumber again? (y/n)..?");
                    char answer=input.next().charAt(0);
                    if(answer=='y' | answer=='Y'){
                        System.out.print("\033[5A");
                        System.out.print("\033[0J");
                    }else if(answer=='n' | answer=='N') {
                        main(null);
                        break;
                    }
                }

            }while(!checkedphonenumber(phoneNumber2));

            System.out.print("Enter your company Name:");
            String companyName3=input.next();
            System.out.print("Enter your Salary:");
            double salary2=input.nextDouble();

            String birthday3;

            do{
                System.out.print("Enter your Bithday:");

                birthday3=input.next();

                //calling birthdaycheck method------------------------------------

                if(!checkedvalidbirthday( birthday3)){

                    System.out.println("invalid birthday ...");
                    System.out.print("do you want to enter birthday again? (y/n)..?");
                    char answer=input.next().charAt(0);
                    if(answer=='y' | answer=='Y'){
                        System.out.print("\033[7A");
                        System.out.print("\033[0J");
                    }else if(answer=='n' | answer=='N') {
                        main(null);
                        break;
                    }
                }



            }while(!checkedvalidbirthday( birthday3)   );




            //define incrementarraylength=========================================

            addContact contact=new addContact(id2,name2,phoneNumber2,companyName3,salary2,birthday3);

            contact1.add(contact);//add contact in contactlist++++++++++++++++++++++++++++++++++++++


            //incrementarraylength();


            //contactar[contactar.length-1]=contact;




            //idis[idis.length-1]=id2;
            //name[name.length-1]=name2;
            //phoneNumber[ phoneNumber.length-1]=phoneNumber2;
            //companyName[companyName.length-1]=companyName3;
            //salary[ salary.length-1]= salary2;
            //birthDay[birthDay.length-1]=birthday3;

            System.out.println("contatct has been added successfully ");
            System.out.print("do you want to another contact(Y/N).....? ");
            char answer=input.next().charAt(0);
            if(answer=='y' || answer=='Y'){
                addcontact();
            }else {
                main(null);
                break;
            }


        }while(true);

    }













//serch  index in arrays=========================================================================================================
//public static int serch(String nameorphonenumber){
    /// for(int i=0;i<contactarry.length;i++){
    //  if(contact1.contactarry[i].getname(i).equals(nameorphonenumber) ||contact1.contactarry [i].getphoneNumber().equals(nameorphonenumber)){
    //     return i;
    // }



//}
//return -1;
//}


    //define updatecontact method===============================================
    public static void    updatecontact(){
        // update heading interface---------------------------------------
        System.out.println("=============================");
        System.out.println("------update contact---------");
        System.out.println("=============================");

        Scanner input=new Scanner(System.in);

        System.out.print("search contact by name or phone number to update-");
        String nameorphonenumber=input.next();
        int check2=contact1.serch(nameorphonenumber);
//String idd=idgenarate();
        if(check2==-1){
            System.out.println("No matching data");
            System.out.print("do you want to another update(Y/N).....? ");
            char answer=input.next().charAt(0);
            if(answer=='y' || answer=='Y'){
                updatecontact();
            }else {
                main(null);

            }

        }else{

            System.out.println("contat ID   :"+contact1.getcontact(check2).getid());
            System.out.println("Name        :"+contact1.getcontact(check2).getname());
            System.out.println("phone number:"+contact1.getcontact(check2).getphoneNumber());
            System.out.println("company name:"+contact1.getcontact(check2).getcompanyName());
            System.out.println("salary      :"+contact1.getcontact(check2).getsalary());
            System.out.println("B day(yyyy-mm-dd):"+contact1.getcontact(check2).getbirthday());
        }

        System.out.println("what do you want to update");

        System.out.println("[01] name");
        System.out.println("[02] phone number");
        System.out.println("[03] company name");
        System.out.println("[04] salary");

        System.out.print("input option to continue-");
        int option2=input.nextInt();
        String newphonenumber;
        switch(option2){



            case 1:
                System.out.print("input new name-");
                String newname=input.next();
                //contactar[check2].setname(newname);
                contact1.upname(check2,newname);
                //  String newphonenumber;
                break;
            case 2:
                do{
                    System.out.print("input new phone number-");
                    newphonenumber=input.next();
                    //check phonenumber----------------------------
                    if(!checkedphonenumber(newphonenumber)){

                        System.out.println("invalid phone number....");
                        System.out.print("do you want to enter phonenumber again? (y/n)..?");
                        char answer=input.next().charAt(0);
                        if(answer=='y' | answer=='Y'){
                            System.out.print("\033[5A");
                            System.out.print("\033[0J");
                        }else if(answer=='n' | answer=='N') {
                            main(null);
                            break;
                        }
                    }

                }while(!checkedphonenumber(newphonenumber));


                //contactar[check2].setphoneNumber(newphonenumber);
                contact1.upphonenumber(check2,newphonenumber);
                System.out.print("phonenumber update complete....");
                break;

            case 3:
                System.out.print("input new company name-");

                String newcompanyname=input.next();
                contact1.upcompanyname(check2,newcompanyname);
                // contactar[check2].setcompanyName(newcompanyname);
                break;

            case 4:
                System.out.print("input new salary");
                double salarynew=input.nextDouble();
                contact1.upsalary(check2,salarynew);
                // contactar[check2].setsalary(salarynew);
                break;

        }

        do{
            //call again update---------------------------------------------
            System.out.print("update succesed.......... ");
            System.out.print("do you want to another update(Y/N).....? ");
            char answer=input.next().charAt(0);
            if(answer=='y' || answer=='Y'){
                updatecontact();
            }else {
                main(null);
                break;
            }


        }while(true);


    }


    //====================================================================
//========================================================================
    //define delete method================================================
    public static void   deletecontact(){

        System.out.println("=============================");
        System.out.println("------delete contact---------");
        System.out.println("=============================");

        Scanner input=new Scanner(System.in);
//serch coustomer need details----------------------------------------

        System.out.print("search contact by name or phone number to delete-");
        String nameorphonenumber=input.next();
        int check2=contact1.serch(nameorphonenumber);

        if(check2==-1 ){
            System.out.println("No matching data");
            //print detail of coustemer needed---------------------------------
        }else{

            System.out.println("contat ID   :"+contact1.getcontact(check2).getid());
            System.out.println("Name        :"+contact1.getcontact(check2).getname());
            System.out.println("phone number:"+contact1.getcontact(check2).getphoneNumber());
            System.out.println("company name:"+contact1.getcontact(check2).getcompanyName());
            System.out.println("salary      :"+contact1.getcontact(check2).getsalary());
            System.out.println("B day(yyyy-mm-dd):"+contact1.getcontact(check2).getbirthday());
        }

        System.out.print(" do you want to delete this contact(Y/N)--");

        char chr=input.next().charAt(0);
        if(chr=='y' || chr=='Y'){

            contact1.delete(check2);


            // addContact[]  tem1contactar=new addContact[contactar.length-1];

            //String[] idisA=new String[name.length-1];
            //String[] nameA=new String[name.length-1];
            //String[] phonenumberA=new String[name.length-1];
            //String[] companynameA=new String[name.length-1];
            //double[] salaryA=new double[name.length-1];
            //String[] birthdayA=new String[name.length-1];


            //for(int i=0,j=0;i<contactar.length;i++){
            //  if(i==check2){
            //   continue;
            // }else
            // tem1contactar[j]=contactar[i]; //idisA[j]=idis[i];
            // nameA[j]=name[i];
            // phonenumberA[j]=phoneNumber[i];
            //companynameA[j]=companyName[i];
            // salaryA[j]=salary[j];
            // birthdayA[j]=birthDay[j];
            // j++;}




            //contactar=tem1contactar;

            //idis=idisA;
            //name        =        nameA;
            //phoneNumber = phonenumberA;
            //companyName = companynameA;
            //salary      =      salaryA;
            //birthDay    =    birthdayA;

            System.out.println("coustomer has been deleted successfully");
            //System.out.println(Arrays.toString(name));




        }else {
            main(null);
        }




        do{
            //again ask delete------------------------------------------------
            System.out.print("do you want to another delete(Y/N).....? ");
            char answer=input.next().charAt(0);
            if(answer=='y' || answer=='Y'){
                deletecontact();
            }else {
                main(null);
                break;
            }


        }while(true);


    }



    //define serch method for case 4=============================================
    public static void serchitems(){
        Scanner input=new Scanner(System.in);
        System.out.print("input contact by name or phone number to search-");
        String   serchitem=input.next();

        int check2=contact1.serch(  serchitem);

        if(check2==-1){
            System.out.println("No matching data");


            //print details-----------------------------------------
        }else{
            System.out.println("contat ID   :"+contact1.getcontact(check2).getid());
            System.out.println("Name        :"+contact1.getcontact(check2).getname());
            System.out.println("phone number:"+contact1.getcontact(check2).getphoneNumber());
            System.out.println("company name:"+contact1.getcontact(check2).getcompanyName());
            System.out.println("salary      :"+contact1.getcontact(check2).getsalary());
            System.out.println("B day(yyyy-mm-dd):"+contact1.getcontact(check2).getbirthday());
        }

        do{

            System.out.print("do you want to another serch item(Y/N).....? ");
            char   answer=input.next().charAt(0);
            if(answer=='y' || answer=='Y'){
                serchitems();
            }else {
                main(null);
                break;
            }


        }while(true);
    }



    public static void listcontatct(){

        System.out.println("=============================");
        System.out.println("------sort contact---------");
        System.out.println("=============================");

        Scanner input=new Scanner(System.in);

        System.out.println("[01] sorting by name..");
        System.out.println("[02] sorting by salary..");
        System.out.println("[03] sorting by birthday..");

        System.out.print("Enter an option continue..");
        int option3=input.nextInt();

        switch(option3){
            case 1:
                System.out.println("=============================");
                System.out.println("----list contact by name-----");
                System.out.println("=============================");

                //contact1.listname();//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                //  String[]  tempname0=new String[contactar.length];
                //   for(int i=0;i<contactar.length;i++){
                //      tempname0[i]=contactar[i].getname();

                //  }

                // System.out.println(Arrays.toString(tempname0));
                //  for(int i=0;i<contactar.length;i++){
                //    char ascii1= tempname0[i].charAt(0);
                //   int asciinum1=ascii1;
                //    for(int j=0;j<contactar.length;j++){
                //       char ascii2=tempname0[j].charAt(0);
                //       int asciinum2=ascii2;

                //    if(asciinum1<asciinum2){
                //        String tem =tempname0[i];
                //         tempname0[i]=tempname0[j];
                //         tempname0[j]=tem;

                //     }
                //  }
                //  }
                //String[]  tempid0=new String[name.length];
                //String[]  temphonenumber0=new String[name.length];

                //String[]  tempcompanyname0=new String[name.length];
                //double[]  tempsalary0= new double[salary.length];
                // String[]  tempbirthday0=new String[name.length];





                System.out.println("+-----------------------------------------------------------------------------+");
                System.out.println("|  contact id  |  name  |  phone number  |  company name |  salary  |  birth day  |");
                System.out.println("+-----------------------------------------------------------------------------+");

                contact1.listname();

//addContact[] temparr=new addContact[contactar.length];

//System.out.println(Arrays.toString(tempname0));
//for( int i=0;i<tempname0.length;i++){
                //int returnindex=   serch(tempname0[i]);

// tempid0[i]=idis[returnindex];
///temphonenumber0[i]=phoneNumber[returnindex];
//tempcompanyname0[i]=companyName[returnindex];
//tempsalary0[i]=salary[returnindex];
//tempbirthday0[i]= birthDay[returnindex];

//temparr[i]=contactar[returnindex];

//}
                //idis[returnindex]=idis[i];
                //phoneNumber[returnindex]=phoneNumber[i];
// companyName[returnindex]=companyName[i];
                //salary[returnindex]=salary[i];
// birthDay[returnindex]= birthDay[i];


//contactar=temparr;
//for(int u=0;u<contact1.tempory().length;u++){



//System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", contact1.tempory()[u].getid(), contact1.tempory()[u].getname(), contact1.tempory()[u].getphoneNumber(), contact1.tempory()[u].getcompanyName(),contact1.tempory()[u].getsalary(), contact1.tempory()[u].getbirthday());
//System.out.println(tempname0[i]);

//}





                System.out.println("\n+-----------------------------------------------------------------------------+");


                do{




                    System.out.print("do you want to list ? (y/n)..?");
                    char answer=input.next().charAt(0);
                    if(answer=='y' | answer=='Y'){
                        listcontatct();
                    }else if(answer=='n' | answer=='N') {
                        main(null);
                        break;
                    }


                }while(true);



                break;



            case 2:
                System.out.println("=============================");
                System.out.println("----list contact by salary-----");
                System.out.println("=============================");

                contact1.listsalary();

                // double[]  tempnsalary=new double[contactar.length];
                //for(int i=0;i<contactar.length;i++){
                //    tempnsalary[i]=contactar[i].getsalary();

                // }

                // System.out.println(Arrays.toString(tempname0));
                // for(int i=1;i<tempnsalary.length;i++){
                //  for(int j=0;j<tempnsalary.length;j++){

                //     if( tempnsalary[i]< tempnsalary[j]){
                //double tem= tempnsalary[i];
                //           tempnsalary[i]= tempnsalary[j];
                //            tempnsalary[j]=tem;

                //     }

                //  }
                //  }

                //  addContact[] tempar=new addContact[contactar.length];

                // String[]  t1empid0=new String[name.length];
                //String[]  t1empname0=new String[name.length];
                // String[]  t1emphonenumber0=new String[name.length];
                // String[]  t1empname0=new String[name.length];------->
                // String[]  t1empcompanyname0=new String[name.length];
                //double[]  tempsalary0= new double[salary.length];------>
                // String[]  t1empbirthday0=new String[name.length];





                System.out.println("+---------------------------------------------------------------------------------+");
                System.out.println("|  contact id  |  name  |  phone number  |  company name |  salary  |  birth day  |");
                System.out.println("+---------------------------------------------------------------------------------+");




//System.out.println(Arrays.toString(tempnsalary));
//for( int i=0;i<tempnsalary.length;i++){
                //int returnindex=   serch(tempname0[i]);
                //for( int j=0;j<tempnsalary.length;j++){
                //  if( tempnsalary[i]==contactar[j].getsalary()){
                //   int indexx=j;



                //   tempar[i] =contactar[indexx];
//t1empid0[i]=idis[indexx];
//t1empname0[i]=name[indexx];
//t1emphonenumber0[i]=phoneNumber[indexx];
//t1empcompanyname0[i]=companyName[indexx];
//tempname0[i]=salary[indexx];---->
//t1empbirthday0[i]= birthDay[indexx];

                //idis[returnindex]=idis[i];
                //phoneNumber[returnindex]=phoneNumber[i];
// companyName[returnindex]=companyName[i];
                //salary[returnindex]=salary[i];
// birthDay[returnindex]= birthDay[i];
                //}
                //}
//}
                //contactar=tempar;
                //for( int u=0;i<contact1.tempory().length;u++){
                //  System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", contact1.tempory()[u].getid(), contact1.tempory()[u].getname(), contact1.tempory()[u].getphoneNumber(), contact1.tempory()[u].getcompanyName(),contact1.tempory()[u].getsalary(), contact1.tempory()[u].getbirthday());
                //}
//System.out.println(tempname0[i]);




                System.out.println("\n+-----------------------------------------------------------------------------+");



                do{



                    System.out.print("do you want to list ? (y/n)..?");
                    char answer=input.next().charAt(0);
                    if(answer=='y' | answer=='Y'){
                        listcontatct();
                    }else if(answer=='n' | answer=='N') {
                        main(null);
                        break;
                    }


                }while(true);




                break;

            case 3:
                System.out.println("=============================");
                System.out.println("----list contact by birthday-----");
                System.out.println("=============================");
                contact1.listbirthday();//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                //  String[]  tempbirth=new String[contactar.length];
                // for(int i=0;i<contactar.length;i++){
                //    tempbirth[i]=contactar[i].getbirthday();

                // }

                // System.out.println(Arrays.toString(tempname0));
                // for(int i=1;i<tempbirth.length;i++){

                //   for(int j=0;j<tempbirth.length;j++){
                //       int year1 = Integer.parseInt(tempbirth[i].substring(0, 4));
                //      int year2 = Integer.parseInt(tempbirth[j].substring(0, 4));
                //       if( year1<year2){
                //          String tem=tempbirth[i];
                //        tempbirth[i]=tempbirth[j];
                //          tempbirth[j]=tem;

                //        }

                //      }
                //  }

                //  System.out.println(Arrays.toString(tempbirth));

                // addContact[] tempt=new addContact[contactar.length];

                //  String[]  tempid3=new String[name.length];
                //   String[]  tempname3=new String[name.length];
                // String[]  temphonenumber3=new String[name.length];
                //  String[]  tempcompanyname3=new String[name.length];
                //  double[]  tempsalary3= new double[salary.length];
                // String[]  tempbirthday0=new String[name.length];---->





                System.out.println("+-----------------------------------------------------------------------------+");
                System.out.println("|  contact id  |  name  |  phone number  |  company name |  salary  |  birth day  |");
                System.out.println("+-----------------------------------------------------------------------------+");




//for( int i=0;i<tempbirth.length;i++){
                //for( int j=0;j< tempbirth.length;j++){
                //  if(  tempbirth[i]==contactar[j].getbirthday()){
                //  int indexx=j;


                // tempt[i]=contactar[indexx];
//tempid3[i]=idis[indexx];
                //tempname3[i]=name[indexx];
//temphonenumber3[i]=phoneNumber[indexx];
//tempcompanyname3[i]=companyName[indexx];
//tempsalary3[i]=salary[indexx];
//tempbirth3[i]= birthDay[indexx];---->

                //idis[returnindex]=idis[i];
                //phoneNumber[returnindex]=phoneNumber[i];
// companyName[returnindex]=companyName[i];
                //salary[returnindex]=salary[i];
// birthDay[returnindex]= birthDay[i];
                //  }
                //  }
                //  }
                //  contactar=tempt;
                // for( int u=0;i<contact1.tempory().length;u++){
                //    System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", contact1.tempory()[u].getid(), contact1.tempory()[u].getname(), contact1.tempory()[u].getphoneNumber(), contact1.tempory()[u].getcompanyName(),contact1.tempory()[u].getsalary(), contact1.tempory()[u].getbirthday());
//System.out.println(tempname0[i]);

        }





        System.out.println("+-----------------------------------------------------------------------------+");


        do{



            System.out.print("do you want to list ? (y/n)..?");
            char answer=input.next().charAt(0);
            if(answer=='y' | answer=='Y'){
                listcontatct();
            }else if(answer=='n' | answer=='N') {
                main(null);
                break;
            }


        }while(true);





    }




    //main method define=============================================
    public static void main(String args[]){

        printinterface();

//        Scanner input=new Scanner(System.in);
//
//        //print options-----------------------------------------------
//        System.out.println("[1] ADD Contacts");
//        System.out.println("[2] UPDATE Contacts");
//        System.out.println("[3] DELETE Contacts");
//        System.out.println("[4] SEARCH Contacts");
//        System.out.println("[5] LIST Contatcts");
//        System.out.println("[6] Exit");
//
//        //take option by coustomer--------------------------------------
//        System.out.print("Enter an option to continue->");
//        int option=input.nextInt();
//        //ckeck option and execute needed thing--------------------------
//        switch(option){
//
//            case 1:
//
//                addcontact();
//                break;
//            case 2:
//
//                updatecontact();
//                break;
//            case 3:
//                deletecontact();
//                break;
//
//            case 4:
//                serchitems();
//                break;
//
//
//            case 5:
//                listcontatct();
//                break;
//
//            case 6:
//                System.exit(0);
//                break;
//
//        }







    }



}