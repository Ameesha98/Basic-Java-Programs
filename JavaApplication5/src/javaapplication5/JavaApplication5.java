package javaapplication5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication5 {
 public static void main(String[] args) {
     try {
         /*  try {
         // TODO code application logic here
         first f=new first();
         f.setA(35);
         f.setB(40);
         first f1=(first)f.clone();
         f1.setA(70);
         System.out.println(f.getA()+" "+f.getB());
         System.out.println(f1.getA()+" "+f1.getB());
         } catch (CloneNotSupportedException ex) {
         Logger.getLogger(JavaApplication5.class.getName()).log(Level.SEVERE, null, ex);
         }*/
         emp e=new emp(1094, "Ameesha", 18, 7, 1998);
         emp e1=(emp)e.clone();
         e1.obj.setDate(19);
         System.out.println(e.getObj().getDate());
         System.out.println(e1.getObj().getDate());
     } catch (CloneNotSupportedException ex) {
         Logger.getLogger(JavaApplication5.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
}
