/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author SPN RAO
 */
import java.sql.*;
class connectionManager
{
    static Connection conn= null;
    static ResultSet rs=null;
    static PreparedStatement pstmt=null;
    public static void connect()
    {
        //Connection c;
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
}