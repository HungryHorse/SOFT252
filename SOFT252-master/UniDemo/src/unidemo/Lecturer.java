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
public class Lecturer extends UniPeople implements ITeach
{
    @Override
    public void setCoursework(String coursework)
    {
        this.getCourse().setCoursework(coursework);
        
    }
    
    @Override
    public void teach()
    {
        String teachString;
        teachString = this.getName() + " is teaching " + this.getCourse().getCode()
                + " in room " + this.getCourse().getRoom();
        
        System.out.println(teachString);
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
}
