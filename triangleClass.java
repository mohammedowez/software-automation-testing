import java.util.Scanner;

public class triangleClass{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b,c;
        System.out.println("Enter 3 values");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        triangleClass t=new triangleClass();
        t.triangle(a,b,c);

    }
    public String triangle(int a,int b,int c)
    {

        boolean c1,c2,c3;
        char istriangle;
        do
        {

            System.out.println(a+b+c);
            c1 = (a>=1) && (a<=10);
            c2= (b>=1)&& (b<=10);
            c3= c>=1 && c<=10;
            if (!c1)
                System.out.println("\nthe value of a is not the range of permitted value");
            if (!c2)
                System.out.println("\nthe value of b is not the range of permitted value");
            if (!c3)
                System.out.println("\nthe value of c is not the range of permitted value");
        } while(!c1 && !c2 && !c3);

        // to check is it a triangle or not

        if( a<b+c && b<a+c && c<a+b )
            istriangle='y';
        else
            istriangle ='n';
        if (istriangle=='y')
        {
            if ((a==b) && (b==c))
            {
                System.out.println("equilateral triangle\n");
                return("equilateral");
            }
            else if ((a!=b) && (a!=c) && (b!=c))
            {
                System.out.println("scalene triangle\n");
                return("scalene");
            }
            else
            {
                System.out.println("isosceles triangle\n");
                return("isosceles");
            }}
        else {

            System.out.println("Not a triangle\n");
        }
        return("Not a triangle");

    }}