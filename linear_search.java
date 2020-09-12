import java.util.Scanner;

public class linear_search
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int search,n,i;
        int count=0;
        System.out.println("Enter the elements length");
        n=s.nextInt();
        int[] a=new  int[n];
        System.out.println("Enter the elements");
        for (i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched");
        search=s.nextInt();
        for (i=0;i<n;i++)
        {
            if (a[i]==search)
            {
                System.out.println(search+" found at location "+(i+1));
                count++;
            }
        }
        if (count==0)
        {
            System.out.println(search+" not found");
        }
        else
        {
            System.out.println(search+" found "+(count)+" times");
        }
    }
}
