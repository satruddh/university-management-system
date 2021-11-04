 
import java.sql.*;
import java.util.Vector;
class faculty_db
{
    private static String err="";
    public static boolean addFaculty(Faculty f)
    {
        connectionManager cm = new connectionManager();
        cm.connect();
        try
        {
            String query="insert into faculty(id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin) values( ?,?,?,?,?,?,?,?,?,?,curdate())";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,f.getID());
            cm.pstmt.setString(2,f.getName());
            cm.pstmt.setDate(3,Date.valueOf(f.getDOBSQL()));
            cm.pstmt.setString(4,String.valueOf(f.getGender()));
            cm.pstmt.setString(5,f.getEmail());
            cm.pstmt.setString(6,String.valueOf(f.getMob()));
            cm.pstmt.setString(7,f.getAddress());
            cm.pstmt.setInt(8,f.getPIN());
            cm.pstmt.setString(9,f.getDesignation());
            cm.pstmt.setString(10,f.getDepartment());
            cm.pstmt.executeUpdate();
            query=" insert into faculty_count values(?,?)";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,f.getDesignation());
            cm.pstmt.setString(2,f.getDepartment());
            cm.pstmt.executeUpdate();
            query="insert into users (name,pass,type) values(?,\"12345\",\"faculty\")";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,f.getID());
            cm.pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }
    public static boolean updFaculty(Faculty f)
    {
        connectionManager cm = new connectionManager();
        cm.connect();
        try
        {
            String query="update faculty set name=?,dob=?,gender=?,email=?,mob=?,address=?,pin=?,designation=?,department=? where id=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(10,f.getID());
            cm.pstmt.setString(1,f.getName());
            cm.pstmt.setDate(2,java.sql.Date.valueOf(f.getDOBSQL()));
            cm.pstmt.setString(3,String.valueOf(f.getGender()));
            cm.pstmt.setString(4,f.getEmail());
            cm.pstmt.setString(5,String.valueOf(f.getMob()));
            cm.pstmt.setString(6,f.getAddress());
            cm.pstmt.setInt(7,f.getPIN());
            cm.pstmt.setString(8,f.getDesignation());
            cm.pstmt.setString(9,f.getDepartment());
            cm.pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }
    public static Faculty getRecord(String ID)
    {
        connectionManager cm = new connectionManager();
        Faculty f =null;
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where id=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,ID);
            cm.rs=cm.pstmt.executeQuery();
            if(cm.rs.next())
            {
                f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
            }
            else
                f=null;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return f;
    }
    public static Vector<Vector> getRecord(String dep,String desg,int year)
    {
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where department=? and year(YearOfJoin)=? and designation=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,dep);
            cm.pstmt.setString(3,desg);
            cm.pstmt.setInt(2,year);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    public static Vector<Vector> getRecordOnDepNDesg(String dep,String desg)
    {
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where department=? and designation=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,dep);
            cm.pstmt.setString(2,desg);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    public static Vector<Vector> getRecordOnDepNYear(String dep,int year)
    {
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where department=? and year(YearOfJoin)=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,dep);
            cm.pstmt.setInt(2,year);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    public static Vector<Vector> getRecordOnDesgNYear(String desg,int year)
    {
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where designation=? and year(YearOfJoin)=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,desg);
            cm.pstmt.setInt(2,year);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    public static Vector<Vector> getRecordOnYear(int year)
    {
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where year(YearOfJoin)=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setInt(1,year);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    public static Vector<Vector> listAllRecord(){
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecordOnDesignation(String desg){
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where designation=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,desg);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecordOnDepartment(String dep){
        connectionManager cm = new connectionManager();
        SearchManager sm= new SearchManager(); 
        cm.connect();
        try
        {
            String query = "select id,name,dob,gender,email,mob,address,pin,designation,department,YearOfJoin from faculty where department=?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setString(1,dep);
            cm.rs=cm.pstmt.executeQuery();
            while(cm.rs.next())
            {
                Faculty f=new Faculty();
                f.setID(cm.rs.getString(1));
                f.setName(cm.rs.getString(2));
                f.setDOBfromSQL(cm.rs.getDate(3).toString());
                f.setGender(cm.rs.getString(4).charAt(0));
                f.setEmail(cm.rs.getString(5));
                f.setMob(cm.rs.getLong(6));
                f.setAddress(cm.rs.getString(7));
                f.setPIN(cm.rs.getInt(8));
                f.setDesignation(cm.rs.getString(9));
                f.setDepartment(cm.rs.getString(10));
                f.setJoinDate(cm.rs.getString(11).toString());
                sm.vectorData.add(sm.convertToVector(f));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                cm.rs.close();
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return sm.vectorData;
    }
    
    public static boolean deleteRecord(String ID){
        connectionManager cm = new connectionManager();
        String q="delete from faculty where id = ?";
        boolean flag=false;
        try{
            cm.connect();
            cm.pstmt = cm.conn.prepareStatement(q);
            cm.pstmt.setString(1, ID);
            int r=cm.pstmt.executeUpdate();
            if(r!=0){
                flag=true;
                cm.pstmt=cm.conn.prepareStatement("delete from subjects where fac_id =?");
                cm.pstmt.setString(1,ID);
                cm.pstmt.executeUpdate();
                cm.pstmt=cm.conn.prepareStatement("delete from users where name=?");
                cm.pstmt.setString(1, ID);
                cm.pstmt.executeUpdate();
            }
            else
                flag = false;
        }
        catch(SQLException e)
        {
            err=e.getMessage();
            flag= false;
        }
        finally
        {
            try
            {
                cm.pstmt.close();
                cm.conn.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        return flag;
    }
}