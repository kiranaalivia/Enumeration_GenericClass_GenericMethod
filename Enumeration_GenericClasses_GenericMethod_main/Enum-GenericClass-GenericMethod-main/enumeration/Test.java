/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeration;

/**
 *
 * @author Kirana Alivia Enrico
 */
public class Test {
    Month month;
    
    public Test(Month month) {
    this.month = month;
    }
    
    public void monthIsLike(){
        switch (month){
            case JANUARY:
                System.out.println("January is a beginning of a year.");
                break;
            case JULY:
                System.out.println("July is the middle of a year.");
                break;
            case AUGUST:
            case DECEMBER:
                System.out.println("December is the end of a year.");
                break;
            default:
                System.out.println("A year consist of 12 months.");
                break;
        }
    }
}
