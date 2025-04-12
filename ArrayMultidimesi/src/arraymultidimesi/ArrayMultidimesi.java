
package arraymultidimesi;

import java.util.Scanner;

/**
 *
 * @author Reza syarwani
 * 12 April 2025
 */
public class ArrayMultidimesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[][] meja =new String[3][2];
       
       meja[0][0] = "Samsul";
       meja[0][1] = "Putri";
       
       meja[1][0] = "Ayu";
       meja[1][1] = "iika";
       
       meja[2][0] = "Ipin";
       meja[2][1] = "Udin";
       
      String anak = meja[2][0];
      System.out.printf("anak pada posisi brs 2 kolom 0 adalah %s\n",anak);
      
      Scanner inp = new Scanner(System.in);
      for(int brs=0; brs<3; brs++) {
          System.out.println("baris ke-" +brs);
          for(int klm=0; klm<2;klm++){
              System.out.print("==>kolom ke-"+klm+":");
              meja[brs] [klm] = inp.nextLine();
              
          }
          
          
    
          }
      for(int brs=0; brs<3; brs++) {
          for(int klm=0; klm<2;klm++){
              System.out.
             printf("anak di posisi %s:%s:%s\n" ,brs,klm,meja[brs][klm]);
      }
    }
    
    }
}
