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
public class nomer2 {
   public static void main(String[] args) {
    
    int angka[]={2,4,6,8,10,12,14,16,18,20};
    int cari;
    int awal=0;
    int akhir=angka.length-1;
    int ketemu=0;
    int point=0;
    
        System.out.println("Isi data adalah: ");
        for(int i=0;i<angka.length;i++){
            System.out.print(angka[i]+" ");
        }
        System.out.println(" ");
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan angka yang ingin di cari: ");
        cari=input.nextInt();
        while((awal<=akhir)&&(ketemu==0)){
            point=(awal+akhir)/2;
            System.out.println("Indeks pointer "+point);
            if(cari==angka[point]){
                ketemu=1;
                System.out.println("Data "+ cari+ " telah di temukan pada index ke "+ point + "baris ke " + (point+1));
            }
            else if(cari<angka[point]){
                System.out.println("Cari di kiri ");
                akhir=point-1;
            }
            else{
                awal=point+1;
                System.out.println("Cari di kanan ");
            }
        }
        if(ketemu==1){
            System.out.println("Data di temukan ");
            
        }
        else{
            System.out.println("Data tidak di temukan ");
            
        }
        System.out.println();
            System.out.println("Muhammad Rizky Ikhval");
    } 
}
