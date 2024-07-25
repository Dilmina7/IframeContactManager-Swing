import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listcontact extends JFrame{
    viewdata viewA;


    JLabel listc;

    JButton list1;
    JButton list2;
    JButton list3;
    JButton list4;

    Listcontact() {
        setTitle("");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listc = new JLabel();
        listc.setText(" CONTACT LIST");
        listc.setHorizontalAlignment(JLabel.CENTER);
        listc.setFont(new Font("",1,45));
        listc. setBackground(Color.BLUE);
        listc.setOpaque(true);
        add(listc, BorderLayout.NORTH);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,1));

        list1 = new JButton("List by name");
        list1.setFont((new Font("",1,20)));
        list1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (viewA == null) {
                    viewA = new viewdata();
                }

                viewA.setVisible(true);
            }
        });
        p1.add(list1);

       list2 = new JButton("List by salary");
       list2.setFont((new Font("",1,20)));
       p1.add(list2);

       list3 = new JButton("list by birthday");
       list3.setFont((new Font("",1,20)));
       p1.add(list3);

        add(p1, BorderLayout.CENTER);


        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        list4 = new JButton("Cancel");
        list4.setFont((new Font("",1,20)));
        p2.add(list4);
        add(p2, BorderLayout.SOUTH);
    }
}
