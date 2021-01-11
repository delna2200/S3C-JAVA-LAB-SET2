import java.io.*;
public class inheritance2
{
	public static void main(String[] args) {
	    parent p=new parent();
	    child c=new child();
	    p.show1();
	    c.show2();
	    c.show1();
	
	}
}
class parent{
    void show1()
    {
        System.out.println("this is parent class.");
    }
}
class child extends parent{
    void show2()
    {
         System.out.println("this is  child class.");
    }
}