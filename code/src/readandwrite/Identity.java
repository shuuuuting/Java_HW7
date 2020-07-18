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
public class Identity implements Serializable {
    int id;
    public Identity(int i){
        id = i;
    }
    @Override
    public String toString(){
        return "ID:" + id;
    }
    
}