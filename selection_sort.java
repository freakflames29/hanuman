import java.util.Scanner;
class selection_sort
{
  public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
     int min,loc,i,j,n,temp;
     System.out.println("Enter the elements length");
     n=s.nextInt();
     int[] a=new int[n];
     /*ss*/

     System.out.println("Enter the elements");
     for(i=0;i<n;i++)
     {
       a[i]=s.nextInt();
     }
     for (i=0;i<n-1 ;i++ )
      {
        min=a[i];
        loc=i;
        for (j=i+1;j<n;j++ )
         {
           if (a[j]<min)
            {
              min=a[j];
              loc=j;

           }


        }
        temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;

     }
     System.out.println("The elements after selection sort");
     for (i=0;i<n;i++ )
      {
        System.out.println(a[i]);

     }

  }
}
