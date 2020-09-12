import java.util.Scanner;

public class binary_s
{
    public static void main(String[] args)
    {
        int search,mid,first=0,last,n,i;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements lenght");
        n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for (i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched");
        search=s.nextInt();
        last=n-1;
        while (first<=last)
        {
            mid=(first+last)/2;
            if (a[mid]<search)
            {
                first=mid+1;

            }
            else if (a[mid]==search)
            {
                System.out.println(search+" found at location "+(mid+1));
                count++;
                break;
            }
            else
            {
                last=mid-1;
            }
        }
        if (count!=0)
        {
            System.out.println(search+" found "+(count+1)+" times");
        }

        if (first>last)
        {
            System.out.println(search+"not present");
        }
    }
}
