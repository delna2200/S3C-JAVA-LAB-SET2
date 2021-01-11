import java.io.*;
public class areaoftriangle
{
	public static void main(String[] args) {
		triangle t=new triangle();
	}
}
class triangle{
    triangle()
    {
        int a=3,b=4,c=5,perimeter,s;
        perimeter=a+b+c;
        System.out.println("perimeter"+perimeter);
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area"+area);
        }
    
        
    }
}
