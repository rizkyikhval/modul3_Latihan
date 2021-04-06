/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class nomer1 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        String[] angka = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Rizky Ikhval", "Tesla"};
        int found = 0;
        System.out.println("nama-nama orang yang berpengaruh:\n");
        for (int i=0; i<angka.length; i++){
            System.out.print("|"+angka[i]+"| ");
        }
        
        System.out.println("\n\nmasukan nama yang akan dicari:");
        String key = input.nextLine();
        
        for (int i=0; i<angka.length; i++){
            if (key.equalsIgnoreCase(angka[i])){
                found = 1;
                System.out.println("nama: "+key+", pada indeks ke-"+i);
                break;
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
            
        }
        System.out.println();
        System.out.println("Muhammad Rizky Ikhval Alamsyah");
    }
    
}
