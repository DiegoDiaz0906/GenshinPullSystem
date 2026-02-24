
package practicando.gui;
import java.util.ArrayList;

public class Users {
    
    private String Password;
    private String Name;
    private String Username;
    private ArrayList<Characters> chaclist;

    
    
    public Users(String Password, String Name, String Username, ArrayList<Characters> chaclist) {
        this.Password = Password;
        this.Name = Name;
        this.Username = Username;
        this.chaclist = chaclist;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setChaclist(ArrayList<Characters> chaclist) {
        this.chaclist = chaclist;
    }

    
    
    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getUsername() {
        return Username;
    }

    public ArrayList<Characters> getChaclist() {
        return chaclist;
    }
    
    
}
