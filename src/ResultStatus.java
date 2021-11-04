import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SPN RAO
 */
public class ResultStatus {
    static boolean getResStatus()
    {
        boolean st=false;
        java.io.File f = new java.io.File("res.txt");
        if(f.exists())
        {
            try {
                Path fl=Path.of("res.txt");
                st=Boolean.parseBoolean(new String(java.nio.file.Files.readAllBytes(fl)));
            } catch (IOException ex) {
                Logger.getLogger(ResultStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else 
            st= false;
        return st;
    }
    static void setResStatus(boolean st)
    {
        java.io.File f = new java.io.File("res.txt");
        if(f.exists())
        {
            try
            {
                Path fl=Path.of("res.txt");
                Files.writeString(fl, String.valueOf(st));
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            try {
                f.createNewFile();
                //f.setReadOnly();
                Path fl=Path.of("res.txt");
                Files.writeString(fl, String.valueOf(st));
            } catch (IOException ex) {
                Logger.getLogger(ResultStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
