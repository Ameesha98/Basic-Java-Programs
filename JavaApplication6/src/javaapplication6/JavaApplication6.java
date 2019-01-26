
package javaapplication6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char ch;
        do
        {
            System.out.println("Enter R to register user");
            System.out.println("Enter D to display users");
            System.out.println("Enter L to login");
            System.out.println("Enter C to change password");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case 'R':
                    String unam,upwd;
                    System.out.println("Enter username and password");
                    unam=sc.next();
                    upwd=sc.next();
                    clsusr u=new clsusr(unam, upwd);
                try 
                {
                    if(u.regusr()==true)
                        System.out.println("Registration Successful");
                    else
                        System.out.println("Registration Unsuccessful");
                } 
                catch (isemptyexp ex) 
                {
                    System.out.println(ex.getMessage());
                }
                break;
                case 'D':
                    clsusr.displayuser();
                    break;
                case 'L':
                    System.out.println("Enter username and password to login");
                    unam=sc.next();
                    upwd=sc.next();
                    clsusr u1=new clsusr(unam, upwd);
                    if(u1.loginchk()==true)
                        System.out.println("Login Successful");
                    else
                       System.out.println("Username Password incorrect");
                    break;
                case 'C':
                    System.out.println("Enter username,old password and new password");
                    unam=sc.next();
                    upwd=sc.next();
                    String newpwd=sc.next();
                    clsusr u3=new clsusr(unam,upwd);
                    if(u3.chgpwd(newpwd)==true)
                         System.out.println("Password changed successfully");
                    else
                        System.out.println("Username Password incorrect");
                    break;
            }
        }while(ch!='E');
    }
    
}
