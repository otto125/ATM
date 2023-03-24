
package com.mycompany.atmu;

import java.util.Scanner;

/**
 *
 * @author s1290
 */
public class Teclado {
    
    private Scanner scan;
     
     public Teclado(){
     
     scan = new Scanner (System.in);
  

}
     
       public int recibirEntrada(){
     
           return scan.nextInt();
     
     }
    
}
