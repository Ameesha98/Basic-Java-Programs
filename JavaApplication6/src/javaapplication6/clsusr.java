package javaapplication6;

import java.util.ArrayList;

public class clsusr {
        private String usrnam;
        private String usrpwd;
        private static ArrayList<clsusr> arr;
        static
        {
            arr=new ArrayList<>();
        }
        public clsusr(String unam,String upwd)
        {
            usrnam=unam;
            usrpwd=upwd;
        }
        boolean regusr()  throws isemptyexp
        {
            for (clsusr x:arr)
            {
                if (this.usrnam.trim().equals(""))
                    throw new isemptyexp("Username cannot be empty");
                if(x.usrnam.equals(this.usrnam))
                    return false;
            }
            arr.add(this);
            return true;
        }
        static void displayuser()
        {
            for (clsusr x:arr)
                System.out.println("Username: "+x.usrnam+"      Userpassword: "+x.usrpwd);
        }
        boolean loginchk()
        {
            for(clsusr x:arr)
            {
                if(x.usrnam.equals(this.usrnam)&&x.usrpwd.equals(this.usrpwd))
                    return true;
            }
            return false;
        }
        boolean chgpwd(String newpwd)
        {
            if(loginchk()==true)
            {
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i).usrnam.equals(this.usrnam))
                    {
                        arr.get(i).usrpwd=newpwd;
                        return true;
                    }
                }
            }
            return false;
        }
}
        class isemptyexp extends Exception
        {
            public isemptyexp(String msg)
            {
                super(msg);
            }
}
