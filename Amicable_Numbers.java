import java.util.Scanner;
class AmicableNumber
{  
    public static void main(String args[])   
    {
        Scanner sc = new Scanner(System.in);
        int n,m,n1=0,n2=0;
        n= sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (n% i == 0)
            n1 = n1+i;
        }
        for (int i = 1; i <= m; i++)
        {
            if (m % i == 0)
            n2 = n2+i;
            
        }
        if (n1 == n2)
           System.out.println("Amicable");  
        else
           System.out.println("Not Amicable");
    }
}