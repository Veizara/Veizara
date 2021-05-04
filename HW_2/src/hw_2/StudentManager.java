/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_2;

public class StudentManager {
    
     public void takingLectures(Student name, String lectures ) {
       name.lectures.add(lectures);
         System.out.println(name.getUserName() + " is taking " + name.lectures.get(name.lectures.size() -1 ));
        
    }
    
    
    
}
