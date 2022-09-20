/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relasidemo;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class RelasiDemo {

    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Nilai Variabel...");
        System.out.println("i ="+ i);
        System.out.println("j ="+ j);
        System.out.println("k ="+ k);
        
        //Lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println("i > j ="+ (i>j));//false
        System.out.println("j > i ="+ (j>i));//true
        System.out.println("k > j ="+ (k>j));//false
        
         //Lebih besar atau sama dengan
        System.out.println("Lebih besar atau sama dengan...");
        System.out.println("i >= j ="+ (i>=j));//false
        System.out.println("j >= i ="+ (j>=i));//true
        System.out.println("k >= j ="+ (k>=j));//false
        
         //Lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("i < j ="+ (i<j));//true
        System.out.println("j < i ="+ (j<i));//false
        System.out.println("k < j ="+ (k<j));//false
        
       //Lebih kecil atau sama dengan
        System.out.println("Lebih kecil atau sama dengan...");
        System.out.println("i <= j ="+ (i<=j));//true
        System.out.println("j <= i ="+ (j<=i));//false
        System.out.println("k <= j ="+ (k<=j));//false
        
        //sama dengan
        System.out.println("Sama dengan...");
        System.out.println("i == j ="+ (i==j));//false
        System.out.println("k == j ="+ (k==j));//true
        
        //Tidak sama dengan
        System.out.println("Tidak Sama dengan...");
        System.out.println("i != j ="+ (i!=j));//true
        System.out.println("k != j ="+ (k!=j));//false
        
        
        
    }
    
}
