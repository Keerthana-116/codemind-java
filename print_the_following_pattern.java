import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        //System.out.println(5);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((char)(i+64)+" ");
            }
        System.out.println();
        }
    }
}