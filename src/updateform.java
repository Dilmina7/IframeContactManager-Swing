import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class updateform extends JFrame{
    JLabel updatelabel;

   JTextField updatefield;

   JLabel updatelabel1;
   JLabel updatelabel2;
   JLabel updatelabel3;
   JLabel updatelabel4;
   JLabel updatelabel5;
   JLabel updatelabel6;
  JLabel updatelabel7;
  JLabel updatelabel8;
  JLabel updatelabel9;
  JLabel updatelabel10;

    JButton upDelete;
    JButton upCanclle;
    JButton upBack;

    JTextField updatefield1;
    JTextField updatefield2;
    JTextField updatefield3;
    JTextField updatefield4;
    JTextField updatefield5;
    JTextField updatefield6;


    public updateform(){

        setTitle("");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        updatelabel = new JLabel();
        updatelabel.setText("Update CONTACT");
        updatelabel.setHorizontalAlignment(JLabel.CENTER);
        updatelabel.setFont(new Font("",1,45));
        updatelabel. setBackground(Color.BLUE);
        updatelabel.setOpaque(true);
        add(updatelabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,1));



        JPanel panalsqure = new JPanel();
        panalsqure.setLayout(new GridLayout(10, 1));

//        updatelabel10 = new JLabel("");
//        updatelabel10.setFont(new Font("",1,20));
//        panalsqure.add(updatelabel10);

        updatelabel8 = new JLabel("");
        updatelabel8.setFont(new Font("",1,20));
        panalsqure.add(updatelabel8);

        updatelabel9 = new JLabel("");
        updatelabel9.setFont(new Font("",1,20));
        panalsqure.add(updatelabel9);

        updatefield1 = new JTextField(10);
        updatefield1.setFont(new Font("", 1, 20));
      //  updatefield1.setText(idgenarateA.idgenarate());
        panalsqure.add(updatefield1);


        updatefield2 = new JTextField(10);
        updatefield2.setFont(new Font("", 1, 20));
        panalsqure.add(updatefield2);

        updatefield3 = new JTextField(10);
        updatefield3.setFont(new Font("", 1, 20));
        panalsqure.add(updatefield3);

        updatefield4 = new JTextField(10);
        updatefield4.setFont(new Font("", 1, 20));
        panalsqure.add(updatefield4);

        updatefield5 = new JTextField(10);
        updatefield5.setFont(new Font("", 1, 20));
        panalsqure.add(updatefield5);

        updatefield6 = new JTextField(10);
        updatefield6.setFont(new Font("", 1, 20));
        panalsqure.add(updatefield6);

      add(panalsqure, BorderLayout.EAST);



      JPanel panel1 = new JPanel();
      panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
      updatefield = new JTextField(10);
      updatefield.setFont(new Font("",1,20));
      panel1.add(updatefield);



//

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));


        JButton updatebutton = new JButton("Serch");
        updatebutton.setFont(new Font("",1,20));
        updatebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int x=homepage2.infomation.serch(updatefield.getText());
                if (homepage2.infomation != null && homepage2.infomation.size() > 0) {


                    updatefield1.setText(homepage2.infomation.getcontact(x).getid());
                    updatefield2.setText(homepage2.infomation.getcontact(x).getname());
                    updatefield3.setText(homepage2.infomation.getcontact(x).getphoneNumber());
                    updatefield4.setText(homepage2.infomation.getcontact(x).getcompanyName());
                   updatefield5.setText(Double.toString(homepage2.infomation.getcontact(x).getsalary()));
                    updatefield6.setText(homepage2.infomation.getcontact(x).getbirthday());
                }
            }
        });





        panel1.add(updatebutton);

        panel.add(panel1);

      //
        updatelabel7 = new JLabel("");
        updatelabel7.setFont(new Font("",1,20));
        panel.add(updatelabel7);

        updatelabel1 = new JLabel(" Contact ID");
        updatelabel1.setFont(new Font("",1,20));
        panel.add(updatelabel1);

        updatelabel2 = new JLabel(" Name");
        updatelabel2.setFont(new Font("",1,20));
        panel.add(updatelabel2);

        updatelabel3 = new JLabel(" Contact Number");
        updatelabel3.setFont(new Font("",1,20));
        panel.add(updatelabel3);

        updatelabel4 = new JLabel(" Company");
        updatelabel4.setFont(new Font("",1,20));
        panel.add(updatelabel4);


       updatelabel5 = new JLabel(" Salary");
       updatelabel5.setFont(new Font("",1,20));
       panel.add(updatelabel5);

       updatelabel6 = new JLabel(" Birthday");
       updatelabel6.setFont(new Font("",1,20));
       panel.add(updatelabel6);




        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

      upDelete = new JButton("Delete");
      upDelete.setFont(new Font("",1,20));
      panel2.add(upDelete);

      upCanclle = new JButton("Canclle");
      upCanclle.setFont(new Font("",1,20));
      panel2.add(upCanclle);

//

      panel.add(panel2);

      JPanel panel3 = new JPanel();
      panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        upBack = new JButton("Back To Homepage");
     upBack.setFont(new Font("",1,18));
        panel3.add(upBack, BorderLayout.SOUTH);

        panel.add(panel3);



        add(panel, BorderLayout.CENTER);







    }
    public  void nullsec(){
        updatefield1.setText("");

        updatefield2.setText(" ");

        updatefield3.setText(" ");

        updatefield4.setText(" ");

       updatefield5.setText(" ");

        updatefield6.setText(" ");

    }

//    public static void main(String args[]){
//        new updateform().setVisible(true);
//    }
}
