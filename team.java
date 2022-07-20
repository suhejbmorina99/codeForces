
import java.util.Scanner;
public class team 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int ctr=0,s=0;
        int[] a = new int[3];
        int[] b = new int[1001];
        for(int i=1;i<=x;i++)
        {
            for(int j=0;j<=2;j++)
            {
                a[j]=scan.nextInt();
                s=a[0]+a[1]+a[2];
            }
            b[i]=s;
                if(b[i]>=2)
                    ctr++;
        }
        System.out.println(ctr);
    }
}