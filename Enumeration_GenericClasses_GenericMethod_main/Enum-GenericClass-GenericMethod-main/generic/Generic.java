/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 *
 * @author Kirana Alivia Enrico
 */
public class Generic {

    public static void main(String[] args) {
        
        All_in_One<String> Name = new All_in_One<>();
        Name.setHuman("Kirana");
        System.out.println("Name : " + Name.getHuman());
            
        All_in_One<Integer> Age = new All_in_One<>();
        Age.setHuman(18);
        System.out.println("Age: " + Age.getHuman() + " Years Old");
        
        All_in_One<String> Character = new All_in_One<>();
        Character.setHuman("K");
        System.out.println("Inisial : " + Character.getHuman());
    }
}
