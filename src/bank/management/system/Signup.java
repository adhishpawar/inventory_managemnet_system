
package bank.management.system;


import java.awt.*;
import javax.swing.*;  //Jframe is include in swing class
import java.util.*;   ///to import random funtion
import com.toedter.calendar.JDateChooser;   //To moddify calender 
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Signup extends JFrame implements ActionListener
{
        
        JTextField  nameTextField,emailf,passTextField;
        JDateChooser date1Chooser;
        JButton next;
        JRadioButton male,female,other1,teaching,non_teaching;
        
       Signup()
       {
        setLayout(null); //By defalut./....           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(710,00,800,800);
        add(label);             
               

           
//           JLabel formno = new JLabel("Applicaion Form No. " + random );    //impoer util lib
//           formno.setFont(new Font("Raleway", Font.BOLD, 38));
//           formno.setBounds(140,20,600,40);      //Set layout should be null.....
//           add(formno);
           
           JLabel personDetails = new JLabel("Faculty Details ");    //impoer util lib
           personDetails.setFont(new Font("Raleway", Font.BOLD, 55));
           personDetails.setBounds(190,60,500,55);      //Set layout should be null.....
           add(personDetails);
           
           /////////////////////NAME//////////////////////////////////////////
           JLabel name = new JLabel("Name: ");    //impoer util lib
           name.setFont(new Font("Raleway", Font.BOLD, 22));
           name.setBounds(100,175,100,30);      //Set layout should be null.....
           add(name);
           
           nameTextField = new JTextField();
           nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
           nameTextField.setBounds(300,175,400,30);
           add(nameTextField);
           
           //////////////////////Teaching or Non teching///////////////////////////////////
           JLabel role = new JLabel("Role: ");    //impoer util lib
           role.setFont(new Font("Raleway", Font.BOLD, 22));
           role.setBounds(100,230,200,30);      //Set layout should be null.....
           add(role );
       
            teaching = new JRadioButton("Teaching");
           teaching.setBounds(300,230,100,40);
           teaching.setBackground( Color.WHITE);
           add(teaching);
           
            non_teaching = new JRadioButton("Non-Teaching");
           non_teaching.setBounds(450,230,200,40);
           non_teaching.setBackground(Color.WHITE);
           add(non_teaching);

           ButtonGroup rolegroup = new ButtonGroup();
           rolegroup.add(teaching);
           rolegroup.add(non_teaching);
           
           
           ///////////////////DOB////////////////////////////////////////////////
           JLabel dob = new JLabel("Date Of  Birth: ");    //impoer util lib
           dob.setFont(new Font("Raleway", Font.BOLD, 22));
           dob.setBounds(100,275,200,30);      //Set layout should be null.....
           add(dob  );
           
           date1Chooser = new JDateChooser();
           date1Chooser.setBounds(300,275,400,30);
           date1Chooser.setForeground(new Color(105,105,105));
           add(date1Chooser);
           
           /////////////////////Gender/////////////////////////////////////////
           JLabel gender = new JLabel("Gender: ");    //impoer util lib
           gender.setFont(new Font("Raleway", Font.BOLD, 22));
           gender.setBounds(100,335,200,30);      //Set layout should be null.....
           add(gender );
       
            male = new JRadioButton("Male");
           male.setBounds(300,335,100,40);
           male.setBackground( Color.WHITE);
           add(male);
           
            female = new JRadioButton("Female");
           female.setBounds(450,335,100,40);
           female.setBackground(Color.WHITE);
           add(female);
           
            other1 = new JRadioButton("Other");
           other1.setBounds(600,335,100,40);
           other1.setBackground( Color.WHITE);
           add(other1);
           
           ButtonGroup gendergroup = new ButtonGroup();
           gendergroup.add(male);
           gendergroup.add(female);
           gendergroup.add(other1);
           
           
           ///////////////EMAIL///////////////////
           JLabel email = new JLabel("E-Mail Address: ");    //impoer util lib
           email.setFont(new Font("Raleway", Font.BOLD, 22));
           email.setBounds(100,410,200,30);      //Set layout should be null.....
           add(email);
           
           emailf = new JTextField();
           emailf.setFont(new Font("Raleway", Font.BOLD, 14));
           emailf.setBounds(300,410,400,30);
           add(emailf);
           
 
           JLabel pass = new JLabel("Password: ");    //impoer util lib
           pass.setFont(new Font("Raleway", Font.BOLD, 22));
           pass.setBounds(100,460,250,30);      //Set layout should be null.....
           add(pass);
           
           passTextField = new JTextField();
           passTextField.setFont(new Font("Raleway", Font.BOLD, 14));
           passTextField.setBounds(300,460,400,30);
           add(passTextField);
           
           /////////////////////NEXT BUTTON //////////////////////////////////
           
            next = new JButton("Submit");
           next.setBackground(Color.BLACK);
           next.setForeground(Color.WHITE);
           next.setFont(new Font("Raleway", Font.BOLD, 14));
           next.setBounds(370,510,130,30);
           next.addActionListener(this);
           add(next);
           
           
           ////////////////////////////////Window related data////////////////////////////////////////
           getContentPane().setBackground(Color.WHITE);
           //Under JFrame class
           setSize(1700,900);
           setLocation(0,0);
           setVisible(true);
       }
       
       
       
       public void actionPerformed(ActionEvent ae)
       {
        
        String name =nameTextField.getText();  //oppposite work done by settext to set values
       
        String dob = ((JTextField) date1Chooser.getDateEditor().getUiComponent()).getText();  //GetUICOmp determine textfield to we have convbewrt it
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }
        else if(female.isSelected())
        {
            gender = "Female";
        }
        else if(other1.isSelected())
        {
            gender = "Other1";
        }
        
        String role = null;
        if(teaching.isSelected())
        {
            role = "Teaching";
        }
        else if(non_teaching.isSelected())
        {
            role = "Non-Teaching";
        }
        
        String email = emailf.getText();
        
        Random random = new Random();
        String IDnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        String password=passTextField.getText(); 
//       

       try
       {
           if(name.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Name is Required");
           }
           else if(email.equals(""))
           {
             JOptionPane.showMessageDialog(null, "EMAIL is Required");
           }
           else 
           {
               conn c = new conn();
               String query = "insert into facreg values ('"+name+"','"+dob+"', '"+gender+"','"+email+"','"+role+"','"+IDnumber+"')";
               String query1= "insert into login values ('"+IDnumber+"','"+password+"')";
               c.s.executeUpdate(query);
               c.s.executeUpdate(query1);
               
             
                nameTextField.setText("");  //oppposite work done by settext to set values
                emailf.setText("");

//                JOptionPane.showMessageDialog(null, "ID Number: " + IDnumber + "\n Password: " + password);
//                System.exit(0);//After the exit window will close
                
            
                if(JOptionPane.showConfirmDialog(null, "ID Number: " + IDnumber + "\n Password: " + password,"Inventory System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                    new SignupTwo(IDnumber).setVisible(true);
                }

                
                setVisible(false);
                
                

            }
           
       }    
       catch (SQLException ex) 
       {
           Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error!!!");
       }
       catch(HeadlessException e)
       {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, e);
       }
       
//        catch(Exception e)
        
       
  } 
    
       
    public static void main(String[] args) 
    {
     new Signup(); 
    } 
}

