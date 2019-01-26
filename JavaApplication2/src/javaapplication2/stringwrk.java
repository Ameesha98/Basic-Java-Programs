
package javaapplication2;

import java.util.Scanner;

public class stringwrk {
    private String name;
    public void getname()
    {
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
    }
    public void displayname()
    {
        int ind=0,cnt,i;
        char[] a;
        cnt = 0;
        while (ind>=0 &&ind<name.length())
        {            
            ind=name.indexOf(" ", ind+1);
            cnt++;
        }
        a=new char[cnt];
        ind=0;
        a[0]=Character.toUpperCase(name.charAt(0));
       for(i=1;i<cnt;i++)
       {
           ind=name.indexOf(" ",ind+1);
           a[i]=Character.toUpperCase(name.charAt(ind+1));
       }
        for(i=0;i<cnt-1;i++)
            System.out.print(a[i]+".");
        if(ind==0)
            ind=-1;
        System.out.print(Character.toUpperCase(name.charAt(ind+1))+name.substring(ind+2, name.length())+"\n");
    }
}
