import java.util.Scanner;
class Sample
{
    public static int isPalindrome(int m)
    {
        int sum=0,r,temp=m;
        while(m>0)
        {
            r=m%10;
            sum=sum*10+r;
            m=m/10;
        }
        if(sum==temp)
          return 2;
        else
          return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        n=Math.abs(n);
        res=isPalindrome(n);
        System.out.println(res);
    }
}