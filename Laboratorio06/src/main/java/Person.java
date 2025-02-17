/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IDAT
 */
public class Person {
    private String name; 

    public Person(String name) {
        this.name = name;
    }
    

 public String getName() {
 return name;
 }

 public void setName(String newName) {
 this.name = newName;

} 

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
 
}
