import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("");
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
               System.out.print(j+""); 
            }
            
            System.out.println();
        }
        sc.close();
    }
}