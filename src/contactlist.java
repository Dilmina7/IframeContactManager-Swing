//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

class contactlist{
    //public static contactlist infomation = new contactlist();
    private Node start;

    int index;

    private boolean isempty(){//=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        return start==null;

    }
    private boolean validindex(int index){//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        return index>=0 && index<size();
    }
    public int size(){//============================================================================
        int count=0;
        Node temp=start;
        while(temp!=null){

            temp=temp.next;
            count++;
        }
        return count;
    }




    public void add(addContact contact){//adddd contact  =====================================

        Node n1=new Node(contact);
        Node temp=start;
        if(isempty()){
            start=n1;
        }
        else{
            while (temp.next!=null){
                temp=temp.next;

            }

            temp.next=n1;
        }

    }
    public int serch(String serchitem){
        if(start==null){
            return -1;
        }
        Node temp=start;
        int count=0;
        while(temp!=null){
            if(temp.Ncontact.getname().equals(serchitem)||temp.Ncontact.getphoneNumber().equals(serchitem)){
                return count;
            }
            temp=temp.next;
            count++;

        }
        return -1;
    }

    public addContact getcontact(int index){
        if(validindex(index)){
            if(index==0){
                return  start.Ncontact;
            }else{
                Node temp=start;
                for(int i=0;i<index;i++){
                    temp=temp.next;
                }

                return temp.Ncontact;
            }
        }
        return null;
    }

    public void upname(int index,String newname){
        getcontact(index).setname(newname);


    }

    public void upphonenumber(int index,String newpnumber){
        getcontact(index).setphoneNumber(newpnumber);

    }

    public void upcompanyname(int index,String newcomname){
        getcontact(index).setcompanyName(newcomname);


    }

    public void upsalary(int index, double newsalary){
        getcontact(index).setsalary(newsalary);

    }


    public void delete(int index){
        if(index==0){
            start=null;


        }

        Node temp=start;
        while(temp!=null){
            if(temp.Ncontact==getcontact(index)){
                temp=temp.next;


            }
            temp=temp.next;

        }


    }

    public void listname(){
        if(start.next==null){
            return ;
        }
        Node index=null;
        Node temp=start;
        while(temp!=null){
            index=temp.next;
            while(index!=null){
                if(temp.Ncontact.getname().compareTo(index.Ncontact.getname())>0){
                    addContact temp1=temp.Ncontact;
                    temp.Ncontact=index.Ncontact;
                    index.Ncontact=temp1;

                }
                index=index.next;

            }
            temp=temp.next;
        }

        for(int i=0;i<size();i++){

            System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", getcontact(i).getid(),getcontact(i).getname(), getcontact(i).getphoneNumber(),getcontact(i).getcompanyName(),getcontact(i).getsalary(), getcontact(i).getbirthday());
//System.out.println(tempname0[i]);

        }

    }
    public void listsalary(){
        if(start.next==null){
            return ;
        }
        Node index=null;
        Node temp=start;
        while(temp!=null){
            index=temp.next;
            while(index!=null){
                if(temp.Ncontact.getsalary()>index.Ncontact.getsalary()){
                    addContact temp1=index.Ncontact;
                    index.Ncontact=temp.Ncontact;
                    temp.Ncontact=temp1;

                }

                index=index.next;
            }

            temp=temp.next;
        }


        for(int i=0;i<size();i++){

            System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", getcontact(i).getid(),getcontact(i).getname(), getcontact(i).getphoneNumber(),getcontact(i).getcompanyName(),getcontact(i).getsalary(), getcontact(i).getbirthday());
//System.out.println(tempname0[i]);

        }

    }

    public void listbirthday(){
        if(start.next==null){
            return;
        }
        Node temp=start;
        Node index=null;
        while(temp!=null){
            index=temp.next;
            while(index!=null){
                int x= Integer.parseInt(temp.Ncontact.getbirthday().substring(0, 4));
                int y= Integer.parseInt(index.Ncontact.getbirthday().substring(0, 4));
                // if( Integer.parseInt(temp.Ncontact.getbirthday().substring(0, 4))> Integer.parseInt(index.Ncontact.getbirthday().substring(0, 4))){

                if(x>y){
                    addContact temp1=index.Ncontact;
                    index.Ncontact=temp.Ncontact;
                    temp.Ncontact=temp1;
                }

                index=index.next;
            }
            temp=temp.next;
        }
        for(int i=0;i<size();i++){

            System.out.printf("\n|%-8s | %-8s | %-8s | %-8s | %-8.2f | %-8s|", getcontact(i).getid(),getcontact(i).getname(), getcontact(i).getphoneNumber(),getcontact(i).getcompanyName(),getcontact(i).getsalary(), getcontact(i).getbirthday());
            //System.out.println(tempname0[i]);

        }





    }














    class Node{

        private addContact Ncontact;
        private Node next;

        Node(addContact contact){
            this .Ncontact=contact;
             this .next=null;

        }

    }


}
