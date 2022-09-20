/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Percobaan 4 Penggunaan Operator LOgika dan Boolean AND
package testand;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class TestAND {
    public static void main(String[] args) {
       int i = 0;
       int j = 10;
       boolean test = true;
       
       //demonstrasi &&
       test = (i > j) && (j++ > 9);
       System.out.println(i);
       System.out.println(j);
       System.out.println(test);
       
        //demonstrasi &
       test = (i > j) && (j++ > 9);
       System.out.println(i);
       System.out.println(j);
       System.out.println(test);
       
       
       
    }
    
}
