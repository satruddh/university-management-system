 
import java.sql.*;
class Faculty
{
    String id;
    String name;
    String dob;
    char gender;
    String email;
    long mob;
    String add;
    int pin;
    String role;
    String dep;
    String joindate;
    public Faculty()
    {
        id="";
        name="";
        dob="01-01-1111";
        gender='0';
        email="";
        mob=0;
        add="";
        pin=0;
        role="";
        dep="";
        joindate="01-01-1111";
    }
    public Faculty(String n,String d,char g,String e, long m,String a,int p,String r,String de)
    {
        name=n;
        dob=d;
        gender=g;
        email=e;
        mob=m;
        add=a;
        pin=p;
        role=r;
        dep=de;
        id=genID();
    }
    private String genID()
    {
        StringBuilder sb=new StringBuilder("");
        if(this.dep.equals("Electronics and Communication Enginnering"))
            sb.append("EC");
        else if(this.dep.equals(("Civil Engineering")))
            sb.append("CE");
        else if(this.dep.equals("Maths"))
            sb.append("MT");
        else
            sb.append(this.dep.charAt(0));
        sb.append(this.role.charAt(0));
        connectionManager cm=new connectionManager();
        int ct=0;
        try
        {
            cm.connect();
            cm.pstmt = cm.conn.prepareStatement("select count(*) from faculty_count where department = ? and designation = ?");
            cm.pstmt.setString(1,this.dep);
            cm.pstmt.setString(2,this.role);
            cm.rs=cm.pstmt.executeQuery();
            if(cm.rs.next())
                ct=cm.rs.getInt(1);   
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
        sb.append(String.format("%03d",ct+1));
        return sb.toString();
    }
    public String getID(){return id;}
    public String getName(){return name;}
    public String getDOB(){ return dob;}
    public char getGender(){return gender;}
    public String getEmail(){return email;}
    public long getMob(){return mob;}
    public String getAddress(){return add;}
    public int getPIN(){return pin;}
    public String getDesignation(){return role;}
    public String getDepartment(){return dep;}
    public String getJoinDate(){return joindate;}
    public String getDOBSQL()
    {
        String data[]=dob.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=data.length -1;i>0;i--)
        {
            sb.append(data[i]);
            sb.append("-");
        }
        sb.append(data[0]);
        return sb.toString();
    }
    
    public void setID(String ID){id=ID;}
    public void setName(String f){name=f;}
    public void setGender(char g){gender=g;}
    public void setEmail(String e){email=e;}
    public void setMob(long m){mob=m;}
    public void setDOB(String d){dob=d;}
    public void setAddress(String ad){add=ad;}
    public void setPIN(int p){pin=p;}
    public void setDesignation(String c){role=c;}
    public void setDepartment(String b){dep=b;}
    public void setJoinDate(String jd){joindate=jd;}
    public void setDOBfromSQL(String d){
        String data[]=d.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=data.length -1;i>0;i--)
        {
            sb.append(data[i]);
            sb.append("-");
        }
        sb.append(data[0]);
        dob=sb.toString();
    }
}