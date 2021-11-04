
 

import java.sql.*;
import java.util.Vector;

class DBManager {

    public static String err = "";

    public static boolean insertRecord(Form_Data f) {

        connectionManager.connect();
        String query = "insert into students (roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            connectionManager.pstmt = connectionManager.conn.prepareStatement(query);
            connectionManager.pstmt.setString(1, f.getRoll());
            connectionManager.pstmt.setString(2, f.getfName());
            connectionManager.pstmt.setString(3, f.getmName());
            connectionManager.pstmt.setString(4, f.getlName());
            //java.sql.Date sqlDate = new java.sql.Date(f.getDOB());//new java.sql.Date(f.getdob().getTime());
            connectionManager.pstmt.setDate(5, java.sql.Date.valueOf(f.SQLtoInp()));
            connectionManager.pstmt.setString(6, String.valueOf(f.getGender()));
            connectionManager.pstmt.setString(7, f.getEmail());
            connectionManager.pstmt.setString(8, String.valueOf(f.getMob()));
            connectionManager.pstmt.setString(9, f.getAddress());
            connectionManager.pstmt.setInt(10, f.getPIN());
            connectionManager.pstmt.setString(11, f.getCourse());
            connectionManager.pstmt.setString(12, f.getBranch());
            connectionManager.pstmt.setInt(13, f.getSem());
            connectionManager.pstmt.setInt(14, f.getYOAdm());
            connectionManager.pstmt.executeUpdate();
            query="insert into student_count values (?,?,?)";
            connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
            connectionManager.pstmt.setString(1,f.getCourse());
            connectionManager.pstmt.setString(2,f.getBranch());
            connectionManager.pstmt.setInt(3,f.getYOAdm());
            connectionManager.pstmt.executeUpdate();
            query="insert into users (name,pass,type) values(?,\"12345\",\"student\")";
            connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
            connectionManager.pstmt.setString(1,f.getRoll());
            connectionManager.pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            err = e.getMessage();
            return false;
        }
                finally
        {
            
            try
            {
                connectionManager.rs.close();
                connectionManager.pstmt.close();
                connectionManager.conn.close();
            }
            catch(SQLException e)
            {   
                e.getMessage();
            }
        }
        return true;
    }

    public static Form_Data getRecord(long roll) {
        Form_Data fd=new Form_Data();
        connectionManager cm = new connectionManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where roll = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setLong(1, roll);
            cm.rs = cm.pstmt.executeQuery();
            if (cm.rs.next()) {
                fd.setRoll(roll);
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                return fd;
            }
            else
            {
                fd=null;
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
                e.getMessage();
            }
        }
        return fd;
    }
    
    public static boolean updateRecord(Form_Data f)
    {
        connectionManager.connect();
        String query = "update students set fName=?,mName=?,lName=?,DOB=?,Gender=?,email=?,Mob=?,Address=?,pin=?,Course=?,Branch=?,sem=?,yod=? where roll=?";

        try {
            connectionManager.pstmt = connectionManager.conn.prepareStatement(query);
            connectionManager.pstmt.setString(14, f.getRoll());
            connectionManager.pstmt.setString(1, f.getfName());
            connectionManager.pstmt.setString(2, f.getmName());
            connectionManager.pstmt.setString(3, f.getlName());
            //java.sql.Date sqlDate = new java.sql.Date(f.getDOB());//new java.sql.Date(f.getdob().getTime());
            connectionManager.pstmt.setDate(4, java.sql.Date.valueOf(f.SQLtoInp()));
            connectionManager.pstmt.setString(5, String.valueOf(f.getGender()));
            connectionManager.pstmt.setString(6, f.getEmail());
            connectionManager.pstmt.setString(7, String.valueOf(f.getMob()));
            connectionManager.pstmt.setString(8, f.getAddress());
            connectionManager.pstmt.setInt(9, f.getPIN());
            connectionManager.pstmt.setString(10, f.getCourse());
            connectionManager.pstmt.setString(11, f.getBranch());
            connectionManager.pstmt.setInt(12, f.getSem());
            connectionManager.pstmt.setInt(13, f.getYOAdm());
            connectionManager.pstmt.executeUpdate();

        } catch (SQLException e) {
            err = e.getMessage();
            return false;
        }
        finally
        {
            
            try
            {
                connectionManager.rs.close();
                connectionManager.pstmt.close();
                connectionManager.conn.close();
            }
            catch(SQLException e)
            {   
                e.getMessage();
            }
        }
        return true;
    }
    
    public static Vector<Vector> getRecordOnCourse(String cr){
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Course = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, cr);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()) {
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
    
    public static Vector<Vector> getRecordOnBranch(String br){
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Branch = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, br);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()) {
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecord(String cr, String br) {
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Course = ? and Branch = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, cr);
            cm.pstmt.setString(2, br);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()){
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecord(String cr, String br,int y) {
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Course = ? and Branch = ? and yod = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, cr);
            cm.pstmt.setString(2, br);
            cm.pstmt.setInt(3,y);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()){
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecordOnCourse(String cr, int y) {
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Course = ? and yod = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, cr);
            cm.pstmt.setInt(2, y);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()){
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecordOnBranch(String br, int y) {
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where Branch = ? and yod = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setString(1, br);
            cm.pstmt.setInt(2, y);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()){
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> getRecord(int y) {
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students where yod = ?";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.pstmt.setInt(1, y);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()){
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
                e.getMessage();
            }
        }
        return sm.vectorData;
    }
    
    public static Vector<Vector> listAllRecord(){
        connectionManager cm = new connectionManager();
        SearchManager sm = new SearchManager();
        cm.connect();
        String query = "select roll,fName,mName,lName,DOB,Gender,email,Mob,Address,pin,course,branch,sem,yod from students";
        cm.pstmt=null;
        cm.rs=null;
        try{
            cm.pstmt = cm.conn.prepareStatement(query);
            cm.rs = cm.pstmt.executeQuery();
            while(cm.rs.next()) {
                //2fname,3mname,4lname,5dob,6gender,7email,8mobile,9address,10pin,11course,12branch,13sem,14yod
                Form_Data fd=new Form_Data();
                fd.setRoll(cm.rs.getLong(1));
            
                fd.setfName(cm.rs.getString(2));
                fd.setmName(cm.rs.getString(3));
                fd.setlName(cm.rs.getString(4));
                fd.setDOB(cm.rs.getDate(5).toString());
                fd.setGender(cm.rs.getString(6).charAt(0));
            
                fd.setEmail(cm.rs.getString(7));
                fd.setMob(Long.parseLong(cm.rs.getString(8)));
                fd.setAddress(cm.rs.getString(9));
                fd.setPIN(cm.rs.getInt(10));
            
                fd.setCourse(cm.rs.getString(11));
                fd.setBranch(cm.rs.getString(12));
                fd.setSem(cm.rs.getInt(13));
                fd.setYOAdm(cm.rs.getInt(14));
                sm.vectorData.add(sm.convertToVector(fd));
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
    
    public static boolean deleteRecord(long roll){
        connectionManager cm = new connectionManager();
        String q="delete from students where roll = ?";
        boolean flag=false;
        try{
            cm.connect();
            cm.pstmt = cm.conn.prepareStatement(q);
            cm.pstmt.setLong(1, roll);
            int r=cm.pstmt.executeUpdate();
            if(r!=0){
                flag=true;
                q="delete from users where name=?";
                cm.pstmt =cm.conn.prepareStatement(q);
                cm.pstmt.setString(1, String.valueOf(roll));
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
