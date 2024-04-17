
package bank.management.system;

import javax.swing.*;       //Window
import java.awt.*;       //image
import java.awt.event.*;  //for Actionlistener
import java.sql.*; 

public class Login extends JFrame implements ActionListener
{
    
    JButton login,signup,clear;  //Declare globallyy to acess out of constructor in case of Addaction fuction
    JTextField IDTextField;
    JPasswordField passwordTextField; 
    Login()
    {   
        setTitle("Modern College od Engineering!!!");
        setLayout(null);    //for set location of logo as we use custom layout thats why wew are using null
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(300,50,150,150);
        add(label);
        
        ////////////////////////////////////////////////////WElcome////////////////////////////////////////////////////////////
        JLabel text2 = new JLabel("Inventroy Managemnt System");  //using obj text we are setting the sentence in it
        text2.setFont(new Font("Osward", Font.BOLD, 40));
        text2.setBounds(610,130,1000,70);   //postion of text
        add(text2);
        
        JLabel text = new JLabel("Deparment Of Computer Enginering");  //using obj text we are setting the sentence in it
        text.setFont(new Font("Osward", Font.BOLD, 50));
        text.setBounds(460,40,1000,70);   //postion of text
        add(text);
        
        ////////////////////////////////////////////////CARD no////////////////////////////////////////////////////////////////
        JLabel Cardno = new JLabel("ID No. ");  //using obj text we are setting the sentence in it
        Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(670,250,150,30);   //postion of text
        add(Cardno);
        
        //Declare golbbally
        IDTextField  = new JTextField();
        IDTextField.setBounds(820,250,250,30);
        IDTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(IDTextField);
        
        ///////////////////////////////////////PIN/////////////////////////////////////////////////////////////////////////
        
        JLabel pin = new JLabel("Password: ");  //using obj text we are setting the sentence in it
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(670,325,250,30);   //postion of text
        add(pin);
        
        //Declare golbbally
         passwordTextField  = new JPasswordField();
        passwordTextField.setBounds(820,325,250,30);
         passwordTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordTextField);
        
        //Bottun   SIGN In
         login = new JButton("Sign in");
        login.setBounds(720,400,100,30 );
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);  
        login.addActionListener(this);
        add(login);
        
        
        //Bottun   CLEAR DATA
         clear = new JButton("Clear");
        clear.setBounds(800,450,100,30 );
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE); 
        clear.addActionListener(this);
        add(clear);
        
        //Bottun SIGN UP 
         signup = new JButton("Signup");
        signup.setBounds(860,400,100,30 );
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);  
        signup.addActionListener(this);
        add(signup);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        getContentPane().setBackground(Color.WHITE);    //Window related content BG color size of window ,l location, visiblity.
        setSize(1700,900);
        setVisible(true);
        setLocation(0,0);
        
        
    }

    public void actionPerformed(ActionEvent ae)   //class actionevent OBj ae
    {
        if(ae.getSource() == clear )
        {
            IDTextField.setText("");
            passwordTextField.setText("");
        }
        else  if(ae.getSource() == login )
        {
            conn conn1 = new conn();
            String IDnumber = IDTextField.getText();
            String password =passwordTextField.getText();
            String query   = "select * from login where idLogin = '" +IDnumber+"' and  password = '"+password+"'"; 
            
            try 
            {
                ResultSet rs = conn1.s.executeQuery(query);    //Value return by conn1 saved in resultset which come under the sql library
                if(rs.next())
                {
                    setVisible(false);
                    new SignupTwo(IDnumber).setVisible(true);
                    System.out.print(IDnumber + "Login paased");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect ID Number or Password");
                }
                    
                   
            }catch (Exception e)
            {
                System.out.println(e);
            }
;        }
         else  if(ae.getSource() == signup )
        {
            setVisible(false);
            new Signup().setVisible(true);
            
        }
        
        
    }
    
    public static void main(String[] args) 
    {
       new Login();
    }
    
}

