
package bank.management.system;


import java.awt.*;
import javax.swing.*;  //Jframe is include in swing class
import java.awt.event.*;
import java.util.Date;



public class SignupTwo extends JFrame implements ActionListener
{
        
        JTextField product_number,seller_name,cost,incharge_name;
        JButton next,skip;
       
        JComboBox campany,income,education,occupation,iCategory,status; 
        String f_id;
        
       SignupTwo(String f_id)
       {
          this.f_id = f_id;
           setLayout(null); //By defalut./....           
           setTitle("Add Inventory Deatils");
        setLayout(null); //By defalut./....           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(710,00,800,800);
        add(label);
           
//        
//           
           JLabel additionalDetails = new JLabel(" Inventory Details ");    //impoer util lib
           additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
           additionalDetails.setBounds(290,80,400,30);      //Set layout should be null.....
           add(additionalDetails);
//           
//           /////////////////////cateogoyr//////////////////////////////////////////
           JLabel iname = new JLabel("Inventory Category: ");    //impoer util lib
           iname.setFont(new Font("Raleway", Font.BOLD, 22));
           iname.setBounds(100,140,150,30);      //Set layout should be null.....
           add(iname);
           
           String valInventory[] = {"Desktop", "CPU", "Projector", "Keyboard","Mouse","Specker","Other"};
           iCategory = new JComboBox(valInventory);
           iCategory.setBounds(300,140,400,30);
           iCategory.setBackground(Color.WHITE);
           add(iCategory);

           
           //////////////////////Company  NAMEE///////////////////////////////////
           JLabel fname = new JLabel("Campany name: ");    //import util lib
           fname.setFont(new Font("Raleway", Font.BOLD, 22));
           fname.setBounds(100,190,200,30);      //Set layout should be null.....
           add(fname);
           
           String valCampany[] = {"DELL", "Lenevo", "ASUS","BENQ","Other"};
           campany = new JComboBox(valCampany);
           campany.setBounds(300,190,400,30);
           campany.setBackground(Color.WHITE);
           add(campany);
          
//           ///////////////////Cost ////////////////////////////////////////////////
           JLabel dob = new JLabel("Cost/Pricing: ");    //impoer util lib
           dob.setFont(new Font("Raleway", Font.BOLD, 22));
           dob.setBounds(100,240,200,30);      //Set layout should be null.....
           add(dob  );
           
           cost = new JTextField();
           cost.setFont(new Font("Raleway", Font.BOLD, 14));
           cost.setBounds(300,240,400,30);
           add(cost);

                 
       

//           ///////////////Product Status///////////////////
           JLabel email = new JLabel("Catergories: ");    //impoer util lib
           email.setFont(new Font("Raleway", Font.BOLD, 22));
           email.setBounds(100,315,200,30);      //Set layout should be null.....
           add(email);
           
           String valstatus[] = {"New Purchased", "Renewd", "Rent","Donated","Others"};
           status = new JComboBox(valstatus);
           status.setBounds(300,310,400,30);
           status.setBackground(Color.WHITE);
           add(status);
           

           ////////////Product  number/////////////////
           JLabel address = new JLabel("Product Number:");    //import util lib
           address.setFont(new Font("Raleway", Font.BOLD, 22));
           address.setBounds(100,415,200,30);      //Set layout should be null.....
           add(address);
           
            product_number = new JTextField();
           product_number.setFont(new Font("Raleway", Font.BOLD, 14));
           product_number.setBounds(300,415,405,30);
           add(product_number);
           
           ////////////////////////////////////Seller name /////////////////////
           JLabel city = new JLabel("Seller Name: ");    //impoer util lib
           city.setFont(new Font("Raleway", Font.BOLD, 22));
           city.setBounds(100,465,200,30);      //Set layout should be null.....
           add(city);
           
           seller_name = new JTextField();
           seller_name.setFont(new Font("Raleway", Font.BOLD, 14));
           seller_name.setBounds(300,465,400,30);
           add(seller_name);
           
           
            ////////////////////////////////////Seller name /////////////////////
           JLabel Inchar_name = new JLabel("Incharge Faculty  Name: ");    //impoer util lib
           Inchar_name.setFont(new Font("Raleway", Font.BOLD, 22));
           Inchar_name.setBounds(100,520,200,30);      //Set layout should be null.....
           add(Inchar_name);
           
           incharge_name = new JTextField();
           incharge_name.setFont(new Font("Raleway", Font.BOLD, 14));
           incharge_name.setBounds(300,520,400,30);
           add(incharge_name);


            
           
           /////////////////////Add BUTTON //////////////////////////////////
           
           next = new JButton("Add Inventory");
           next.setBackground(Color.BLACK);
           next.setForeground(Color.WHITE);
           next.setFont(new Font("Raleway", Font.BOLD, 14));
           next.setBounds(520,616,180,30);
           next.addActionListener(this);
           add(next);
           
           skip = new JButton("Skip Inventroy Entry");
           skip.setBackground(Color.BLACK);
           skip.setForeground(Color.WHITE);
           skip.setFont(new Font("Raleway", Font.BOLD, 14));
           skip.setBounds(120,616,180,30);
           skip.addActionListener(this);
           add(skip);
           
           
           ////////////////////////////////Window related data////////////////////////////////////////
           getContentPane().setBackground(Color.WHITE);
           //Under JFrame class
           setSize(1700,900);
           setLocation(00,00);
           setVisible(true);
       }
       
       
       public void actionPerformed(ActionEvent ae)
       {
            if(ae.getSource() == next )
            {
            String sCategory = (String)iCategory.getSelectedItem();  
            String sProduct_No  = product_number.getText();
            String sCompany = (String)campany.getSelectedItem();   //GetUICOmp determine textfield to we have convbewrt it
            String sCost = (String)cost.getText();
            String sStatus =(String)status.getSelectedItem();
            String sSeller_name = (String)seller_name.getText();
            String sIncharge_name = (String)incharge_name.getText();
            String Sdob = "Date"; 
            String Sdays = "NA";

    //        ,seller_name,cost,incharge_name;
           try
           {
              conn c = new conn();
              String query = "insert into inventory values ('" +sCategory+"' , '"+sProduct_No+"', '"+sCompany+"', '"+sCost+"', '"+sStatus+"','"+sSeller_name+"','"+sIncharge_name+"','"+Sdob+"','"+Sdays+"')";
              c.s.executeUpdate(query);
              System.out.print("Hi this is Adhish...!!");
               //Signup3 Object
              JOptionPane.showMessageDialog(this, "Record Added");

    //            frame = new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(null, "COnfirm Invetory!!","Inventory System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            {
                setVisible(false);
                new JTable1(f_id).setVisible(true); 
            }


            }

           catch(Exception e)
           {
               System.out.println(e);
               JOptionPane.showMessageDialog(null, e);
           }
        }
        else
            {
                JOptionPane.showMessageDialog(this, "Inventory Details!!");
                setVisible(false);
                new JTable1(f_id).setVisible(true); 
                System.out.print(f_id + "Stwo passed");
            }        
       
    }
       
    public static void main(String[] args) 
    {
     new SignupTwo(""); 
    } 
}

