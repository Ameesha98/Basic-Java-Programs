
package javaapplication5;

public class first implements Cloneable {
    private int b;
    private int a;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
