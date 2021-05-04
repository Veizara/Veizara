/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_2;

import java.util.ArrayList;

public class InstructorManager {
    
     ArrayList<Instructor> GivingCourses = new ArrayList<Instructor>();
    
    public void  addTeacher(Instructor name) {
        System.out.println(name.getName() + name.getLastName() + " is an instructor ");
        
    }
    
    public void givingLectures(Instructor branch) {
       this.GivingCourses.add(branch);
        System.out.println(branch.getName() +  " teaches " + branch.getBranch() );
        
    }
 
}


