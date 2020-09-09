import java.util.Scanner;
class insertionsort
{
  public static void main(String[] args)
  {
    int i,j,n,temp;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for (i=0;i<n ;i++ )
     {
       a[i]=s.nextInt();

    }
    for (i=1;i<n ;i++ )
     {
       temp=a[i];
       j=i-1;
       while (j>=0&&a[j]>temp)
        {
          a[j+1]=a[j];
          j--;

       }
       a[j+1]=temp;

    }
    System.out.println("another check korbona ");
    System.out.println("the elements after sort");
    for (i=0;i<n ;i++ )

     {
       System.out.println(a[i]);

    }

  }
}
