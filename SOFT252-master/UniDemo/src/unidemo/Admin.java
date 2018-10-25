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
public class Admin 
{
    public static void assignCourse(UniPeople person, Course course)
    {
        person.setCourse(course);
    }
    
    public static void getDetails(UniPeople person)
    {
        String name;
        int id;
        String courseCode;
        
        name = person.getName();
        id = person.getId();
        courseCode = "n/a";
        if(person.getCourse() != null)
        {
            courseCode = person.getCourse().getCode();
        }
        
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("course: " + courseCode);
        
            
    }
}
