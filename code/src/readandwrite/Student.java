/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwrite;
import java.io.Serializable;
/**
 *
 * @author zhangshuting
 */
public class Student implements Serializable {
    String student;
    public Student(String s){
        student = s;
    }
    @Override
    public String toString(){
        return "Student:" + student;
    }
    
}
