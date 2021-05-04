
package hw_2;

public class HW_2 {

    
    public static void main(String[] args) {
      
      
        UserManager usermanager = new UserManager();
 
        
        Instructor teacher = new Instructor(1 , "Michel" , " Biezen" , " bisibi@gmail.com" , " engindemirog" , " 56789" , " Physics ");
        Instructor teacher2 = new Instructor(2 , " Mehmet" , " bisi ", " mehtmfd@gmail.com" , " mehmettc" , "12345" , " Chemistry");
        Student student1 = new Student(1 , "Beste " , " bizeneds" , "fsdsds@gmail.com" , " veizara" , "1234" , "Math");
        Student student2 = new Student(1 , "Salu " , " bizendsdsdeds" , "fsdsasdasds@gmail.com" , " Sally" , "1234" , "Java");
        
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
       
        instructorManager.addTeacher(teacher); 
        instructorManager.givingLectures(teacher);
        instructorManager.addTeacher(teacher2);
        
      
        
        studentManager.takingLectures(student1, "Physics");
        studentManager.takingLectures(student2, "Chemistry");
        studentManager.takingLectures(student1, "Chemistry");
        
       
    }
    
}
