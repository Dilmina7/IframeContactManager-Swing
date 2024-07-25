import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class homepage2 extends JFrame{



    public static contactlist infomation = new contactlist();

  // public static contactlist info2=infomation;

    form1 form;
    viewdata datavv;
    updateform updata;
    serchcontact searchA;
    deletecontact deleteA;
    Listcontact listA;

    JButton btnAddcontact;
    JButton btnUpdatecontact;
    JButton btnSerchcontact;
    JButton btnDeletecontact;
    JButton btnViewcontact;
    JButton btnExit;

    JLabel lable1;


    public homepage2(){
        setTitle("");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1,2));


       // JPanel panel1 = new JPanel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\ASUS\\MYJAVA VS\\IFC Manager\\guicontact\\New folder\\Screenshot 2024-07-09 212104.png\\").getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
        add(label);





        JPanel buttonpanel=new JPanel();
        buttonpanel.setLayout(new GridLayout(7,1));
        buttonpanel. setBackground(Color.BLUE);
        buttonpanel.setOpaque(true);

        lable1=new JLabel();
        lable1.setText("Home Page");
        lable1.setHorizontalAlignment(JLabel.CENTER);
        lable1.setFont(new Font("",1,25));
        buttonpanel.add(lable1);

        btnAddcontact=new JButton("Add new contact");
         btnAddcontact.setFont(new Font("",1,15));
         btnAddcontact.setPreferredSize(new Dimension(230, 30));

         btnAddcontact.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 if(form==null){
                     form=new form1();
                 }

                  form.setVisible(true);

             }

         });
       // btnAddcontact.setBounds(270,50,100,30);



        JPanel buttonpanel3=new JPanel();
        buttonpanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonpanel3. setBackground(Color.BLUE);
        buttonpanel3.setOpaque(true);


        buttonpanel3.add(btnAddcontact);
        buttonpanel.add(buttonpanel3);


        btnUpdatecontact=new JButton("Update contact");
         btnUpdatecontact.setFont(new Font("",1,15));
       // btnUpdatecontact.setBounds(270,40,100,30);
        btnUpdatecontact.setPreferredSize(new Dimension(230, 30));
        btnUpdatecontact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                if(updata==null){
                    updata=new updateform();
                }

                updata.setVisible(true);
            }

        });


        JPanel buttonpanel4=new JPanel();
        buttonpanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonpanel4. setBackground(Color.BLUE);
        buttonpanel4.setOpaque(true);


        buttonpanel4.add(btnUpdatecontact);
        buttonpanel.add(buttonpanel4);

        btnSerchcontact=new JButton("Serch contact");
        btnSerchcontact.setFont(new Font("",1,15));
       // btnSerchcontact.setBounds(270,30,100,30);
        btnSerchcontact.setPreferredSize(new Dimension(230, 30));
        btnSerchcontact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(searchA==null){
                    searchA=new serchcontact();
                }

                searchA.setVisible(true);
            }

        });
        JPanel buttonpanel5=new JPanel();
       buttonpanel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonpanel5. setBackground(Color.BLUE);
        buttonpanel5.setOpaque(true);

        buttonpanel5.add(btnSerchcontact);
        buttonpanel.add(buttonpanel5);
        //buttonpanel.add(btnSerchcontact);


        //buttonpanel.add(btnSerchcontact);

        btnDeletecontact=new JButton("Delete contact");
         btnDeletecontact.setFont(new Font("",1,15));
       // btnDeletecontact.setBounds(270,20,100,30);
        btnDeletecontact.setPreferredSize(new Dimension(230, 30));
        btnDeletecontact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(deleteA==null){
                    deleteA=new deletecontact();
                }

                deleteA.setVisible(true);
            }

        });

        JPanel buttonpanel6=new JPanel();
        buttonpanel6.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonpanel6. setBackground(Color.BLUE);
        buttonpanel6.setOpaque(true);


        buttonpanel6.add(btnDeletecontact);
        buttonpanel.add(buttonpanel6);

        btnViewcontact=new JButton("View contact");
        btnViewcontact.setFont(new Font("",1,15));
       // btnViewcontact.setBounds(270,10,100,30);
        btnViewcontact.setPreferredSize(new Dimension(230, 30));

        btnViewcontact.addActionListener(new ActionListener() {
                                             public void actionPerformed(ActionEvent e) {
                                                 if (listA == null) {
                                                     listA = new Listcontact();
                                                 }

                                                 listA.setVisible(true);
                                             }
                                         });

        JPanel buttonpanel7=new JPanel();
        buttonpanel7.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonpanel7. setBackground(Color.BLUE);
        buttonpanel7.setOpaque(true);


        buttonpanel7.add(btnViewcontact);
        buttonpanel.add(buttonpanel7);



        //JPanel buttonpanel2=new JPanel();
       // buttonpanel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
       // FlowLayout flowlayout=new FlowLayout(FlowLayout.RIGHT);


        JPanel buttonpanel2=new JPanel();
        buttonpanel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnExit=new JButton("Exit ");
        // btnExit.setFont(new Font("",1,15));
        btnExit.setBounds(270,10,100,30);
        buttonpanel2. setBackground(Color.BLUE);
        buttonpanel2.setOpaque(true);

        buttonpanel2.add(btnExit);
        buttonpanel.add(buttonpanel2);



        add(buttonpanel);

//        btnExit=new JButton("Exit contact");
//        // btnExit.setFont(new Font("",1,15));
//        btnExit.setBounds(270,10,100,30);
//        add(btnExit,BorderLayout.SOUTH);

 // JImageComponent ic = new JImageComponent(myImageGoesHere);
  // imagePanel.add(ic);
//        JLabel label = new JLabel();
//        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\ASUS\\MYJAVA VS\\IFC Manager\\guicontact\\New folder\\Screenshot 2024-07-09 212104.png\\").getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
//        add(label);

    }



    public static void main(String args[]){
        new homepage2().setVisible(true);
//
    }



}


