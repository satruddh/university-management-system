 

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Form_Data {
    private String fName,mName,lName,email,address,course,branch;
    private int pin,sem,yod;
    private String dob="";
    private long phone;
    private char gender;
    private String roll;
    public ArrayList<String> courseMap=new ArrayList<>(Arrays.asList("--Select Course--","B. Tech","M. Tech","Phd"));
    public ArrayList<String> branchMap=new ArrayList<>(Arrays.asList("--Select Branch--","Computer Science","Information Technology","Civil Engineering","Electronics and Communication Enginnering","Electrical Engineering","Mechanical Engineering","VLSI","Seismology","Maths","Physics"));
    public Form_Data()
    {
        roll="";
        fName="";
        mName="";
        lName="";
        dob="01-01-1111";
        gender='0';
        email="";
        phone=0;
        address="";
        pin=0;
        course="";
        branch="";
        sem=1;
        yod=1111;
    }
    public Form_Data(String fn,String mn,String ln,String db,char gdr,String em,long mob,String add,int pn,String crs,String brch,int s,int y)
    {    
        fName=fn;
        mName=mn;
        lName=ln;
        dob=db;
        gender=gdr;
        email=em;
        phone=mob;
        address=add;
        pin=pn;
        course=crs;
        branch=brch;
        sem=s;
        yod=y;
        roll=genRoll();
    }
    public String genRoll() {
        StringBuilder r =new StringBuilder("");
        r.append(this.yod);
        r.append(String.format("%02d",branchMap.indexOf(this.branch)));
        r.append(courseMap.indexOf(this.course));
        
        int c=0,s=0;
        connectionManager cm = new connectionManager();
        connectionManager.connect();
        String query="select count(*) from student_count where Branch = ? and Course =? and year=?";
        try
        {
            connectionManager.pstmt = connectionManager.conn.prepareStatement(query);
            connectionManager.pstmt.setString(1,this.branch);
            connectionManager.pstmt.setString(2,this.course);
            connectionManager.pstmt.setInt(3, this.getYOAdm());
            connectionManager.rs=connectionManager.pstmt.executeQuery();
            if(connectionManager.rs.next())
            {
                int t=connectionManager.rs.getInt(1);
                //System.out.println(t);
                
                r.append(String.format("%03d", t+1));
            }
        }catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
        return r.toString();
    }
    private Date getdob()
    {
        Date d=new Date();
        try
        {
            d=new SimpleDateFormat("dd-MM-yyyy").parse(dob);
        }
        catch(Exception p)
        {
            p.printStackTrace();
        }
        return d;
    }
    public String SQLtoInp()
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
    public String getRoll(){return roll;}
    public String getfName(){return fName;}
    public String getmName(){return mName;}
    public String getlName(){return lName;}
    public String getDOBSQL(){ return dob;}
    public char getGender(){return gender;}
    public String getEmail(){return email;}
    public long getMob(){return phone;}
    public String getAddress(){return address;}
    public int getPIN(){return pin;}
    public String getCourse(){return course;}
    public String getBranch(){return branch;}
    public int getSem(){return sem;}
    public int getYOAdm(){ return yod;}
    
    public void setRoll(long rn){roll=String.valueOf(rn);}
    public void setfName(String f){fName=f;}
    public void setmName(String m){mName=m;}
    public void setlName(String n){lName=n;}
    public void setDOB(String d){dob=d;}
    public void setGender(char g){gender=g;}
    public void setEmail(String e){email=e;}
    public void setMob(long m){phone=m;}
    public void setAddress(String ad){address=ad;}
    public void setPIN(int p){pin=p;}
    public void setCourse(String c){course=c;}
    public void setBranch(String b){branch=b;}
    public void setSem(int s){sem=s;}
    public void setYOAdm(int y){ yod=y;}
}
