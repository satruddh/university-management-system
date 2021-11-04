import java.util.Vector;

/**
 *
 * @author SPN RAO
 */
public class SearchManager {
    
    Vector<Vector> vectorData;
    public SearchManager()
    {
        vectorData = new Vector<>();
    }
    public static Vector<Object> convertToVector(Form_Data f)
    {
        Vector<Object> v = new Vector<>();
        v.add(f.getRoll());
        v.add(f.getfName());
        v.add(f.getmName());
        v.add(f.getlName());
        v.add(f.getDOBSQL());
        v.add(f.getGender());
        v.add(f.getEmail());
        v.add(f.getMob());
        v.add(f.getAddress());
        v.add(f.getPIN());
        v.add(f.getCourse());
        v.add(f.getBranch());
        v.add(f.getSem());
        v.add(f.getYOAdm());

        return v;
    }
    public static Vector<Object> convertToVector(Faculty f)
    {
        Vector<Object> v = new Vector<>();
        v.add(f.getID());
        v.add(f.getName());
        v.add(f.getDOB());
        v.add(f.getGender());
        v.add(f.getEmail());
        v.add(f.getMob());
        v.add(f.getAddress());
        v.add(f.getPIN());
        v.add(f.getDesignation());
        v.add(f.getDepartment());
        v.add(f.getJoinDate());
        return v;
    }
}
