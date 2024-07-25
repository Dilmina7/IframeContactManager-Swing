import javax.swing.*;
import java.awt.*;

public class deletecontact extends JFrame {
    JLabel serchcon;

    JTextField serchfield;

    JLabel serchlabel1;
    JLabel serchlabel2;
    JLabel serchlabel3;
    JLabel serchlabel4;
    JLabel serchlabel5;
    JLabel serchlabel6;
    JLabel serchlabel7;

    JButton serchbutton;
    JButton serchbutton1;
    JButton serchbutton3;

    deletecontact(){
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


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,1));


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        serchfield = new JTextField(10);
        serchfield.setFont(new Font("",1,20));
        panel1.add(serchfield);


        JButton updatebutton = new JButton("Serch");
        updatebutton.setFont(new Font("",1,20));
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

        serchbutton = new JButton("Delete");
        serchbutton.setFont(new Font("",1,20));
        panel2.add(serchbutton);

        serchbutton1 = new JButton("Cancel");
        serchbutton1.setFont(new Font("",1,20));
        panel2.add(serchbutton1);


        serchbutton3 = new JButton("Back to Homepage");
        serchbutton3.setFont(new Font("",1,20));
        panel2.add(serchbutton3);


        panel.add(panel2);

        add(panel, BorderLayout.CENTER);


    }

}
