import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//javax.swing.JOptionPane.showMessageDialog using;


import java.util.EventListener;

public class form1 extends JFrame {


    JLabel addContact;
    JLabel id;


    JTextField txtname;
    JTextField txtphone;
    JTextField txtcompany;
    JTextField txtsalary;
    JTextField txtbirthday;
    JTextField txtid;

    JButton btnadd;
    JButton btncancel;
    JButton btnback;
   // String b=idgenarateA.idgenarate();

    public form1() {


        setTitle("");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        addContact = new JLabel();
        addContact.setText("ADD CONTACT");
        addContact.setHorizontalAlignment(JLabel.CENTER);
        addContact.setFont(new Font("", 1, 45));

        addContact.setBackground(Color.BLUE);
        addContact.setOpaque(true);
        add(addContact, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 1));

        JPanel name0 = new JPanel();
        name0.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel id = new JLabel("Contact ID");
        id.setHorizontalAlignment(JLabel.CENTER);
        id.setFont(new Font("", 1, 20));

        name0.add(id);
        panel.add(name0);


        JPanel name1 = new JPanel();
        name1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel name = new JLabel("Name");
        name.setHorizontalAlignment(JLabel.CENTER);
        name.setFont(new Font("", 0, 20));
        name1.add(name);
        panel.add(name1);


        JPanel name2 = new JPanel();
        name2.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel contactnumber = new JLabel("Contact Number");
        contactnumber.setHorizontalAlignment(JLabel.CENTER);
        contactnumber.setFont(new Font("", 0, 20));
        name2.add(contactnumber);
        panel.add(name2);


        JPanel name3 = new JPanel();
        name3.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel company = new JLabel("Company");
        company.setHorizontalAlignment(JLabel.CENTER);
        company.setFont(new Font("", 0, 20));
        name3.add(company);
        panel.add(name3);


        JPanel name4 = new JPanel();
        name4.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel salary = new JLabel("Salary");
        salary.setHorizontalAlignment(JLabel.CENTER);
        salary.setFont(new Font("", 0, 20));
        name4.add(salary);
        panel.add(name4);


        JPanel name5 = new JPanel();
        name5.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel birthday = new JLabel("Birthday");
        birthday.setHorizontalAlignment(JLabel.CENTER);
        birthday.setFont(new Font("", 0, 20));
        name5.add(birthday);
        panel.add(name5);

        add(panel, BorderLayout.WEST);


        JPanel panalsqure = new JPanel();
        panalsqure.setLayout(new GridLayout(9, 1));

        txtid = new JTextField(10);
        txtid.setFont(new Font("", 1, 20));
        txtid.setText(idgenarateA.idgenarate());
        panalsqure.add(txtid);


        txtname = new JTextField(10);
        txtname.setFont(new Font("", 1, 20));
        panalsqure.add(txtname);

        txtphone = new JTextField(10);
        txtphone.setFont(new Font("", 1, 20));
        panalsqure.add(txtphone);

        txtcompany = new JTextField(10);
        txtcompany.setFont(new Font("", 1, 20));
        panalsqure.add(txtcompany);

        txtsalary = new JTextField(10);
        txtsalary.setFont(new Font("", 1, 20));
        panalsqure.add(txtsalary);

        txtbirthday = new JTextField(10);
        txtbirthday.setFont(new Font("", 1, 20));
        panalsqure.add(txtbirthday);


//

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

        btnadd = new JButton("ADD contact");
        btnadd.setFont(new Font("", 1, 15));
        btnadd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String id8 = txtid.getText();

                String name8 = txtname.getText();
                String phone8 = txtphone.getText();
//                if (!checkNumber.checkedphonenumber(phone8)) {
//                    JOptionPane optionPane = new JOptionPane("Phone number is not valid!!!", JOptionPane.WARNING_MESSAGE);
//                    JDialog dialog = optionPane.createDialog("Warning!");
//                    dialog.setAlwaysOnTop(true); // to show top of all other application
//                    dialog.setVisible(true);
//
//                    nullsec();
//
//
//
//                    form1.this.dispose();
//                    return;
//
//                }
                String company8 = txtcompany.getText();
                Double salary8 = Double.parseDouble(txtsalary.getText());




                String birthday8 = txtbirthday.getText();
//                if (!checkbirthday.checkedvalidbirthday(birthday8)) {
//                    JOptionPane optionPane1 = new JOptionPane("Birthday is not valid!!!", JOptionPane.WARNING_MESSAGE);
//                    JDialog dialog = optionPane1.createDialog("Warning!");
//                    dialog.setAlwaysOnTop(true); // to show top of all other application
//                    dialog.setVisible(true);
//
//                    nullsec();
//
//
//
//                    form1.this.dispose();
//                    return;
//                }


              //  if (checkNumber.newnum.checkedphonenumber(phone8) && checkbirthday.newbirthdy.checkedvalidbirthday(birthday8)) {

                    addContact contactinfo = new addContact(id8, name8, phone8, company8, salary8, birthday8);

                    homepage2.infomation.add(contactinfo);


                    txtid.setText(idgenarateA.idgenarate());
                   // b=idgenarateA.idgenarate();

                    nullsec();
              //  }


//



//                if (checkNumber.checkedphonenumber(txtphone.getText()) && checkbirthday.checkedvalidbirthday(txtbirthday.getText())) {
//                    txtid.setText(idgenarateA.idgenarate());
//
//                    nullsec();
//                }

            }


        });

        buttons.add(btnadd);

//        buttons.add(btnadd);


        btncancel = new JButton("Cancel");
        btncancel.setFont(new Font("", 1, 15));
        btncancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              nullsec();


                form1.this.dispose();

            }
        });


        buttons.add(btncancel);


        panalsqure.add("South", buttons);

        JPanel buttons2 = new JPanel();
        buttons2.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnback = new JButton("Back to homepage");
        btnback.setFont(new Font("", 1, 21));
        btnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {




                form1.this.dispose();
            }
        });

        buttons2.add(btnback);
        panalsqure.add(buttons2);

        add(panalsqure, BorderLayout.CENTER);




    }



public void nullsec(){
    txtname.setText(" ");

    txtphone.setText(" ");

    txtcompany.setText(" ");

    txtsalary.setText(" ");

    txtbirthday.setText(" ");

}






}










//    public static void main(String args[]) {
//        new form1().setVisible(true);
//
//
//