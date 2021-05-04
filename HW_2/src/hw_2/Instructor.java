
package hw_2;

public class Instructor extends User {
     
    private String branch;
    
    public Instructor() {
        
    }
    public Instructor(int ID , String name , String LastName , String email , String userName , String password,String branch) {
        
     super(ID , name, LastName, email , userName, password);
     this.branch = branch;  
      }
   

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}
