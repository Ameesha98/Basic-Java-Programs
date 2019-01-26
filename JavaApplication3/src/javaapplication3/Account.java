package javaapplication3;

import java.util.Scanner;
public abstract class Account {
    protected int actno=0;
    protected String actname="";
    protected float actbal=0.0f;
    public void set()
    {
        System.out.println("Enter account number, account name and account balance");
        Scanner sc=new Scanner(System.in);
        actno=sc.nextInt();
        actname=sc.next();
        actbal=sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Account number: "+actno);
        System.out.println("Account name: "+actname);
        System.out.println("Account balance: "+actbal);
    }
    public abstract void deposit();
    public abstract void withdraw();
}
class saving extends Account
{

    @Override
    public void deposit() {
        float dep;
        System.out.println("Enter amount to be deposited");
        Scanner s=new Scanner(System.in);
        dep=s.nextFloat();
        actbal+=0.3f*dep;
    }

    @Override
    public void withdraw() {
         float wid;
        System.out.println("Enter amount to be withdrawn");
        Scanner s=new Scanner(System.in);
        wid=s.nextFloat();
        actbal-=0.3f*wid;
    }
    
}
class curact extends Account
{

    @Override
    public void deposit() {
         float dep;
        System.out.println("Enter amount to be deposited");
        Scanner s=new Scanner(System.in);
        dep=s.nextFloat();
        actbal+=dep;
    }

    @Override
    public void withdraw() {
        float wid;
        System.out.println("Enter amount to be withdrawn");
        Scanner s=new Scanner(System.in);
        wid=s.nextFloat();
        actbal-=wid;
    }
    
}