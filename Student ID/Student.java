/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author christopher King
 */
public class Student {

    public String Name;
    public String ID;

    public Student() {

        Name = "";
        ID = "";
    }

    //overloaded Constructor
    public Student(String Name, String ID) {
        this.Name = Name;
        this.ID = ID;
    }

    // overload method
    public int compute(int g1, int g2) {
        int grade = (g1 + g2) / 2;
        return grade;
    }

    public double compute(double g1, double g2) {
        double grade = (g1 + g2) / 2;
        return grade;

    }

    //setters and getters
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

}
