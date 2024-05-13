/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author freny
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        s1.setName("Rihil");
        Student s2 = new Student();
        s2.setName("Parth");
        Student s3 = new Student();
        s3.setName("Freny");
        System.out.println(s1.getName());        
        System.out.println(s2.getName());
        System.out.println(s3.getName());

    }
        
}
