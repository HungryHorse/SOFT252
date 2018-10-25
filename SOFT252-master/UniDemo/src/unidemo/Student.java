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
public class Student extends UniPeople
{
    public Student(int id, String name) {
        super(id, name);
    }
    
    public void attendClass()
    {
        String classAttended;
        
        classAttended = this.getName() + " is attending " + this.getCourse().getCode()
                + " in room " + this.getCourse().getRoom();
        
        System.out.println(classAttended);
    }
    
    public void doCoursework()
    {
        String courseworkDone;
        
        courseworkDone = this.getName() + " is doing coursework " + 
                this.getCourse().getCoursework();
        
        System.out.println(courseworkDone);
    }
}
