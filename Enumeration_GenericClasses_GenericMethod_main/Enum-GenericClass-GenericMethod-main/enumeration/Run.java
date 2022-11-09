/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeration;

/**
 *
 * @author Kirana Alivia Enrico
 */
public class Run {
    public static void main(String[] args){
        String str = "JANUARY";
        Test t1 = new Test(Month.valueOf(str));
        t1.monthIsLike();
    }
}
