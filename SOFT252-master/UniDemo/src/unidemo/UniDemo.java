/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author jjbrewer
 */
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lecturer lecturerOne = new Lecturer(1, "John");
        Student lanky = new Student(2, "Aves");
        Course AINT = new Course("AINT10000000", "BGB110");
        
        Admin admin = new Admin();
        
        admin.getDetails(lanky);
        
        admin.assignCourse(lecturerOne, AINT);
        admin.assignCourse(lanky, AINT);
        
        lecturerOne.teach();
        lanky.attendClass();
        
        lanky.doCoursework();
        lecturerOne.setCoursework("do work");
        lanky.doCoursework();
        
        admin.getDetails(lecturerOne);
        
    }
    
}
