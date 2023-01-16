/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package printstudentlist;

/**
 * This class +++Insert Description Here+++
 * 
 * @author V
 */
public class PrintStudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Vyom");
        s1.setAge(18);
        
        Student s2 = new Student();
        s2.setName("Ben");
        s2.setAge(18);
        
        Student s3 = new Student();
        s3.setName("Yousuf");
        s3.setAge(18);
        
        list [0]=s1;
        list [1]=s2;
        list [2]=s3;
        for(int i=0; i<list.length; i++) 
        {
        System.out.println("Name: " + list[i].getName() + " | Age: " + list[i].getAge());    
        }
    }

}
