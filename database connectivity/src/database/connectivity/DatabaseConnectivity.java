package database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectivity {
static Connection con;
    public static void main(String[] args) {
    try {
        // Register Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Establish Connection and store in a variable of connection type
        con=DriverManager.getConnection("jdbc:mysql://localhost/dbmydata","root","");
        //**************************************Program's Logic Start******************************************//
        
        
        Scanner sc=new Scanner(System.in);
        char ch=' ';
        do {            
            System.out.println("Press I to insert record");
            System.out.println("Press M to modify record");
            System.out.println("Press V to view records");
            System.out.println("Press D to delete record");
            System.out.println("Press E to exit");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case 'I':
                    insert();
                    break;
                case 'M':
                    update();
                    break;
                case 'V':
                    display();
                    break;
                case 'D':
                    delete();
                    break;
            }
        } while (ch!='E');
    } 
    //Catch for Driver not found
    catch (ClassNotFoundException ex) {
        System.out.println("Driver not found");
    } 
    //Credentials wrong
    catch (SQLException ex) {
        System.out.println("Database credentials incorrect");
    }
        
    }  
    static void insert() throws SQLException
{
String enam,eadd;
float esal;
System.out.println("Enter Employee name, address and salary");
Scanner sc=new Scanner(System.in);
enam=sc.nextLine();
eadd=sc.nextLine();
esal=sc.nextFloat();
    Statement st=con.createStatement();
    st.execute("insert into tbemp values(null,'"+enam+"','"+eadd+"',"+esal+")");
    System.out.println("Data inserted successfully");
}
static void display() throws SQLException
{
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from tbemp order by empnam asc");
    while(rs.next())
    {
        System.out.println("Employee Name: "+rs.getString("empnam")+"\t\tEmployee Address: "+rs.getString("empadd")+"\t\tEmployee Salary: "+rs.getFloat("empsal"));
    }
}
static void update() throws SQLException
{
    int eno;
String enam,eadd;
float esal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter empno of employee whose information you need to update");
eno=sc.nextInt();
sc.nextLine();
System.out.println("EnterUpdated Employee name, address and salary");
enam=sc.nextLine();
eadd=sc.nextLine();
esal=sc.nextFloat();

    Statement st=con.createStatement();
    st.execute("update tbemp set empnam='"+enam+"',empadd='"+eadd+"',empsal="+esal+"where empno="+eno);
    System.out.println("Data updated successfully");
}
static void delete() throws SQLException
{
    int eno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter empno of employee whose information you need to delete");
eno=sc.nextInt();
    Statement st=con.createStatement();
    st.execute("delete from tbemp where empno="+eno);
    System.out.println("Data deleted successfully");
}
}
