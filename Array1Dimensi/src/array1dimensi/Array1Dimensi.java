/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jDta = 5;
       String[] teman = new String[jDta];
       
       teman[0] = "Jarot";
       teman[1] = "Burhan";
       teman[2] = "Supar";
       teman[3] = "Enal";
       teman[4] = "Dagul";
      
       String nama = teman [4];
       System.out.println(nama);
       
       Scanner inp = new Scanner(System.in);
       for(int idx=0; idx<jDta; idx++){
           System.out.printf("Data ke-%d: ",idx);
           teman [idx] =inp.nextLine();

       }
       System.out.println("``` OUTPUT");
       int idx = 0;
       while(idx<jDta){
           System.out.println("Data ke-"+idx+": " +teman[idx]);
           idx++;
       }
       System.out.println("~~~OUTPUT demgan for ->foreach");
       for(String nm:teman){
           System.out.println(nm);
       }
       
       
       
    }
    
}
