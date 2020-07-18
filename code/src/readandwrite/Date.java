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
public class Date implements Serializable {
    int year, month, day,date;
    public Date(int yy, int mm, int dd) {
        year = yy;
        month = mm;
        day = dd;
    }
    public Date(int d){
        date = d;
    }
    @Override
    public String toString() {
        if (year!=0 && month!=0 && day!=0){
            return String.format("%04d/%02d/%02d", year, month, day);
        }
        else return String.format("%08d", date);
    }
}