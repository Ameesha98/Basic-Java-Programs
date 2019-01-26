package javaapplication4;

import java.util.Scanner;

public abstract class student {
    private int rollno;
    private String name;
    int []mrks=new int[5];
    public void getinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no and name");
        rollno=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
          System.out.println("Enter marks in five subject");
          for(int i=0;i<5;i++)
          {
              int a=i+1;
              System.out.println("Subject "+a);
              mrks[i]=sc.nextInt();
          } 
    }
    public void showinfo()
    {
         System.out.println("Roll No: "+rollno);
          System.out.println("Name: "+name);
          System.out.println("Marks in:");
          for(int i=0;i<5;i++)
          {
              int a=i+1;
              System.out.println("Subject "+a+": "+mrks[i]);
          }  
    }
    public abstract void total();
}

class result extends student implements eligibility
{
    int total=0;
    @Override
    public void total()
    {
        for(int x:mrks)
            total+=x;
    }
    @Override
    public boolean checkEligibility() {
        if (total>=cutoff)
           return true;
        else
          return false;
    }
    
}
