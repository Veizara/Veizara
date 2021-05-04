
package hw_2;

public class User {
    
    private int ID;
    private String name;
    private String LastName;
    private String email;
    private String password;
    private String userName;

  
    public User() {
        
        
    }
    
      public User(int ID , String name , String LastName , String email , String userName , String password) {
        
        this.ID = ID;
        this.name = name;
        this.LastName = LastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    
      }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
        
    
    
}
