import java.util.Scanner;

public class Commi {

    public static void main(String[] args)
    {
        int locks,stocks,barrels;
        System.out.println("Enter values of locks, stocks, barrels");
        Scanner sc=new Scanner(System.in);
        locks=sc.nextInt();
        stocks=sc.nextInt();
        barrels=sc.nextInt();
        Commi c=new Commi();
        c.commis(locks,stocks,barrels);

    }
    public int  commis(int locks,int stocks,int barrels)
    {
        int tlocks,tstocks,tbarrels;
        boolean c1,c2,c3;
        int temp;
        double lprice, sprice,bprice,sales,comm;
        lprice=locks;
        tlocks=0;
        sprice=stocks;
        tstocks=0;
        bprice=barrels;
        tbarrels=0;

        c1=(locks<=1 || locks>70);
        c2=(stocks<=1 || stocks>80);
        c3=(barrels<=1 || barrels>90);
        if(c1)
        {
            System.out.println("Value of locks not in range");
            tlocks = locks;
        }
        else
        {
            temp=tlocks+locks;
            if(temp>70)
            {
                System.out.println("New locks value="+temp+" not in range 1-70");
            }
            else
                tlocks=temp;
        }
        System.out.println("Total locks="+tlocks);
        if(c2)
        {
            System.out.println("Value of stocks not in range");
            tstocks = stocks;
        }
        else
        {
            temp=tstocks+stocks;
            if(temp>80)
            {
                System.out.println("New stocks value="+temp+" not in range 1-80");
            }
            else
                tstocks=temp;
        }
        System.out.println("Total stocks="+tstocks);
        if(c3)
        {
            System.out.println("Value of barrels not in range");
            tbarrels = barrels;
        }
        else
        {
            temp=tbarrels+barrels;
            if(temp>90)
            {
                System.out.println("New barrels value="+temp+" not in range 1-90");
            }
            else
                tbarrels=temp;
        }
        System.out.println("Total barrels="+barrels);

        sales=lprice*tlocks+sprice*tstocks+bprice*tbarrels;
        System.out.println("Total sales="+sales);
        if(sales>0)
        {
            if(sales>1800.0)
            {
                comm=0.10*1000;
                comm=comm+0.15*800;
                comm=comm+0.20*(sales-1800);
            }
            else if(sales>1000)
            {
                comm=0.10*1000;
                comm=comm+0.15*(sales-1000);
            }
            else
            {
                comm=0.10*sales;
            }
            System.out.println("commission amount is "+comm);
            return (int) comm;
        }
        else
            System.out.println("No sales");
        return (int)sales;
    }
}