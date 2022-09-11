import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        j=sc.nextInt();
        for(i=1;i<=j;i++)
        {
            if(i%2!=0)
            System.out.println(n+ " x " +i+ " = " + (n*i));
        }
        sc.close();
    }
}