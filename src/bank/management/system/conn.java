//JDBC connectivity
//Register the Driver
//Create Connection
//Crete Statemanet
//Execute Query
//Close


package bank.management.system;

import java.sql.*;

public class conn 
{
    Connection c;   //is OBJ of Connection class
    public Statement s;
    
    public conn()
    {
        try
        {
            //Class.forName(com.mysql.cj.jdbc.Driver);     //Driver Registration done implicity by complier no need to done by our side
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/modern_inventory", "root", "adhish@mysql");   //Connection creation
            s=c.createStatement();
            
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static void main(String[] args) 
    {
     
    } 
}

