/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Percobaan ke 5 Penggunaan operator logika dan
package testor;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class TestOR {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demostrasi ||
        test = (i < 10)||(j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demostrasi |
        test = (i < 10)||(j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
    
}
