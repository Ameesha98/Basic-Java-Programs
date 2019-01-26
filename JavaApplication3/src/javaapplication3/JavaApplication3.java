package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Account obj;
        System.out.println("Welcome!\nEnter the type of account\nPress s for savings and c for current account");
        Scanner sc=new Scanner(System.in);
        char s;
        s=sc.next().charAt(0);
        if(s=='s')
        {
            obj=new saving();
            obj.set();
               System.out.println("Press d for deposit and w for withdraw");
               char ch;
               ch=sc.next().charAt(0);
               if(ch=='d')
                   obj.deposit();
               else
                   obj.withdraw();
        }
        else
        {
            obj=new curact();
             obj.set();
               System.out.println("Press d for deposit and w for withdraw");
               char ch;
               ch=sc.next().charAt(0);
               if(ch=='d')
                   obj.deposit();
               else
                   obj.withdraw();
        }
    obj.display();
    }
    
}
