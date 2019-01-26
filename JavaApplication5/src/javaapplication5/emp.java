package javaapplication5;
class clsdat implements Cloneable
{
    protected int date;
    protected int month;
    protected int year;
     @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public clsdat(int d,int m,int y)
    {
        date=d;
        month=m;
        year=y;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
public class emp implements Cloneable 
{
    private int empno;
    private String empnam;
    clsdat obj;
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
       emp empt=(emp)super.clone();
       empt.obj=(clsdat)obj.clone();
       return empt;
    }
    public emp(int n,String name,int d,int m,int y)
    {
        empno=n;
        empnam=name;
        obj=new clsdat(d,m,y);
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpnam() {
        return empnam;
    }

    public void setEmpnam(String empnam) {
        this.empnam = empnam;
    }

    public clsdat getObj() {
        return obj;
    }

    public void setObj(clsdat obj) {
        this.obj = obj;
    }

    
    
}
