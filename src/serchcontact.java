import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.EventListener;

public class serchcontact extends JFrame{
    JLabel serchcon;

    serchcontact sechB;

    JTextField serchfield;

    JLabel serchlabel1;
    JLabel serchlabel2;
    JLabel serchlabel3;
    JLabel serchlabel4;
    JLabel serchlabel5;
    JLabel serchlabel6;
    JLabel serchlabel7;

    JTextField serchfield2;
    JTextField serchfield3;
    JTextField serchfield4;
    JTextField serchfield5;
    JTextField serchfield6;
    JTextField serchfield7;
    JLabel serchlabel8;
    JLabel serchlabel9;

    JButton serchbutton;


    serchcontact(){
        setTitle("");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        serchcon = new JLabel();
        serchcon.setText("SEARCH CONTACT");
        serchcon.setHorizontalAlignment(JLabel.CENTER);
        serchcon.setFont(new Font("",1,45));
        serchcon. setBackground(Color.BLUE);
        serchcon.setOpaque(true);
        add(serchcon, BorderLayout.NORTH);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(9,1));


        //=========================================================
        serchlabel8 = new JLabel("");
        serchlabel8.setFont(new Font("",1,20));
        panel4.add(serchlabel8);

        serchlabel9 = new JLabel("");
        serchlabel9.setFont(new Font("",1,20));
        panel4.add(serchlabel9);
//==============================================================


        serchfield2 = new JTextField(10);
        serchfield2.setFont(new Font("",1,20));

        panel4.add(serchfield2);

        serchfield3 = new JTextField(10);
        serchfield3.setFont(new Font("",1,20));

        panel4.add(serchfield3);

        serchfield4 = new JTextField(10);
        serchfield4.setFont(new Font("",1,20));

        panel4.add(serchfield4);

        serchfield5 = new JTextField(10);
        serchfield5.setFont(new Font("",1,20));

        panel4.add(serchfield5);

        serchfield6 = new JTextField(10);
        serchfield6.setFont(new Font("",1,20));

        panel4.add(serchfield6);

        serchfield7 = new JTextField(10);
        serchfield7.setFont(new Font("",1,20));

        panel4.add(serchfield7);

        add(panel4,BorderLayout.CENTER);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,1));


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        serchfield = new JTextField(10);
        serchfield.setFont(new Font("",1,20));
        panel1.add(serchfield);


//        if(x==-1){
//            JOptionPane optionPane = new JOptionPane("Phone number is not valid!!!", JOptionPane.WARNING_MESSAGE);
//            JDialog dialog = optionPane.createDialog("Warning!");
//            dialog.setAlwaysOnTop(true); // to show top of all other application
//            dialog.setVisible(true);
//        }


        JButton updatebutton = new JButton("Serch");
        updatebutton.setFont(new Font("",1,20));
        updatebutton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {

               int x=homepage2.infomation.serch(serchfield.getText());
               if (homepage2.infomation != null && homepage2.infomation.size() > 0) {


                   serchfield2.setText(homepage2.infomation.getcontact(x).getid());
                   serchfield3.setText(homepage2.infomation.getcontact(x).getname());
                   serchfield4.setText(homepage2.infomation.getcontact(x).getphoneNumber());
                   serchfield5.setText(homepage2.infomation.getcontact(x).getcompanyName());
                   serchfield6.setText(Double.toString(homepage2.infomation.getcontact(x).getsalary()));
                   serchfield7.setText(homepage2.infomation.getcontact(x).getbirthday());
               }
           }
        });








        panel1.add(updatebutton);

        panel.add(panel1);

        //
            serchlabel1 = new JLabel("");
        serchlabel1.setFont(new Font("",1,20));
        panel.add(serchlabel1);

        serchlabel2 = new JLabel(" Contact ID");
        serchlabel2.setFont(new Font("",1,20));
        panel.add(serchlabel2);

        serchlabel3 = new JLabel(" Name");
        serchlabel3.setFont(new Font("",1,20));
        panel.add(serchlabel3);

        serchlabel4 = new JLabel(" Contact Number");
        serchlabel4.setFont(new Font("",1,20));
        panel.add(serchlabel4);

        serchlabel5 = new JLabel(" Company");
        serchlabel5.setFont(new Font("",1,20));
        panel.add(serchlabel5);


        serchlabel6 = new JLabel(" Salary");
        serchlabel6.setFont(new Font("",1,20));
        panel.add(serchlabel6);

        serchlabel7 = new JLabel(" Birthday");
        serchlabel7.setFont(new Font("",1,20));
        panel.add(serchlabel7);


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        serchbutton = new JButton("Back to Homepage");
        serchbutton.setFont(new Font("",1,20));
        serchbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               serchcontact.this.dispose();
            }
        });
        panel2.add(serchbutton);
        panel.add(panel2);

        add(panel, BorderLayout.WEST);






//        if(homepage2.infomation.size()<0){
//            serchfield2.setText(homepage2.infomation.getcontact(x).getid());
//            serchfield3.setText(homepage2.infomation.getcontact(x).getname());
//            serchfield4.setText(homepage2.infomation.getcontact(x).getphoneNumber());
//            serchfield5.setText(homepage2.infomation.getcontact(x).getcompanyName());
//            serchfield6.setText( Double.toString(homepage2.infomation.getcontact(x).getsalary()));
//            serchfield7.setText(homepage2.infomation.getcontact(x).getbirthday());


        }


    }


