//method overloading in java
import java.io.*;
public class overloading
{
	public static void main(String[] args) {
	    shapes s1=new shapes();
	    shapes s2=new shapes();
	    s1.volume(20,30);
	    s2.volume(30);
		
	}
}
class shapes{
    void volume(int l,int b)
    {
        System.out.println("area of rectangle "+(l*b));
        
    }
    void volume(int r)
     {
        System.out.println("area of circle "+(3.14*r*r));
        
    }
    
    
}
