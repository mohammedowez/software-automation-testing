import java.util.*;
public class nextdatepgm
{
    public static boolean check(int day,int month)
    {
        if((month==4||month==6||month==9 ||month==11) && day==31)
            return true;
        else
            return false;
    }
    public static  boolean isleap(int year)
    {
        if((year%4==0 && year%100!=0) || year%400==0)
            return true;
        else
            return false;
    }
    public static void  main(String args[])
    {
        int day,month,year,tomm_day = 0,tomm_month,tomm_year;
        char flag;
        do
        {
            flag='y';
            System.out.println("\nenter the today's date in the form of dd mm yyyy\n");
            Scanner in=new Scanner(System.in);
            day=in.nextInt();
            month=in.nextInt();
            year=in.nextInt();
            in.close();
            tomm_month=month;
            tomm_year= year;
            if(day<1 || day>31)
            {
                System.out.println("value of day, not in the range 1...31\n");
                flag='n';
                break;
            }
            if(month<1 || month>12)
            {
                System.out.println("value of month, not in the range 1....12\n");
                flag='n';
                break;
            }
            else if(check(day,month))
            {
                System.out.println("value of day, not in the range day<=30");
                flag='n';
                break;
            }
            if(year<=1812 || year>2018)
            {
                System.out.println("value of year, not in the range 1812.......	2013\n");
                flag='n';
                break;
            }
            if(month==2)
            {
                if(isleap(year) && day>29)
                {
                    System.out.println("invalid date input for leap year");
                    flag='n';
                    break;
                }
                else if(!(isleap(year))&& day>28)
                {
                    System.out.println("invalid date input for not a leap year");
                    flag='n';
                    break;
                }
            }
        }while(flag=='n');
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:if(day<31)
                tomm_day=day+1;
            else
            {
                tomm_day=1;
                tomm_month=month+1;
            }
                break;
            case 4:
            case 6:
            case 9:
            case 11: if(day<30)
                tomm_day=day+1;
            else
            {
                tomm_day=1;
                tomm_month=month+1;
            }
                break;
            case 12: if(day<31)
                tomm_day=day+1;
            else
            {
                tomm_day=1;
                tomm_month=1;
                if(year==2018)
                {
                    System.out.println("the next day is out of boundary value of year\n");
                    tomm_year=year+1;
                }
                else
                    tomm_year=year+1;
            }
                break;
            case 2:
                if(day<28)
                    tomm_day=day+1;
                else if(isleap(year)&& day==28)
                    tomm_day=day+1;
                else if(day==28 || day==29)
                {
                    tomm_day=1;
                    tomm_month=3;
                }
                break;
        }
        if(flag=='y')
            System.out.println("next day is:"+tomm_day+" "+tomm_month+" "+tomm_year+" ");
    }
}