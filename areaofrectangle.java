import java.util.Scanner;
public class areaofrectangle
{
	public static void main(String[] args) {
	    int length,breadth;
		System.out.println("enter the length:");
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
	    System.out.println("enter the breadth:");
		Scanner s=new Scanner(System.in);
		breadth=s.nextInt();
		area rec=new area(length,breadth);
		rectangle r1=new rectangle();
		r1.returnarea(length,breadth);
	   
		
	}
}
class area{
    area(int length,int breadth)
    {
        System.out.println("length"+length);
        System.out.println("breadth"+breadth);
    }
}
class rectangle{
    void returnarea(int length,int breadth)
    {
        int area=length*breadth;
        System.out.println("area"+area);
    }
}