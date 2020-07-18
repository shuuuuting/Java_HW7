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
public class Member implements Serializable {
    int number;
    Name name;
    Identity ID;
    Date birthday;
    Student student;
    public Member(int i,Name n,Identity id, Date d,Student s) {
        number = i;
        name = n;
        ID = id;
        birthday = d;
        student = s;
    }
    @Override
    public String toString() {
        return number+":\n"+name +"\n"+ID +"\n"+birthday+"\n"+student;
    }
}
