#include "iostream"
using namespace std;
int main()
{
  int temp,i,j,n;
  std::cout << "Enter the length" << '\n';
  std::cin >> n;
  int a[n];
  std::cout << "Entr the elemnts" << '\n';
  for(i=0;i<n;i++)
  {
    std::cin >> a[i];
  }
  for(i=1;i<n;i++)
  {
    temp=a[i];
    j=i-1;
    while (j>=0&&a[j]>temp)
     {
       a[j+1]=a[j];
       j--;
      /* code */
    }
    a[j+1]=temp;
  }
  std::cout << "The sorted list" << '\n';
  for(i=0;i<n;i++)
  {
    std::cout << a[i] << " ";
  }
  std::cout << "all is well" << '\n';
}
