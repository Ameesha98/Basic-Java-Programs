package javaapplication4;
public class JavaApplication4 {
    public static void main(String[] args) {
        // TODO code application logic here
            result s=new result();
            s.getinfo();
            s.total();
            s.showinfo();
            System.out.print("Eligibility Status: ");
           if( s.checkEligibility())
               System.out.println("Eligible");
           else
               System.out.println("Not Eligible");
    }
    
}
