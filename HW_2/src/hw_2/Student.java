
package hw_2;

import java.util.ArrayList;


public class Student extends User { 
    private String Department;
    ArrayList<String> lectures = new ArrayList<>();
    public Student(int ID , String name , String LastName , String email , String userName , String password,String Department) {
        
     super(ID , name, LastName, email , userName, password);
     this.Department  = Department;
     
      }
    
    
}
