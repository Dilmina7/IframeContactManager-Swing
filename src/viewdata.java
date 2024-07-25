
    import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.sql.*;
    import java.util.*;

    class viewdata extends JFrame{
        private JTable tblCustomerDetails;
        private DefaultTableModel dtm;

        private JLabel titleLabel;

        private JButton btnReload;
        viewdata(){
            setSize(400,300);
            setTitle("View Customer Form");
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            titleLabel=new JLabel("View Customer Form");
            titleLabel.setHorizontalAlignment(JLabel.CENTER);
            titleLabel.setFont(new Font("",1,30));
            add("North",titleLabel);

            String[] columnsName={" Id","Name","contactnumber","company","salary","Birthday"};
            dtm=new DefaultTableModel(columnsName,0);

            tblCustomerDetails=new JTable(dtm);

            JScrollPane tablePane=new JScrollPane(tblCustomerDetails);

            add("Center",tablePane);

            JPanel buttonPanel=new JPanel(); //Default layout ->JPanel --FlowLAyout
            btnReload=new JButton("Reload");
            btnReload.setFont(new Font("",1,20));
            btnReload.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(int i=0;i<homepage2.infomation.size();i++){
                        addContact contactobj=  homepage2.infomation.getcontact(i);
                        Object[] rowData={contactobj.getid(),contactobj.getname(),contactobj.getphoneNumber(),contactobj. getcompanyName(),contactobj.getsalary(),contactobj.getbirthday()};
                        dtm.addRow(rowData);

                    }
                }
            });
            buttonPanel.add(btnReload);
            add("South",buttonPanel);

        }
    }



