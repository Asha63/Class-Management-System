/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

//import java.util.Scanner;
public class Lab3 {

    public static void main(String[] args) {
        Student student1 = new Student();
       
        
        student1.name = "Asha";
        student1.id = 179;
         student1.section = "69_I";
          student1.address = "Dhaka";
        student1.displayInfo();
        
        Section i_69 = new Section();
        i_69.showStudentInfo();
        
        
    }
}
class Student {
     String name;
     int id;
     String section;
     String address;
     
     
    void read(){
        System.out.println("Student is reading");
    }
    
    void displayInfo(){
        System.out.println("Student Information:");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Section: "+section);
        System.out.println("Adress: "+address);
}    
    
                     
     
}