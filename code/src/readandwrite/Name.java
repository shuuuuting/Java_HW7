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
public class Name implements Serializable {
    String name;
    public Name(String n){
        name = n;
    }
    @Override
    public String toString(){
        return "Name:" + name;
    }
    
}
