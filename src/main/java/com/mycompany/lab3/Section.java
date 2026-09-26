/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

public class Section {

    String name;
    String[] courses = {"OOP", "EDC"};
     
    Student student1 = new Student();
     
     void showStudentInfo() {
        

        student1.name = "Meheg";
        student1.id = 100;
        student1.section = "69_I";
          student1.address = "Cumilla";
        
        student1.displayInfo();
    }

}
