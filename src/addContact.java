public class addContact{





    private String id;
    private String name;
    private String phoneNumber;
    private String companyName;
    private double salary;
    private String birthDay;

   public addContact(String id, String name, String phoneNumber, String companyName, double salary, String birthDay){
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.companyName=companyName;
        this.salary=salary;
        this.birthDay=birthDay;


    }
    public void setid(String id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setcompanyName(String companyName){
        this.companyName=companyName;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public void setbirthday(String birthday){
        this.birthDay=birthday;
    }

    //get method
    public  String getid(){
        return id;
    }
    public  String  getname(){
        return name;
    }
    public  String getphoneNumber(){
        return phoneNumber;
    }
    public  String getcompanyName(){
        return companyName;
    }
    public  double getsalary(){
        return salary;
    }
    public  String getbirthday(){
        return birthDay;
    }






}